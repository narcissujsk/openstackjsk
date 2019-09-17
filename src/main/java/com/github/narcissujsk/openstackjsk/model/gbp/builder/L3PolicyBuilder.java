package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.L3Policy;
/**
 * A builder which produces a L3Policies object
 * 
 * @author vinod borole
 */
public interface L3PolicyBuilder extends Builder<L3PolicyBuilder, L3Policy> {

    L3PolicyBuilder name(String name);
    L3PolicyBuilder description(String description);
    L3PolicyBuilder ipVersion(int ipVersion);
    L3PolicyBuilder ippool(String ippool);
    L3PolicyBuilder subnetPrefixLength(String subnetPrefixLength);
    L3PolicyBuilder isShared(boolean shared);
    L3PolicyBuilder externalSegments(List<String> extSegmentIds);
}
 