package com.github.narcissujsk.openstackjsk.model.network.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.network.SecurityGroupRule;

/**
 * Builder for a SecurityGroup model class
 * 
 * @author Nathan Anderson
 */
public interface NetSecurityGroupRuleBuilder extends Builder<NetSecurityGroupRuleBuilder, SecurityGroupRule> {

  /**
   * @see SecurityGroupRule#getId()
   */
  NetSecurityGroupRuleBuilder id(String id);
  
  /**
   * @see SecurityGroupRule#getTenantId()
   */
  NetSecurityGroupRuleBuilder tenantId(String tenantId);
  
  /**
   * @see SecurityGroupRule#getSecurityGroupId()
   */
  NetSecurityGroupRuleBuilder securityGroupId(String groupId);
  
  /**
   * @see SecurityGroupRule#getDirection()
   */
  NetSecurityGroupRuleBuilder direction(String direction);
  
  /**
   * @see SecurityGroupRule#getEthertype()
   */
  NetSecurityGroupRuleBuilder ethertype(String ethertype);
  
  /**
   * @see SecurityGroupRule#getPortRangeMax()
   */
  NetSecurityGroupRuleBuilder portRangeMax(int max);
  
  /**
   * @see SecurityGroupRule#getPortRangeMin()
   */
  NetSecurityGroupRuleBuilder portRangeMin(int min);
  
  /**
   * @see SecurityGroupRule#getProtocol()
   */
  NetSecurityGroupRuleBuilder protocol(String protocol);
  
  /**
   * @see SecurityGroupRule#getRemoteGroupId()
   */
  NetSecurityGroupRuleBuilder remoteGroupId(String remoteGroupId);
  
  /**
   * @see SecurityGroupRule#getRemoteIpPrefix()
   */
  NetSecurityGroupRuleBuilder remoteIpPrefix(String prefix);
  
}
