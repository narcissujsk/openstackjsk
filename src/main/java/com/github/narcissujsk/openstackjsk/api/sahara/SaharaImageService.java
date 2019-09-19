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
package com.github.narcissujsk.openstackjsk.api.sahara;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.Image;

/**
 * Sahara Data Processing Operations
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */
public interface SaharaImageService extends RestService {

    /**
     * List all images
     * 
     * @return list of images or empty
     */
     List<? extends Image> list();

    /**
     * List images with specified tag(s)
     *
     * @param tags one or more tags 
     * @return list of images or empty
     */
     List<? extends Image> list(String... tags);

    /**
     * Get an image by ID
     * @param imageId the image identifier
     * @return the image or null if not found
     */
     Image get(String imageId);

    /**
     * Register a new image into Sahara image registry
     * 
     * @param imageId the image to register
     * @param username the username
     * @param description the description
     * @return the registered image
     */
     Image register(String imageId, String username, String description);

    /**
     * Unregister the specified image from Sahara image registry
     * 
     * @param imageId the image identifier
     * @return the action response
     */
     ActionResponse unregister(String imageId);

    /**
     * Add Tag(s) to image
     * 
     * @param tags one or more tags to add
     * @return the image
     */
     Image tag(String imageId, String... tags);

    /**
     * Remove Tag(s) from image
     * 
     * @param tags one or more tags to remove
     * @return the image
     */
     Image untag(String imageId, String... tags);
}
