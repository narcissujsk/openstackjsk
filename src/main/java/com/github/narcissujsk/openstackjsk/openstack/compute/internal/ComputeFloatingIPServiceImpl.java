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
package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ComputeFloatingIPService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.FloatingIP;
import com.github.narcissujsk.openstackjsk.model.compute.Server;
import com.github.narcissujsk.openstackjsk.openstack.common.MapEntity;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaFloatingIP;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaFloatingIP.NovaFloatingIPs;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaFloatingIPPools;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.actions.FloatingIpActions;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;

/**
 * OpenStack Floating-IP API Implementation
 *
 * @author Nathan Anderson
 */
public class ComputeFloatingIPServiceImpl extends BaseComputeServices implements ComputeFloatingIPService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends FloatingIP> list() {
        return get(NovaFloatingIPs.class, uri("/os-floating-ips")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getPoolNames() {
        return get(NovaFloatingIPPools.class, uri("/os-floating-ip-pools")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FloatingIP allocateIP(String pool) {
        return post(NovaFloatingIP.class, uri("/os-floating-ips")).entity(MapEntity.create("pool", pool))
                .execute(ExecutionOptions.<NovaFloatingIP>create(PropagateOnStatus.on(404)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse deallocateIP(String id) {
        checkNotNull(id);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/os-floating-ips/%s", id)).executeWithResponse()
                );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse addFloatingIP(Server server, String fixedIpAddress, String ipAddress) {
        checkNotNull(server);
        checkNotNull(ipAddress);

        return invokeAction(server.getId(), FloatingIpActions.Add.create(ipAddress, fixedIpAddress));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse addFloatingIP(Server server, String ipAddress) {
        return addFloatingIP(server, null,  ipAddress);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse removeFloatingIP(Server server, String ipAddress) {
        checkNotNull(server);
        checkNotNull(ipAddress);

        return invokeAction(server.getId(), FloatingIpActions.Remove.create(ipAddress));
    }

    /**
     * {@inheritDoc}
     */
	  @Override
	  public ActionResponse addFloatingIP(String serverId, String fixedIpAddress, String ipAddress) {
		    checkNotNull(serverId);
        checkNotNull(ipAddress);
        return invokeAction(serverId, FloatingIpActions.Add.create(ipAddress, fixedIpAddress));
    }

    /**
     * {@inheritDoc}
     */
	  @Override
	  public ActionResponse addFloatingIP(String serverId, String ipAddress) {
		    return addFloatingIP(serverId, null,  ipAddress);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse removeFloatingIP(String serverId, String ipAddress) {
        checkNotNull(serverId);
        checkNotNull(ipAddress);

        return invokeAction(serverId, FloatingIpActions.Remove.create(ipAddress));
    }


}
