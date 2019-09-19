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
package com.github.narcissujsk.openstackjsk.openstack.barbican.internal;

import com.google.common.collect.ImmutableMap;
import com.github.narcissujsk.openstackjsk.api.barbican.SecretService;
import com.github.narcissujsk.openstackjsk.model.barbican.Secret;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanSecret;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanSecret.Secrets;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by reneschollmeyer on 02.08.17.
 *
 * {@inheritDoc}
 */
public class SecretServiceImpl extends BaseBarbicanServices implements SecretService {

    private static final String RESOURCE_PATH = "/secrets";
    private static final String SPECIFIC_RESOURCE_PATH = RESOURCE_PATH + "/%s";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Secret> list(Map<String, String> filteringParams) {
        Invocation<Secrets> req = get(Secrets.class, uri(RESOURCE_PATH));
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                req = req.param(entry.getKey(), entry.getValue());
            }
        }
        return req.execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Secret> list(final String name) {
        return list(ImmutableMap.of("name", name));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Secret get(String secretId) {
        checkNotNull(secretId);
        return get(BarbicanSecret.class, uri(SPECIFIC_RESOURCE_PATH, secretId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String secretId) {
        checkNotNull(secretId);
        return deleteWithResponse(uri(SPECIFIC_RESOURCE_PATH, secretId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Secret create(Secret secret) {
        checkNotNull(secret);
        return post(BarbicanSecret.class, uri(RESOURCE_PATH)).entity(secret).execute();
    }
}
