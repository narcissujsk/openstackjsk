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
package com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Role;
import com.github.narcissujsk.openstackjsk.model.identity.v3.RoleAssignment;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.RoleBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import java.util.List;
import java.util.Map;

/**
 * v3 role assignment implementation
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeystoneRoleAssignment implements RoleAssignment {

    private static final long serialVersionUID = 1L;

    private String roleId;

    private String userId;

    private String groupId;

    private String domainId;

    private String projectId;

    private Map<String, String> links;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoleId() {
        return roleId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getUserId() {
        return userId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getGroupId() {
        return groupId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDomainId() {
        return domainId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProjectId() {
        return projectId;
    }

    @JsonProperty("user")
    public void setUser(Map<String, Object> user) {
        userId = (String) user.get("id");
    }

    @JsonProperty("role")
    public void setRole(Map<String, Object> role) {
        roleId = (String) role.get("id");
    }

    @JsonProperty("group")
    public void setGroup(Map<String, Object> group) {
        groupId = (String) group.get("id");
    }

    @JsonProperty("scope")
    public void setScope(Map<String, Object> group) {
        Map<String, String> projectScope = (Map<String, String>) group.get("project");
        if (projectScope != null) {
            projectId = projectScope.get("id");
        }
        Map<String, String> domainScope = (Map<String, String>) group.get("domain");
        if (domainScope != null) {
            domainId = domainScope.get("id");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("roleId", roleId)
                .add("groupId", groupId)
                .add("userId", userId)
                .add("projectId", projectId)
                .add("domainId", domainId)
                .add("links", links)
                .toString();
    }

    public static class RoleAssignments extends ListResult<KeystoneRoleAssignment> {
        private static final long serialVersionUID = 1L;
        @JsonProperty("role_assignments")
        protected List<KeystoneRoleAssignment> list;

        @Override
        public List<KeystoneRoleAssignment> value() {
            return list;
        }
    }
}
