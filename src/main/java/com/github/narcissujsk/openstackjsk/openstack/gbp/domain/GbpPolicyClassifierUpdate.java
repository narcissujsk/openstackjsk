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

import com.github.narcissujsk.openstackjsk.model.gbp.Direction;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyClassifierUpdate;
import com.github.narcissujsk.openstackjsk.model.gbp.Protocol;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyClassifierUpdateBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
/**
 * Model implementation for Policy Classifier Update
 * 
 * @author vinod borole
 */
@JsonRootName("policy_classifier")
public class GbpPolicyClassifierUpdate implements PolicyClassifierUpdate {

    private static final long serialVersionUID = 1L;
    private String description;
    private Direction direction;
    @JsonProperty("port_range")
    private String portRange;
    private Protocol protocol;
    private Boolean shared;
    private String name;
     
    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String getPortRange() {
        return portRange;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    @Override
    public boolean isShared() {
        return this.shared == null ? false : shared;
    }

    @Override
    public Protocol getProtocol() {
        return protocol;
    }
      
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @Override
    public PolicyClassifierUpdateBuilder toBuilder() {
        return null;
    }

    public static PolicyClassifierUpdateBuilder builder() {
        return new PolicyClassifierUpdateConcreteBuilder() ;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class PolicyClassifierUpdateConcreteBuilder implements PolicyClassifierUpdateBuilder{
        private GbpPolicyClassifierUpdate policyClassfierUpdate;
        @Override
        public PolicyClassifierUpdate build() {
            return policyClassfierUpdate;
        }
        public PolicyClassifierUpdateConcreteBuilder(GbpPolicyClassifierUpdate gbpPolicyClassifierUpdate) {
            this.policyClassfierUpdate=gbpPolicyClassifierUpdate;
        }
 
        public PolicyClassifierUpdateConcreteBuilder() {
            this(new GbpPolicyClassifierUpdate());
        }
        @Override
        public PolicyClassifierUpdateBuilder from(PolicyClassifierUpdate in) {
            this.policyClassfierUpdate=(GbpPolicyClassifierUpdate) in;
            return this;
        }
        @Override
        public PolicyClassifierUpdateBuilder name(String name) {
           this.policyClassfierUpdate.name=name;
            return this;
        }
        @Override
        public PolicyClassifierUpdateBuilder description(String description) {
            this.policyClassfierUpdate.description=description;
            return this;
        }
        @Override
        public PolicyClassifierUpdateBuilder shared(boolean shared) {
            this.policyClassfierUpdate.shared=shared;
            return this;
        }
        @Override
        public PolicyClassifierUpdateBuilder portRangeMin(int min) {
            String range="";
            if(this.policyClassfierUpdate.portRange!=null && !this.policyClassfierUpdate.portRange.isEmpty())
                range=min+":"+this.policyClassfierUpdate.portRange;
            else
                range=""+min;
            
            this.policyClassfierUpdate.portRange=range;
            return this;        
        }
        
        @Override
        public PolicyClassifierUpdateBuilder portRangeMax(int max) {
            String range="";
            if(this.policyClassfierUpdate.portRange!=null && !this.policyClassfierUpdate.portRange.isEmpty())
                range=this.policyClassfierUpdate.portRange+":"+max;
            else
                range=""+max;
            
            this.policyClassfierUpdate.portRange=range;
            return this;        
        }
        
        @Override
        public PolicyClassifierUpdateBuilder direction(Direction direction) {
            this.policyClassfierUpdate.direction=direction;
            return this;
        }
        @Override
        public PolicyClassifierUpdateBuilder protocol(Protocol protocol) {
            this.policyClassfierUpdate.protocol=protocol;
            return this;
        }
       
        
    }

}
