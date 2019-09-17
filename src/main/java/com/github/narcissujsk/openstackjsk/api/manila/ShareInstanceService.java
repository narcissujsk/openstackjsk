package com.github.narcissujsk.openstackjsk.api.manila;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.ShareInstance;

import java.util.List;

/**
 * Share Instance Service for Manila Shared Filesystems.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareInstanceService extends RestService {
    /**
     * Lists all share instances.
     *
     * @return a list of all share instances
     */
    List<? extends ShareInstance> list();

    /**
     * Shows details for a share instance.
     *
     * @param shareInstanceId the share instance ID
     * @return the share instance or null if not found
     */
    ShareInstance get(String shareInstanceId);

    /**
     * Administrator only. Explicitly updates the state of a share instance.
     *
     * @param shareInstanceId the share instance ID
     * @param status the status to set
     * @return the action response
     */
    ActionResponse resetState(String shareInstanceId, ShareInstance.Status status);

    /**
     * Administrator only. Force-deletes a share instance.
     *
     * @param shareInstanceId the share instance ID
     * @return the action response
     */
    ActionResponse forceDelete(String shareInstanceId);
}
