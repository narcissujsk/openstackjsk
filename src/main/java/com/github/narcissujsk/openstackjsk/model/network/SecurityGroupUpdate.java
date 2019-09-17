package com.github.narcissujsk.openstackjsk.model.network;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.builder.NetSecurityGroupUpdateBuilder;

/**
 * The Interface SecurityGroupUpdate.
 *
 * Created by Ayberk CAL on 17.03.2017.
 */
public interface SecurityGroupUpdate extends ModelEntity, Buildable<NetSecurityGroupUpdateBuilder> {

    /**
     * Gets the name.
     *
     * @return the name
     */
    String getName();

    /**
     * Gets the description.
     *
     * @return the description
     */
    String getDescription();

    /**
     * Gets the spesific Id.
     *
     * @return the Id
     */
    String getId();

}
