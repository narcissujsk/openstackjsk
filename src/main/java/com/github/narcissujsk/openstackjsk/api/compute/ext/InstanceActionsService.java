package com.github.narcissujsk.openstackjsk.api.compute.ext;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.compute.InstanceAction;

/**
 * API to list executed instance actions.
 * 
 * @author Christian Banse
 */
public interface InstanceActionsService extends RestService {

    /**
     * List the executed actions on the specified {@code serverId}
     *
     * @param serverId
     *            the server id
     * @return List of instance actions
     */
    List<? extends InstanceAction> list(String serverId);

    /**
     * Shows information about a specified instance action
     *
     * @param serverId
     *            the server id
     * @param requestId
     *            the request identifier
     * @return the instance action
     */
    InstanceAction get(String serverId, String requestId);

}
