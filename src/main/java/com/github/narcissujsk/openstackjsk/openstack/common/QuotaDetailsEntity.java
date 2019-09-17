package com.github.narcissujsk.openstackjsk.openstack.common;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.github.narcissujsk.openstackjsk.model.common.QuotaDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quota Details Entity describing quota usage
 *
 * @author Jeremy Unruh
 */
public class QuotaDetailsEntity implements QuotaDetails {

    private static final long serialVersionUID = 1L;

    @JsonProperty("in_use")
    private int inUse;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("reserved")
    private int reserved;

    @Override
    public int getInUse() {
        return inUse;
    }

    @Override
    public int getLimit() {
        return limit;
    }

    @Override
    public int getReserved() {
        return reserved;
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("in_use", inUse).add("limit", limit).add("reserved", reserved).toString();
    }

}
