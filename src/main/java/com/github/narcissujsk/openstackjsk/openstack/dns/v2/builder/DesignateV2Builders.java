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
package com.github.narcissujsk.openstackjsk.openstack.dns.v2.builder;

import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.DNSV2Builders;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.RecordsetBuilder;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.ZoneBuilder;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateZone;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateRecordset;

/**
 * The Designate V2 Builders
 */
public class DesignateV2Builders implements DNSV2Builders {

    private DesignateV2Builders DesignateV2Builders() {
        return this;
    }

    @Override
    public ZoneBuilder zone() { return DesignateZone.builder(); }

    @Override
    public RecordsetBuilder recordset() { return DesignateRecordset.builder(); }
}
