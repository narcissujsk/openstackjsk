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
package com.github.narcissujsk.openstackjsk.api;

import com.github.narcissujsk.openstackjsk.api.artifact.ArtifactService;
import com.github.narcissujsk.openstackjsk.api.barbican.BarbicanService;
import com.github.narcissujsk.openstackjsk.api.baremetal.BaremetalService;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.DNSService;
import com.github.narcissujsk.openstackjsk.api.exceptions.RegionEndpointNotFoundException;
import com.github.narcissujsk.openstackjsk.api.gbp.GbpService;
import com.github.narcissujsk.openstackjsk.api.heat.HeatService;
import com.github.narcissujsk.openstackjsk.api.image.ImageService;
import com.github.narcissujsk.openstackjsk.api.manila.ShareService;
import com.github.narcissujsk.openstackjsk.api.murano.v1.AppCatalogService;
import com.github.narcissujsk.openstackjsk.api.networking.NetworkingService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.ServiceFunctionChainService;
import com.github.narcissujsk.openstackjsk.api.octavia.OctaviaService;
import com.github.narcissujsk.openstackjsk.api.sahara.SaharaService;
import com.github.narcissujsk.openstackjsk.api.senlin.SenlinService;
import com.github.narcissujsk.openstackjsk.api.storage.BlockStorageService;
import com.github.narcissujsk.openstackjsk.api.storage.ObjectStorageService;
import com.github.narcissujsk.openstackjsk.api.tacker.TackerService;
import com.github.narcissujsk.openstackjsk.api.telemetry.TelemetryService;
import com.github.narcissujsk.openstackjsk.api.trove.TroveService;
import com.github.narcissujsk.openstackjsk.api.types.Facing;
import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.api.workflow.WorkflowService;
import com.github.narcissujsk.openstackjsk.model.identity.v2.Access;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Token;
import com.github.narcissujsk.openstackjsk.api.magnum.MagnumService;

import java.util.Map;
import java.util.Set;

/**
 * A client which has been identified. Any calls spawned from this session will
 * automatically utilize the original authentication that was successfully
 * validated and authorized
 *
 * @author Jeremy Unruh
 */
public interface OSClient< T extends OSClient<T>> {

    /**
     * Specifies the region that should be used for further invocations with
     * this client. If the region is invalid or doesn't exists execution errors
     * will occur when invoking API calls and a
     * {@link RegionEndpointNotFoundException} will be thrown
     *
     * @param region the region to use
     * @return OSClient for method chaining
     */
    T useRegion(String region);

    /**
     * Removes the current region making all calls no longer resolving to region
     * (if originally set otherwise no-op)
     *
     * @return OSClient for method chaining
     */
    T removeRegion();

    /**
     * Changes the Perspective for the current Session (Client)
     *
     * @param perspective the new perspective
     * @return OSClient for method chaining
     */
    T perspective(Facing perspective);

    /**
     * Passes the Headers for the current Session(Client)
     *
     * @param headers the headers to use for keystone tokenless
     * @return OSClient for method chaining
     */
    T headers(Map<String, ? extends Object> headers);

    /**
     * Gets the supported services. A set of ServiceTypes will be returned
     * identifying the OpenStack services installed and supported
     *
     * @return the supported services
     */
    Set<ServiceType> getSupportedServices();

    /**
     * Determines if the Compute (Nova) service is supported
     *
     * @return true, if supports compute
     */
    boolean supportsCompute();

    /**
     * Determines if the Identity (Keystone) service is supported
     *
     * @return true, if supports identity
     */
    boolean supportsIdentity();

    /**
     * Determines if the Network (Neutron) service is supported
     *
     * @return true, if supports network
     */
    boolean supportsNetwork();

    /**
     * Determines if the Image (Glance) service is supported
     *
     * @return true, if supports image
     */
    boolean supportsImage();

    /**
     * Determines if the Orchestration (Heat) service is supported
     *
     * @return true if supports Heat
     */
    boolean supportsHeat();

    /**
     * Determines if the App Catalog (Murano) service is supported
     *
     * @return true if supports Murano
     */
    boolean supportsMurano();

    /**
     * Determines if the Block Storage (Cinder) service is supported
     *
     * @return true if supports Block Storage
     */
    boolean supportsBlockStorage();

    /**
     * Determines if the Object Storage (Swift) service is supported
     *
     * @return true if supports Object Storage
     */
    boolean supportsObjectStorage();

    /**
     * Determines if the Telemetry (Ceilometer) service is supported
     *
     * @return true if supports Telemetry
     */
    boolean supportsTelemetry();

    /**
     * Determines if the Shared File Systems (Manila) service is supported
     *
     * @return true if supports Shared File Systems
     */
    boolean supportsShare();

    /**
     * Gets the current endpoint of the Identity service
     *
     * @return the endpoint
     */
    String getEndpoint();

    /**
     * Returns the Compute Service API
     *
     * @return the compute service
     */
    ComputeService compute();


    BaremetalService baremetal();
    /**
     * Returns the Networking Service API
     *
     * @return the networking service
     */
    NetworkingService networking();

    /**
     * Returns the SFC Service API
     *
     * @return the Service Function Chain Service API
     */
    ServiceFunctionChainService sfc();

    /**
     * Returns the Load Balancer Service API
     *
     * @return the Load Balancer service
     */
    OctaviaService octavia();

    /**
     * Returns the Artifact Service API
     *
     * @return the artifact service
     */
    ArtifactService artifact();
    
    /**
     * Returns the Tacker Service API
     *
     * @return the tacker service
     */
    TackerService tacker();

    /**
     * Returns the Block Storage Service API
     *
     * @return the block storage service
     */
    BlockStorageService blockStorage();

    /**
     * Returns the Object Storage Service API
     *
     * @return the object storage service
     */
    ObjectStorageService objectStorage();

    /**
     * Returns the Image Service API
     *
     * @return the image service
     */
    ImageService images();

    /**
     * Returns the Image V2 Service API
     * @return the image v2 service
     */
    com.github.narcissujsk.openstackjsk.api.image.v2.ImageService imagesV2();

    /**
     * Returns the Telemetry Service API
     *
     * @return the telemetry service
     */
    TelemetryService telemetry();

    /**
     * Returns the Shared File Systems API
     *
     * @return the share service
     */
    ShareService share();

    /**
     * Returns the Heat Service API
     *
     * @return the Heat service
     */
    HeatService heat();

    /**
     * Returns the Murano Service API
     *
     * @return the Murano service
     */
    AppCatalogService murano();

    /**
     * Returns the Sahara Service API
     *
     * @return the Sahara service
     */
    SaharaService sahara();

    /**
     * Returns the Workflow Service API
     *
     * @return the Workflow service
     */
    WorkflowService workflow();

    /**
     * Returns the Magnum Service API
     * 
     * @return the Magnum Service
     */
    MagnumService magnum();

    /**
     * OpenStack4j Client which authenticates against version V2
     */
    public interface OSClientV2 extends OSClient<OSClientV2> {
        
        /**
         * Returns the Identity V2 Access object assigned during authentication
         * 
         * @return the Access object
         */
        Access getAccess();
        
        /**
         * Returns the Identity Service API V2
         * 
         * @return the identity service version 2
         */
        com.github.narcissujsk.openstackjsk.api.identity.v2.IdentityService identity();
        
    }
    
    /**
     * OpenStack4j Client which authenticates against version V3
     */
    public interface OSClientV3 extends OSClient<OSClientV3> {
        
        
        /**
         * Gets the token that was assigned during authorization
         *
         * @return the authentication token
         */
        Token getToken();
         
        /**
         * Returns the Identity Service API V3
         *
         * @return the identity service version 3
         */
        com.github.narcissujsk.openstackjsk.api.identity.v3.IdentityService identity();
        
    }
 
	/**
     * Returns the Gbp Service API
     * 
     * @return the Gbp service
     */
	GbpService gbp();
	
	/**
	 * Returns the Senlin Service API
	 *
	 * @return the Senlin service
	 */
	SenlinService senlin();

    /**
     *  Returns the Trove Service API
     *
     * @return the Trove service
     */
    TroveService trove();

    /**
     * Returns the Barbican Service API
     *
     * @return the Barbican service
     */
    BarbicanService barbican();

    /**
     * Returns the DNS Service API
     *
     * @return the DNS service
     */
    DNSService dns();

}
