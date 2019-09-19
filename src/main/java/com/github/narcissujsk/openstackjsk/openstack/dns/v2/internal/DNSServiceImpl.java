/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.dns.v2.DNSService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.RecordsetService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.ZoneService;
import com.github.narcissujsk.openstackjsk.model.common.Extension;
import com.github.narcissujsk.openstackjsk.openstack.common.ExtensionValue.ExtensionList;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.internal.BaseDNSServices;
import com.github.narcissujsk.openstackjsk.openstack.internal.BaseOpenStackService;

import java.util.List;


/**
 * DNS/Designate V2 service implementation
 *
 */
public class DNSServiceImpl extends BaseDNSServices implements DNSService {

    @Override
    public ZoneService zones() {
        return Apis.get(ZoneService.class);
    }

    @Override
    public RecordsetService recordsets() {
        return Apis.get(RecordsetService.class);
    }
}
