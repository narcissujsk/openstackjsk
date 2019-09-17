package com.github.narcissujsk.openstackjsk.openstack.baremetal.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * @program: openstack4j-core
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-11 09:29
 **/

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Target implements ModelEntity {
    public Target(String target) {
        this.target = target;
    }
    public Target() {

    }
    @JsonProperty("target")
    public String target;


    @JsonProperty("configdrive ")
    public Object configdrive ;


    @JsonProperty("clean_steps ")
    public String cleanSteps ;


    @JsonProperty("rescue_password  ")
    public String rescuePassword  ;

    @JsonProperty("timeout")
    public Integer timeout  ;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Object getConfigdrive() {
        return configdrive;
    }

    public void setConfigdrive(Object configdrive) {
        this.configdrive = configdrive;
    }

    public String getCleanSteps() {
        return cleanSteps;
    }

    public void setCleanSteps(String cleanSteps) {
        this.cleanSteps = cleanSteps;
    }

    public String getRescuePassword() {
        return rescuePassword;
    }

    public void setRescuePassword(String rescuePassword) {
        this.rescuePassword = rescuePassword;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
