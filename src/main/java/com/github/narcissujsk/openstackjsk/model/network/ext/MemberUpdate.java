package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.Member;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.MemberUpdateBuilder;
/**
 * An entity used to update a member of a pool
 * @author liujunpeng
 */
public interface MemberUpdate extends ModelEntity, Buildable<MemberUpdateBuilder> {

	
	/**
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Member#isAdminStateUp()
	 */
	public boolean isAdminStateUp();
	
	/**
	 * @see com.github.narcissujsk.openstackjsk.model.network.ext.Member#getWeight()
	 */
	public Integer getWeight();
	/**
	 * @see Member#getPoolId()
	 */
	public String getPoolId();
}
