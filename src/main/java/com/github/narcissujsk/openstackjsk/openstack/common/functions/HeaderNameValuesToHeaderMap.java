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
package com.github.narcissujsk.openstackjsk.openstack.common.functions;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.common.header.HeaderNameValue;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

/**
 * Transforms a List of HeaderNameValue objects into a Header compatible Map
 * 
 * @author Jeremy Unruh
 */
public class HeaderNameValuesToHeaderMap implements Function<List<HeaderNameValue>, Map<String, Object>> {

    public static HeaderNameValuesToHeaderMap INSTANCE = new HeaderNameValuesToHeaderMap();
    
    @Override
    public Map<String, Object> apply(List<HeaderNameValue> input) {
        Map<String, Object> result = Maps.newHashMap();
        
        for (HeaderNameValue nv : input) {
            result.put(nv.getName(), nv.getValue());
        }
        return result;
    }

}
