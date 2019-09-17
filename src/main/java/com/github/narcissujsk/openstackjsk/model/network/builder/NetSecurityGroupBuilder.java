package com.github.narcissujsk.openstackjsk.model.network.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.SecurityGroup;

/**
 * Builder for a SecurityGroup model class
 * 
 * @author Nathan Anderson
 */
public interface NetSecurityGroupBuilder extends Builder<NetSecurityGroupBuilder, SecurityGroup> {

  /**
   * @see SecurityGroup#getId()
   */
  NetSecurityGroupBuilder id(String id);
  
  /**
   * @see SecurityGroup#getName()
   */
  NetSecurityGroupBuilder name(String name);
  
  /**
   * @see SecurityGroup#getDescription()
   */
  NetSecurityGroupBuilder description(String description);
  
  /**
   * @see SecurityGroup#getTenantId()
   */
  NetSecurityGroupBuilder tenantId(String tenantId);
  
}
