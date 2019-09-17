package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.Direction;
import com.github.narcissujsk.openstackjsk.model.gbp.PolicyClassifierUpdate;
import com.github.narcissujsk.openstackjsk.model.gbp.Protocol;
/**
 * A builder which produces a Policy Classifier Update object
 * 
 * @author vinod borole
 */
public interface PolicyClassifierUpdateBuilder extends Builder<PolicyClassifierUpdateBuilder, PolicyClassifierUpdate> {
    PolicyClassifierUpdateBuilder name(String name);
    PolicyClassifierUpdateBuilder description(String description);
    PolicyClassifierUpdateBuilder shared(boolean shared);
    PolicyClassifierUpdateBuilder portRangeMin(int min);
    PolicyClassifierUpdateBuilder portRangeMax(int max);
    PolicyClassifierUpdateBuilder direction(Direction direction);
    PolicyClassifierUpdateBuilder protocol(Protocol protocol);
}
 