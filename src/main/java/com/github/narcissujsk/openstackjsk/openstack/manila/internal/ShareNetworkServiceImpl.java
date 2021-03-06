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
package com.github.narcissujsk.openstackjsk.openstack.manila.internal;

import com.github.narcissujsk.openstackjsk.api.manila.ShareNetworkService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.ShareNetwork;
import com.github.narcissujsk.openstackjsk.model.manila.ShareNetworkCreate;
import com.github.narcissujsk.openstackjsk.model.manila.ShareNetworkUpdateOptions;
import com.github.narcissujsk.openstackjsk.model.manila.builder.ShareNetworkCreateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaShareNetwork;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaShareNetworkCreate;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaShareNetworkUpdate;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.actions.SecurityServiceAction;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ShareNetworkServiceImpl extends BaseShareServices implements ShareNetworkService {
    /**
     * {@inheritDoc}
     */
    @Override
    public ShareNetwork create(ShareNetworkCreate shareNetworkCreate) {
        checkNotNull(shareNetworkCreate);
        return post(ManilaShareNetwork.class, uri("/share-networks"))
                .entity(shareNetworkCreate)
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends ShareNetwork> list() {
        return list(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends ShareNetwork> listDetails() {
        return list(true);
    }

    private List<? extends ShareNetwork> list(boolean detail) {
        return get(ManilaShareNetwork.ShareNetworks.class, uri("/share-networks" + (detail ? "/detail" : "")))
                .execute()
                .getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareNetwork get(String shareNetworkId) {
        checkNotNull(shareNetworkId);
        return get(ManilaShareNetwork.class, uri("/share-networks/%s", shareNetworkId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareNetwork update(String shareNetworkId, ShareNetworkUpdateOptions shareNetworkUpdateOptions) {
        checkNotNull(shareNetworkId);
        checkNotNull(shareNetworkUpdateOptions);

        return put(ManilaShareNetwork.class, uri("/share-networks/%s", shareNetworkId))
                .entity(ManilaShareNetworkUpdate.fromOptions(shareNetworkUpdateOptions))
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String shareNetworkId) {
        checkNotNull(shareNetworkId);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/share-networks/%s", shareNetworkId)).executeWithResponse());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareNetwork addSecurityService(String shareNetworkId, String securityServiceId) {
        checkNotNull(shareNetworkId);
        checkNotNull(securityServiceId);

        return invokeSecurityServiceAction(shareNetworkId, SecurityServiceAction.add(securityServiceId));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareNetwork removeSecurityService(String shareNetworkId, String securityServiceId) {
        checkNotNull(shareNetworkId);
        checkNotNull(securityServiceId);

        return invokeSecurityServiceAction(shareNetworkId, SecurityServiceAction.remove(securityServiceId));
    }

    private ShareNetwork invokeSecurityServiceAction(String shareNetworkId, SecurityServiceAction action) {
        return post(ManilaShareNetwork.class, uri("/share-networks/%s/action", shareNetworkId))
                .entity(action)
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShareNetworkCreateBuilder shareNetworkCreateBuilder() {
        return ManilaShareNetworkCreate.builder();
    }
}
