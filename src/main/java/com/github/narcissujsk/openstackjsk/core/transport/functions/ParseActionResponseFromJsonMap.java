/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.core.transport.functions;

import java.util.Map;

import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;

import com.google.common.base.Function;

/**
 * Attempts to Parse a JSON Map created from an error response and map the message to an ActionResponse.  
 * 
 * @author Jeremy Unruh
 */
public class ParseActionResponseFromJsonMap implements Function<Map<String, Object>, ActionResponse>{

    private static final String KEY_MESSAGE = "message";
    private static final String NEUTRON_ERROR = "NeutronError";
    private static final String OCTAVIA_ERROR = "faultstring";
    private static final String COMPUTE_FAULT = "computeFault";
    private static final String TACKER_ERROR = "TackerError";
    private HttpResponse response;
    
    public ParseActionResponseFromJsonMap(HttpResponse response) {
        this.response = response;
    }
    
    /**
     * Parses the JSON Map for an Error message.  An OpenStack error response typically is a Map of Map containing a single key
     * which is "error", "badRequest", etc which contains a value of another Map containing the underlying message
     * 
     * @param map the JSON Map 
     * @return ActionResponse or null if the map could not be parsed
     */
    @SuppressWarnings("unchecked")
    @Override
    public ActionResponse apply(Map<String, Object> map) {
        if (map == null || map.isEmpty())
            return null;
        
        for (String key : map.keySet()) {
            if (map.get(key) == null) {
                continue;
            }

            if (Map.class.isAssignableFrom(map.get(key).getClass())) {
                Map<String, Object> inner = (Map<String, Object>) map.get(key);
                if (inner.containsKey(KEY_MESSAGE)) {
                    String msg = String.valueOf(inner.get(KEY_MESSAGE));
                    return ActionResponse.actionFailed(msg, response.getStatus());
                }
                if (inner.containsKey(NEUTRON_ERROR)) {
                    String msg = String.valueOf(inner.get(NEUTRON_ERROR));
                    return ActionResponse.actionFailed(msg, response.getStatus());
                }
                if (inner.containsKey(COMPUTE_FAULT)) {
                	/** For 'computeFault' Error Message Propagation.. */
                    String msg = String.valueOf(map.get(COMPUTE_FAULT));
                    return ActionResponse.actionFailed(msg, response.getStatus());
                 }
                if (inner.containsKey(TACKER_ERROR)) {
                	/** For 'TackerError' Error Message Propagation.. */
                    String msg = String.valueOf(inner.get(TACKER_ERROR));
                    return ActionResponse.actionFailed(msg, response.getStatus());
                }
            }
        }

        // Try with Sahara fault response which is just a plain Map
        // { "error_name": "error name",
        //   "error_message": "error message",
        //   "error_code": XXX }
        if (map.containsKey("error_message")) {
           String msg = String.valueOf(map.get("error_message"));    
           return ActionResponse.actionFailed(msg, response.getStatus());
        }
        
        // Neutron error handling when just a message is present
        if (map.containsKey(NEUTRON_ERROR)) {
            String msg = String.valueOf(map.get(NEUTRON_ERROR));
            return ActionResponse.actionFailed(msg, response.getStatus());
        }

        // Neutron error handling when just a message is present
        if (map.containsKey(OCTAVIA_ERROR)) {
            String msg = String.valueOf(map.get(OCTAVIA_ERROR));
            return ActionResponse.actionFailed(msg, response.getStatus());
        }

        return null;
    }

}
