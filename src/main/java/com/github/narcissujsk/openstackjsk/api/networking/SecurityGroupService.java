package com.github.narcissujsk.openstackjsk.api.networking;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.Builders;
import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.SecurityGroup;
import com.github.narcissujsk.openstackjsk.model.network.SecurityGroupUpdate;


/**
 * Provides Neutron-based Security Group services.
 *
 * @author Nathan Anderson
 */
public interface SecurityGroupService extends RestService {

    /**
     * Get list of security groups accessible by the current tenant
     *
     * @return the list<? extends security group>
     */
    List<? extends SecurityGroup> list();

    /**
     * Gets the Security Group by id.
     *
     * @param id the id
     * @return the security group
     */
    SecurityGroup get(String id);

    /**
     * Deletes SecurityGroup by id.
     *
     * @param id SecurityGroup id
     */
    ActionResponse delete(String id);

    /**
     * Creates a SecurityGroup.
     *
     * @param securityGroup the security group
     * @return the security group
     */
    SecurityGroup create(SecurityGroup securityGroup);

    /**
     * Updates a SecurityGroup associated by the specified {@code securityGroupId}
     *
     * @param securityGroupId     the security group identifier
     * @param securityGroupUpdate the security group options to update (see {@link Builders#securityGroupUpdate()}
     * @return the updated security group
     */
    SecurityGroup update(String securityGroupId, SecurityGroupUpdate securityGroupUpdate);

    /**
     * Get list of security groups accessible by the current tenant
     * @param filteringParams map (name, value) of filtering parameters
     *
     * @return the list<? extends security group>
     */
    List<? extends SecurityGroup> list(Map<String, String> filteringParams);
}
