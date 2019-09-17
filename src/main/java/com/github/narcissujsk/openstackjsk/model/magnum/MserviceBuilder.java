package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Mservice;

/**
 * Builder which crates Magnum Service
 * 
 * @author Sohan Sangwan
 *
 */
		
public interface MserviceBuilder extends Builder<MserviceBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Mservice> {
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getId()
     */
	MserviceBuilder id(String id);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getBinary()
     */
	MserviceBuilder binary(String binary);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getCreatedAt()
     */
	MserviceBuilder createdAt(String createdAt);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getState()
     */
	MserviceBuilder state(String state);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getReportCount()
     */
	MserviceBuilder reportCount(int reportCount);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getUpdatedAt()
     */
	MserviceBuilder updatedAt(String updatedAt);
	
	 /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Mservice#getHost()
     */
	MserviceBuilder host(String host);
	
	 /**
     * @see Mservice#getDisabledReason()
     */
	MserviceBuilder disabledReason(String disabledReason);
}
