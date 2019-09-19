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
package com.github.narcissujsk.openstackjsk.api.compute.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.InterfaceAttachment;

/**
 * API to Create, list, get details for, and delete port interfaces on a Server Instance
 * 
 * @author Jeremy Unruh
 */
public interface InterfaceService extends RestService {

    /**
     * Creates and uses a port interface to attach the port to a server instance.
     * 
     * @param serverId the server id
     * @param portId the port id to attach
     * @return the attached interface
     */
    InterfaceAttachment create(String serverId, String portId);
    
    /**
     * List the port interfaces for the specified {@code serverId}
     * @param serverId the server id
     * @return List of interface attachments
     */
    List<? extends InterfaceAttachment> list(String serverId);
    
    /**
     * Shows information about a specified port interface
     * 
     * @param serverId the server id
     * @param attachmentId the attachment identifier
     * @return the interface attachment
     */
    InterfaceAttachment get(String serverId, String attachmentId);
    
    /**
     * Detaches a specified port interface
     * 
     * @param serverId the server id
     * @param attachmentId the attachment identifier
     * @return the action response indicating success or failure
     */
    ActionResponse detach(String serverId, String attachmentId);
    
}
