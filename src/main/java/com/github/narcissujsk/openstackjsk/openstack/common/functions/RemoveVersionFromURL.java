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

import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.URI_SEP;

import com.google.common.base.Function;

/**
 * A function that removes the API version from the tail end of a URL as well as any trailing "/".
 * <p:
 * Examples:<br>
 * https://vcloud.test.com:2323/v2.0 would return https://vcloud.test.com:2323<br>
 * http://someurl:2321/ would return http://someurl:2321<br>
 * <p>
 * NOTE: This only removes the tail end of the path if it contains a version
 * 
 * @author Jeremy Unruh
 */
public class RemoveVersionFromURL implements Function<String, String> {

    public static final String VERSION_REGEX = "/v[0-9]+(\\.[0-9])*";
    public static final RemoveVersionFromURL INSTANCE = new RemoveVersionFromURL();
    
    @Override
    public String apply(String url) {
        String result = url.replaceFirst(VERSION_REGEX, "");
        if (result.endsWith(URI_SEP))
            return result.substring(0, result.length() - 1);
        return result;
    }
    
    public String removeAndApply(String url, String version) {
        if (url == null)
            return url;
        
        return apply(url).concat(version);
    }

}
