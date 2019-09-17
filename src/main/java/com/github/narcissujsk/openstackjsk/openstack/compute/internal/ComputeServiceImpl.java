package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeFloatingIPService;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeImageService;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeSecurityGroupService;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeService;
import com.github.narcissujsk.openstackjsk.api.compute.FlavorService;
import com.github.narcissujsk.openstackjsk.api.compute.HostAggregateService;
import com.github.narcissujsk.openstackjsk.api.compute.HostService;
import com.github.narcissujsk.openstackjsk.api.compute.KeypairService;
import com.github.narcissujsk.openstackjsk.api.compute.QuotaSetService;
import com.github.narcissujsk.openstackjsk.api.compute.ServerGroupService;
import com.github.narcissujsk.openstackjsk.api.compute.ServerService;
import com.github.narcissujsk.openstackjsk.api.compute.ServerTagService;
import com.github.narcissujsk.openstackjsk.api.compute.ext.FloatingIPDNSService;
import com.github.narcissujsk.openstackjsk.api.compute.ext.HypervisorService;
import com.github.narcissujsk.openstackjsk.api.compute.ext.MigrationService;
import com.github.narcissujsk.openstackjsk.api.compute.ext.ServicesService;
import com.github.narcissujsk.openstackjsk.api.compute.ext.ZoneService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;
import com.github.narcissujsk.openstackjsk.openstack.common.ExtensionValue.Extensions;

/**
 * Compute (Nova) Operations API implementation
 * 
 * @author Jeremy Unruh
 */
public class ComputeServiceImpl extends BaseComputeServices implements ComputeService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FlavorService flavors() {
		return Apis.get(FlavorService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ComputeImageService images() {
		return Apis.get(ComputeImageService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerService servers() {
		return Apis.get(ServerService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuotaSetService quotaSets() {
		return Apis.get(QuotaSetService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostService host() {
		return Apis.get(HostService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends Extension> listExtensions() {
		return get(Extensions.class, uri("/extensions")).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ComputeFloatingIPService floatingIps() {
		return Apis.get(ComputeFloatingIPService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ComputeSecurityGroupService securityGroups() {
		return Apis.get(ComputeSecurityGroupService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeypairService keypairs() {
		return Apis.get(KeypairService.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HypervisorService hypervisors() {
		return Apis.get(HypervisorService.class);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ZoneService zones() {
		return Apis.get(ZoneService.class);
	}

	/**
	 * {@inheritDoc}
	 */
    @Override
    public MigrationService migrations() {
        return Apis.get(MigrationService.class);
    }

	@Override
	public ServerGroupService serverGroups() {
		 return Apis.get(ServerGroupService.class);
	}

    @Override
    public FloatingIPDNSService floatingIPDNS() {
        return Apis.get(FloatingIPDNSService.class);
    }

	@Override
	public HostAggregateService hostAggregates() {
		
		return Apis.get(HostAggregateService.class);
	}

	@Override
	public ServerTagService serverTags() {
		return Apis.get(ServerTagService.class);
	}
	
    @Override
    public ServicesService services() {
        return Apis.get(ServicesService.class);
    }
    
}
