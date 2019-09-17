package com.github.narcissujsk.openstackjsk.model.baremetal;

public enum NodeProvisionState {

    ACTIVE("active"),

    MANAGE("manage"),

    PROVIDE("provide"),

    DELETED("deleted"),

    CLEAN("clean"),

    ADOPT("adopt"),

    REBUILD("rebuild"),

    RESCUE("rescue"),

    UNRESCUE("unrescue"),

    INSPECT("inspect");

    private String target;

    NodeProvisionState(String target) {
        this.target=target;
    }

    public String getTarget() {
        return target;
    }
}
