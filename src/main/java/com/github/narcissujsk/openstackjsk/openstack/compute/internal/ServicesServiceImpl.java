package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.compute.ext.ServicesService;
import com.github.narcissujsk.openstackjsk.model.compute.ext.Service;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtService;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.ext.ExtService.Services;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.actions.ServiceAction;

/**
 * Compute Services service provides CRUD capabilities for nova service(s).
 *
 * @author Stephan Latour
 */
public class ServicesServiceImpl extends BaseComputeServices implements ServicesService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Service> list() {
        return get(Services.class, uri("/os-services")).execute().getList();
    }
    
    /**
	 * Returns list of compute services filtered by parameters.
	 * <p>Author:Wang Ting/王婷</p>
	 * @Title: list
	 * @param filteringParams
	 * @return
	 * @see com.github.narcissujsk.openstackjsk.api.compute.ServicesService#list(java.util.Map)
	 */
	@Override
	public List<? extends Service> list(Map<String, String> filteringParams) {
		Invocation<Services> req = get(Services.class, uri("/os-services"));
		if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
            	req = req.param(entry.getKey(), entry.getValue());
            }
        }
		return req.execute().getList();
	}

	/**
	 * Enables a compute services.
	 * <p>Author:Wang Ting/王婷</p>
	 * @Title: enableService
	 * @param binary
	 * @param host
	 * @return
	 * @see com.github.narcissujsk.openstackjsk.api.compute.ServicesService#enableService(java.lang.String, java.lang.String)
	 */
	@Override
	public ExtService enableService(String binary, String host) {
		checkNotNull(binary);
		checkNotNull(host);

		return put(ExtService.class, uri("/os-services/enable")).entity(ServiceAction.enable(binary, host)).execute();
	}

	/**
	 * Disables a compute service.
	 * <p>Author:Wang Ting/王婷</p>
	 * @Title: disableService
	 * @param binary
	 * @param host
	 * @return
	 * @see com.github.narcissujsk.openstackjsk.api.compute.ServicesService#disableService(java.lang.String, java.lang.String)
	 */
	@Override
	public ExtService disableService(String binary, String host) {
		checkNotNull(binary);
		checkNotNull(host);

		return put(ExtService.class, uri("/os-services/disable")).entity(ServiceAction.disable(binary, host)).execute();
	}
}