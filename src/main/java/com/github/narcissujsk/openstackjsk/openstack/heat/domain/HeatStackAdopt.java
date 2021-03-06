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
package com.github.narcissujsk.openstackjsk.openstack.heat.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.heat.AdoptStackData;

/**
 * This class contains all elements required for the adoption of a HeatStack. It
 * uses Jackson annotation for (de)serialization into JSON
 * 
 * @author Ales Kemr
 */
public class HeatStackAdopt implements ModelEntity {

    private static final long serialVersionUID = 1L;

    @JsonProperty("stack_name")
    private String name;
    @JsonProperty("timeout_mins")
    private Long timeoutMins;
    @JsonProperty("parameters")
    private Map<String, String> parameters;
    @JsonProperty("disable_rollback")
    private boolean disableRollback;
    @JsonProperty("adopt_stack_data")
    private String adoptStackData;
    @JsonProperty("template")
    private String template;

    public String getName() {
        return name;
    }

    public Long getTimeoutMins() {
        return timeoutMins;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public boolean isDisableRollback() {
        return disableRollback;
    }

    public String getAdoptStackData() {
        return adoptStackData;
    }

    public String getTemplate() {
        return template;
    }
    
    public static HeatStackAdoptBuilder builder() {
        return new HeatStackAdoptBuilder();
    }

    public static class HeatStackAdoptBuilder {

        private HeatStackAdopt model;

        public HeatStackAdoptBuilder(HeatStackAdopt model) {
            this.model = model;
        }

        public HeatStackAdoptBuilder() {
            this.model = new HeatStackAdopt();
        }
        
        public HeatStackAdoptBuilder name(String name) {
            this.model.name = name;
            return this;
        }

        public HeatStackAdoptBuilder timeoutMins(Long timeoutMins) {
            this.model.timeoutMins = timeoutMins;
            return this;
        }

        public HeatStackAdoptBuilder parameters(Map<String, String> parameters) {
            this.model.parameters = parameters;
            return this;
        }

        public HeatStackAdoptBuilder disableRollback(boolean disableRollback) {
            this.model.disableRollback = disableRollback;
            return this;
        }

        public HeatStackAdoptBuilder adoptStackData(AdoptStackData adoptStackData) {
            try {
                this.model.adoptStackData = new ObjectMapper().writeValueAsString(adoptStackData);
                return this;
            } catch (JsonProcessingException ex) {
                Logger.getLogger(HeatStackAdopt.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException(ex);
            }
        }
        
        public HeatStackAdoptBuilder template(String template) {
            this.model.template = template;
            return this;
        }

        public HeatStackAdopt build() {
            return model;
        }
    }
    
    
}
