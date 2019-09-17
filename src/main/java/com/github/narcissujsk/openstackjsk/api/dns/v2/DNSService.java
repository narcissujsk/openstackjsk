package com.github.narcissujsk.openstackjsk.api.dns.v2;

import com.github.narcissujsk.openstackjsk.api.dns.v2.RecordsetService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.ZoneService;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * DNS/Designate Service Operations API
 *
 */
public interface DNSService extends RestService {

	/**
	 * Zone Service API
	 *
	 * @return the zone service
	 */
	ZoneService zones();

	/**
	 * Recordset Service API
	 *
	 * @return the recordsets service
	 */
	RecordsetService recordsets();

}
