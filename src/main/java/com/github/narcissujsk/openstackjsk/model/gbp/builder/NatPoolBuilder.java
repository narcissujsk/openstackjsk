package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.IPVersionType;
import com.github.narcissujsk.openstackjsk.model.gbp.NatPool;
/**
 * A builder which produces a Nat Pool object
 * 
 * @author vinod borole
 */
public interface NatPoolBuilder extends Builder<NatPoolBuilder, NatPool>{

    NatPoolBuilder name(String name);
    NatPoolBuilder description(String description);
    NatPoolBuilder ipVersion(IPVersionType ipVersion);
    NatPoolBuilder cidr(String cidr);
    NatPoolBuilder isShared(boolean shared);
    NatPoolBuilder externalSegmentId(String id);
}
