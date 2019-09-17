package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.compute.ComputeSecurityGroupService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.SecGroupExtension;
import com.github.narcissujsk.openstackjsk.model.compute.SecGroupExtension.Rule;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaSecGroupExtension;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaSecGroupExtension.SecurityGroupRule;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaSecGroupExtension.SecurityGroups;

/**
 * Provides operations against the Security Group extension in OpenStack
 * 
 * Extension Mapping: (os-security-groups)
 * 
 * @author Jeremy Unruh
 */
public class ComputeSecurityGroupServiceImpl extends BaseComputeServices implements ComputeSecurityGroupService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends SecGroupExtension> list() {
		return get(SecurityGroups.class, uri("/os-security-groups")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends SecGroupExtension> listServerGroups(String serverId) {
		checkNotNull(serverId);
		return get(SecurityGroups.class, uri("/servers/%s/os-security-groups", serverId)).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SecGroupExtension get(String securityGroupId) {
		checkNotNull(securityGroupId);
		return get(NovaSecGroupExtension.class, uri("/os-security-groups/%s", securityGroupId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String securityGroupId) {
		checkNotNull(securityGroupId);
		return deleteWithResponse(uri("/os-security-groups/%s", securityGroupId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SecGroupExtension create(String name, String description) {
		checkNotNull(name);
		return post(NovaSecGroupExtension.class, uri("/os-security-groups"))
				     .entity(NovaSecGroupExtension.create(name, description))
				     .execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SecGroupExtension update(String securityGroupId, String name, String description) {
		checkNotNull(securityGroupId);
		checkNotNull(name);
		return put(NovaSecGroupExtension.class, uri("/os-security-groups/%s", securityGroupId))
		     .entity(NovaSecGroupExtension.create(name, description))
		     .execute();
		}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Rule createRule(Rule rule) {
		checkNotNull(rule);
		return post(SecurityGroupRule.class, uri("/os-security-group-rules")).entity(rule).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse deleteRule(String ruleId) {
		checkNotNull(ruleId);
		return deleteWithResponse(uri("/os-security-group-rules/%s", ruleId)).execute();
	}
}
