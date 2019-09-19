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
package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Certificate;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface CertificateBuilder extends Builder<CertificateBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Certificate> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Certificate#getPem
     */
    CertificateBuilder pem(String pem);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Certificate#getBayUuid
     */
    CertificateBuilder bayUuid(String bayUuid);

    /**
     * @see Certificate#getLinks
     */
    CertificateBuilder links(List<GenericLink> links);

}
