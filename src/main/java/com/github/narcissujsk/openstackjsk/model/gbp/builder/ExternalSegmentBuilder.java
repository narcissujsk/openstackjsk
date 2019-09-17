package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.ExternalRoutes;
import com.github.narcissujsk.openstackjsk.model.gbp.ExternalSegment;
/**
 * A builder which produces a External Segments object
 * 
 * @author vinod borole
 */
public interface ExternalSegmentBuilder extends Builder<ExternalSegmentBuilder, ExternalSegment> {

    ExternalSegmentBuilder name(String name);
    ExternalSegmentBuilder description(String description);
    ExternalSegmentBuilder externalPolicies(List<String> extPolicyIds);
    ExternalSegmentBuilder ipVersion(int ipVersion);
    ExternalSegmentBuilder cidr(String cidr);
    ExternalSegmentBuilder isShared(boolean shared);
    ExternalSegmentBuilder externalRoutes(List<ExternalRoutes> extRoutes);
    ExternalSegmentBuilder subnetId(String subnetId);
    ExternalSegmentBuilder isPortAddressTranslation(boolean isPortAddressTranslation);
}   
