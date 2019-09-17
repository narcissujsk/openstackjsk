package com.github.narcissujsk.openstackjsk.api.storage;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.AvailabilityZone;

/**
  * @author Jeff Hu
  * list all available cinder zones
  */
public interface CinderZoneService extends RestService {

	List<? extends AvailabilityZone> list();
}
