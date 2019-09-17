package com.github.narcissujsk.openstackjsk.model.network.ext;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.network.ext.LbMethod;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.LbPoolUpdateBuilder;

/**
 * A entity used to update a lb pool 
 * @author liujunpeng
 *
 */
public interface LbPoolUpdate extends ModelEntity, Buildable<LbPoolUpdateBuilder> {

	/**
	 * 
	 * @return The administrative state of the lb pool, which is up (true) or
	 *         down (false).
	 */
	public boolean isAdminStateUp();
	/**
	 * 
	 * @return Pool name. Does not have to be unique.
	 */
	public String getName();
	/**
	 * 
	 * @return The load-balancer algorithm, which is round-robin, least-connections, and so on. This value, which must be supported, is dependent on the load-balancer provider. Round-robin must be supported.
	 */
	public LbMethod getLbMethod();
	/**
	 * 
	 * @return Description for the pool.
	 */
	public String getDescription();
}
