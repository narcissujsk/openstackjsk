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
package com.github.narcissujsk.openstackjsk.model.gbp.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.gbp.IPVersionType;
import com.github.narcissujsk.openstackjsk.model.gbp.NatPool;
/**
 * A builder which produces a Nat Pool object
 * 
 * @author vinod borole
 */
public interface NatPoolBuilder extends Builder<NatPoolBuilder, NatPool>{

    NatPoolBuilder name(String name);
    NatPoolBuilder description(String description);
    NatPoolBuilder ipVersion(IPVersionType ipVersion);
    NatPoolBuilder cidr(String cidr);
    NatPoolBuilder isShared(boolean shared);
    NatPoolBuilder externalSegmentId(String id);
}
