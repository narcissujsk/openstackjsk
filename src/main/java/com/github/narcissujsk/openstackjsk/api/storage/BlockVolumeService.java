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
package com.github.narcissujsk.openstackjsk.api.storage;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.storage.BlockVolumeTransferService;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.storage.block.Volume;
import com.github.narcissujsk.openstackjsk.model.storage.block.VolumeType;
import com.github.narcissujsk.openstackjsk.model.storage.block.VolumeUploadImage;
import com.github.narcissujsk.openstackjsk.model.storage.block.options.UploadImageData;

/**
 * Manages Volumes and Volume Type based operations against Block Storage (Cinder)
 * 
 * @author Jeremy Unruh
 */
public interface BlockVolumeService extends RestService {

	/**
	 *  The volume type defines the characteristics of a volume
	 *  
	 * @return List of VolumeType entities
	 */
	List<? extends VolumeType> listVolumeTypes();

    /**
     * Deletes the specified VolumeType
     * 
     * @param volumeTypeId
     *            the volume type identifier
     */
    void deleteVolumeType(String volumeTypeId);

    /**
     * Creates a new volume type with the specified name
     * 
     * @param volumeType
     *            the volumeType for create
     * @return the created volume type
     */
    VolumeType createVolumeType(VolumeType volumeType);

	/**
	 * Lists summary information for all Block Storage volumes that the tenant who submits the request can access.
	 * 
	 * @return List of Volumes
	 */
	List<? extends Volume> list();

	/**
	 * Returns list of Block Storage volumes filtered by parameters.
	 * 
	 * @param filteringParams map (name, value) of filtering parameters
	 * @return 
	*/
	List<? extends Volume> list(Map<String, String> filteringParams);

	/**
	 * Gets a Block Storage volume by ID
	 * @param volumeId the volume identifier
	 * @return the volume or null if not found
	 */
	Volume get(String volumeId);
	
	/**
	 * Deletes the specified volume
	 * 
	 * @param volumeId the volume identifier
	 * @return the action response
	 */
	ActionResponse delete(String volumeId);

	/**
	 * Attempt forced removal of volume, regardless of the state.
	 * It's dangerous but useful. It's not 100% success.
	 * 
	 * @param volumeId the volume id
	 * @return the action response
	 */
	ActionResponse forceDelete(String volumeId);

	/**
	 * Resets the specified volume status.
	 *
	 * @param volumeId the volume id
	 * @param status new volume status
	 * @return the action response
	 */
	ActionResponse resetState(String volumeId, Volume.Status status);

	/**
	 * Extends the specified volume size.
	 *
	 * @param volumeId the volume id
	 * @param newSize new volume size
	 * @return the action response
	 */
	ActionResponse extend(String volumeId, Integer newSize);

	/**
	 * Creates a new Block Storage Volume
	 * @param volume the volume for create
	 * @return the created volume
	 */
	Volume create(Volume volume);
	
	/**
	 * Uploads a volume to the image service
	 * 
	 * @param volumeId the volume identifier to upload
	 * @param data the data about the volume being uploaded (required)
	 * @return the volume upload image containing the current status
	 */
	VolumeUploadImage uploadToImage(String volumeId, UploadImageData data);
	
	/**
	 * OpenStack only allows name or description to be updated. This call enforces that based on the API docs.
	 * 
	 * @param volumeId the volume id
	 * @param name the name to update (null indicates no name update)
	 * @param description the description to update (null indicates no description update)
	 * @return the action response
	 */
	ActionResponse update(String volumeId, String name, String description);

	/**
	 * migrate a volume to another host and service
	 *
	 * @param volumeId the volume id
	 * @param forceHostCopy
	 * @param hostService the destination host and service ,like kvmnode002021.cnsuning.com@lvmdriver
	 * @return the action response
	 */
	ActionResponse migrate(String volumeId, String hostService, boolean forceHostCopy);
	
	/**
	 * Returns the API used to transfer a Volume from one tenant/project to another
	 * 
	 * @return the volume transfer service
	 */
	BlockVolumeTransferService transfer();

	/**
	 * Updates volume read-only access-mode flag
	 *
	 * @param volumeId ID of volume to update
	 * @param readonly enables or disables update of volume to read-only access mode
	 * @return the action response
	 */
	ActionResponse readOnlyModeUpdate(String volumeId, boolean readonly);
	
	/**
	 * 
	 * <br/>Description:Attaches a volume to a server.
	 * You should set instance_uuid or host_name.
	 * Volume status must be available.
	 * <p>Author:Wang Ting/王婷</p>
	 * @param volumeId
	 * @param instanceId
	 * @param mountpoint
	 * @param hostName
	 * @return
	 */
	ActionResponse attach(String volumeId, String instanceId, String mountpoint, String hostName);

	/**
	 * 
	 * <br/>Description:Forces a volume to detach.
	 * <p>Author:Wang Ting/王婷</p>
	 * @param volumeId
	 * @param initiator
	 * @param attachmentId
	 * @return
	 */
	ActionResponse forceDetach(String volumeId, String initiator, String attachmentId);
  
	/**
	 * Detach volume from server
	 * @author capitek-xuning（首信科技-徐宁）
	 * @param volumeId
	 * @param attachmentId
	 * @return
	 */
	ActionResponse detach(String volumeId, String attachmentId);

	/**
	 * Update volume bootable status.
	 *
	 * @param volumeId the volume id
	 * @param bootable Enables or disables the bootable attribute
	 * @return the action response
	 */
	ActionResponse bootable(String volumeId, Boolean bootable);
}
