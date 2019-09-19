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
package com.github.narcissujsk.openstackjsk.model.identity.v3;

import java.util.Date;
import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.identity.AuthStore;
import com.github.narcissujsk.openstackjsk.model.identity.AuthVersion;

import com.google.common.collect.SortedSetMultimap;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Domain;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Project;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Role;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Service;
import com.github.narcissujsk.openstackjsk.model.identity.v3.User;

/**
 * V3 token model
 *
 * @see <a href="http://developer.openstack.org/api-ref-identity-v3.html#tokens-v3">API reference</a>
 */
public interface Token extends ModelEntity {

    /**
     * @return the id of the token
     */
    String getId();

    /**
     * @return the catalog of the token
     */
    List<? extends Service> getCatalog();

    /**
     * @return the timestamp when the token expires
     */
    Date getExpires();

    /**
     * @return the timestamp when the token was issued
     */
    Date getIssuedAt();

    /**
     * @return the project of the token
     */
    Project getProject();

    /**
     * @return the domain of the token
     */
    Domain getDomain();

    /**
     * @return the User of the token
     */
    User getUser();

    /**
     * @return the authentication store
     */
    AuthStore getCredentials();

    /**
     * @return the endpoint
     */
    String getEndpoint();

    /**
     * @return the list of roles
     */
    List<? extends Role> getRoles();

    /**
     * @return the list of audit identifiers
     */
    List<String> getAuditIds();

    /**
     * @return the methods of the token
     */
    List<String> getMethods();

    /**
     * @return the authentication version
     */
    AuthVersion getVersion();

    /**
     * @return the internal UUID used for cache lookups
     */
    String getCacheIdentifier();

    /**
     * sets the id of the token from response header value
     *
     * @param id the token id
     */
    void setId(String id);

    /**
     * A Lazy loading Aggregated Service Catalog Mapping.  The key is a stripped version service type or name with a collection
     * of Services sorted by version
     *
     * @return sorted aggregate service catalog
     */
    SortedSetMultimap<String, Service> getAggregatedCatalog();

}
