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
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_CREDENTIALS;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.identity.v3.CredentialService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Credential;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneCredential;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneCredential.Credentials;

public class CredentialServiceImpl extends BaseIdentityServices implements CredentialService {

    @Override
    public Credential create(Credential credential) {
        checkNotNull(credential);
        return post(KeystoneCredential.class, uri(PATH_CREDENTIALS)).entity(credential).execute();
    }

    @Override
    public Credential create(String blob, String type, String projectId, String userId) {
        checkNotNull(blob);
        checkNotNull(type);
        checkNotNull(projectId);
        checkNotNull(userId);
        return create(KeystoneCredential.builder().blob(blob).type(type).projectId(projectId).userId(userId).build());
    }

    @Override
    public Credential get(String credentialId) {
        checkNotNull(credentialId);
        return get(KeystoneCredential.class, PATH_CREDENTIALS, "/", credentialId).execute();
    }

    @Override
    public Credential update(Credential credential) {
        checkNotNull(credential);
        return patch(KeystoneCredential.class, PATH_CREDENTIALS, "/", credential.getId()).entity(credential).execute();
    }

    @Override
    public ActionResponse delete(String credentialId) {
        checkNotNull(credentialId);
        return deleteWithResponse(PATH_CREDENTIALS, "/", credentialId).execute();
    }

    @Override
    public List<? extends Credential> list() {
        return get(Credentials.class, uri(PATH_CREDENTIALS)).execute().getList();
    }

}
