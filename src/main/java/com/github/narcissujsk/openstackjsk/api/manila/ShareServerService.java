package com.github.narcissujsk.openstackjsk.api.manila;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.ShareServer;

import java.util.List;

/**
 * Share Server Service for Manila Shared Filesystems.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareServerService extends RestService {
    /**
     * Lists all share servers.
     *
     * @return a list containing all share servers
     */
    List<? extends ShareServer> list();

    /**
     * Shows details for a share server.
     *
     * @param shareServerId the share server ID
     * @return the share server or null if not found
     */
    ShareServer get(String shareServerId);

    /**
     * Deletes a share server.
     *
     * @param shareServerId the share server ID
     * @return the action response
     */
    ActionResponse delete(String shareServerId);
}
