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
package com.github.narcissujsk.openstackjsk.openstack.storage.block.domain;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * A request entity used for accepting a volume transfer
 * 
 * @author Jeremy Unruh
 */
@JsonRootName("accept")
public class CinderVolumeTransferAccept implements ModelEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("auth_key")
    private String authKey;
    
    public CinderVolumeTransferAccept() { }
    
    private CinderVolumeTransferAccept(String authKey) {
        this.authKey = authKey;
    }
    
    public static CinderVolumeTransferAccept create(String authKey) {
        return new CinderVolumeTransferAccept(authKey);
    }
    
}
