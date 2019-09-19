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
package com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import com.github.narcissujsk.openstackjsk.model.network.ext.LoadBalancerV2Stats;

/**
 * The statistics about an lbaas v2 loadbalancer
 * @author emjburns
 */
@JsonRootName("stats")
public class NeutronLoadBalancerV2Stats implements LoadBalancerV2Stats {
    private static final long serialVersionUID = 1L;
    @JsonProperty("bytes_in")
    private Long bytesIn;

    @JsonProperty("bytes_out")
    private Long bytesOut;

    @JsonProperty("total_connections")
    private Integer totalConnections;

    @JsonProperty("active_connections")
    private Integer activeConnections;

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public Long getBytesIn() {
        return bytesIn;
    }
    /**
     *
     * {@inheritDoc}
     */
    @Override
    public Long getBytesOut() {
        return bytesOut;
    }
    /**
     *
     * {@inheritDoc}
     */
    @Override
    public Integer getTotalConnections() {
        return totalConnections;
    }
    /**
     *
     * {@inheritDoc}
     */
    @Override
    public Integer getActiveConnections() {
        return activeConnections;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("bytesIn", bytesIn)
                .add("bytesOut", bytesOut)
                .add("totalConnections", totalConnections)
                .add("activeConnections", activeConnections)
                .toString();
    }
}
