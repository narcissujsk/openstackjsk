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
package com.github.narcissujsk.openstackjsk.openstack.gbp.domain;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.gbp.ExternalPolicyCreate;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.ExternalPolicyBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
/**
 * Model implementation for External Policy
 *
 * @author vinod borole
 */
@JsonRootName("external_policy")
public class GbpExternalPolicyCreate implements ExternalPolicyCreate{
    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    @JsonProperty("tenant_id")
    private String tenantId;
    private String id;
    @JsonProperty("consumed_policy_rule_sets")
    private Map<String,String> consumedPolicyRuleSets;
    @JsonProperty("provided_policy_rule_sets")
    private Map<String,String> providedPolicyRuleSets;
    @JsonProperty("external_segments")
    private List<String> externalSegments;
    private Boolean shared;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTenantId() {
        return tenantId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTenantId(String tenantId) {
        this.tenantId=tenantId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
        this.name=name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setId(String id) {
        this.id=id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,String> getConsumedPolicyRuleSets() {
        return consumedPolicyRuleSets;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,String> getProvidedPolicyRuleSets() {
        return providedPolicyRuleSets;

    }


    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getExternalSegments() {
        return externalSegments;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isShared() {
        return this.shared == null ? false : shared;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public ExternalPolicyBuilder toBuilder() {
        return new ExternalPolicyConcreteBuilder(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues().add("name", name).add("tenantId", tenantId).add("externalSegments", externalSegments).add("id", id).add("description", description).add("shared", shared).add("consumedPolicyRuleSets", consumedPolicyRuleSets).add("providedPolicyRuleSets", providedPolicyRuleSets).toString();
    }

    public static class ExternalPolicyConcreteBuilder implements ExternalPolicyBuilder{

        private GbpExternalPolicyCreate extPolicy;

        public ExternalPolicyConcreteBuilder(){
            this(new GbpExternalPolicyCreate());
        }

        public ExternalPolicyConcreteBuilder(GbpExternalPolicyCreate gbpExternalPolicy) {
            this.extPolicy=gbpExternalPolicy;
        }

        @Override
        public ExternalPolicyCreate build() {
            return extPolicy;
        }

        @Override
        public ExternalPolicyBuilder from(ExternalPolicyCreate in) {
            extPolicy = (GbpExternalPolicyCreate)in;
            return this;
        }

        @Override
        public ExternalPolicyBuilder name(String name) {
            extPolicy.name=name;
            return this;
        }

        @Override
        public ExternalPolicyBuilder description(String description) {
            this.extPolicy.description=description;
            return this;
        }

        @Override
        public ExternalPolicyBuilder isShared(boolean shared) {
            this.extPolicy.shared=shared;
            return this;
        }

        @Override
        public ExternalPolicyBuilder consumedPolicyRuleSets(List<String> policyRuleSet) {
            this.extPolicy.consumedPolicyRuleSets=Maps.newHashMap();
              for(String id : policyRuleSet ){
                 this.extPolicy.consumedPolicyRuleSets.put(id, "");
              }
            return this;
        }

        @Override
        public ExternalPolicyBuilder providedPolicyRuleSets(List<String> policyRuleSet) {
            this.extPolicy.providedPolicyRuleSets=Maps.newHashMap();
            for(String id : policyRuleSet ){
                this.extPolicy.providedPolicyRuleSets.put(id, "");
             }
            return this;
        }

        @Override
        public ExternalPolicyBuilder externalSegments(List<String> externalSegmentIds) {
            this.extPolicy.externalSegments=externalSegmentIds;
            return this;
        }

    }

    public static ExternalPolicyBuilder builder() {
        return new ExternalPolicyConcreteBuilder();
    }

}
