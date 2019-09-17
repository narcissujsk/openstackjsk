package com.github.narcissujsk.openstackjsk.openstack.storage.block.domain;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.github.narcissujsk.openstackjsk.model.common.QuotaDetails;
import com.github.narcissujsk.openstackjsk.model.storage.block.BlockQuotaSetUsage;
import com.github.narcissujsk.openstackjsk.openstack.common.QuotaDetailsEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Block Quota-Set Usage Details
 *
 * @author Jeremy Unruh
 */
@JsonRootName("quota_set")
@JsonIgnoreProperties(ignoreUnknown=true)
public class CinderBlockQuotaSetUsage implements BlockQuotaSetUsage {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private QuotaDetailsEntity snapshots;
    @JsonProperty
    private QuotaDetailsEntity volumes;
    @JsonProperty
    private QuotaDetailsEntity gigabytes;


    @Override
    public QuotaDetails getSnapshots() {
        return snapshots;
    }

    @Override
    public QuotaDetails getVolumes() {
        return volumes;
    }

    @Override
    public QuotaDetails getGigabytes() {
        return gigabytes;
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("snapshots", snapshots).add("volumes", volumes).add("gigabytes", gigabytes).toString();
    }

}
