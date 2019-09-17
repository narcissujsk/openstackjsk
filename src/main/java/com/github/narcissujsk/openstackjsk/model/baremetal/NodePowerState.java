package com.github.narcissujsk.openstackjsk.model.baremetal;

/**
 * @author jiangsk
 */

public enum NodePowerState {

    POWERON("power on"),

    POWEROFF("power off"),

    REBOOTING("rebooting"),

    SOFTPOWEROFF("soft power off"),

    SOFTREBOOTING("soft rebooting");

    private String target;

    NodePowerState(String target) {
        this.target=target;
    }

    public String getTarget() {
        return target;
    }
}
