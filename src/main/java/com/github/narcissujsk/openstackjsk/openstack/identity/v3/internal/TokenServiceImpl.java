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
package com.github.narcissujsk.openstackjsk.openstack.identity.v3.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.*;

import com.github.narcissujsk.openstackjsk.api.identity.v3.TokenService;

import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Domain;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Project;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Service;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Token;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneDomain.Domains;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneProject.Projects;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneService.Catalog;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneToken;

import java.util.List;

public class TokenServiceImpl extends BaseIdentityServices implements TokenService {

    @Override
    public Token get(String tokenId) {
        checkNotNull(tokenId);
        return get(KeystoneToken.class, PATH_TOKENS).header(HEADER_X_SUBJECT_TOKEN, tokenId).execute();
    }

    @Override
    public ActionResponse check(String tokenId) {
        checkNotNull(tokenId);
        return head(ActionResponse.class, PATH_TOKENS).header(HEADER_X_SUBJECT_TOKEN, tokenId).execute();
    }

    @Override
    public ActionResponse delete(String tokenId) {
        checkNotNull(tokenId);
        return deleteWithResponse(PATH_TOKENS).header(HEADER_X_SUBJECT_TOKEN, tokenId).execute();
    }

    @Override
    public List<? extends Service> getServiceCatalog(String tokenId) {
        checkNotNull(tokenId);
        return get(Catalog.class, uri(PATH_SERVICE_CATALOGS)).header(HEADER_X_SUBJECT_TOKEN, tokenId).execute().getList();
    }

    @Override
    public List<? extends Project> getProjectScopes(String tokenId) {
        checkNotNull(tokenId);
        return get(Projects.class, uri(PATH_PROJECT_SCOPES)).header(HEADER_X_SUBJECT_TOKEN, tokenId).execute().getList();
    }

    @Override
    public List<? extends Domain> getDomainScopes(String tokenId) {
        checkNotNull(tokenId);
        return get(Domains.class, uri(PATH_DOMAIN_SCOPES)).header(HEADER_X_SUBJECT_TOKEN, tokenId).execute().getList();
    }

}
