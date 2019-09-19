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

import com.github.narcissujsk.openstackjsk.api.APIProvider;
import com.github.narcissujsk.openstackjsk.api.artifact.ArtifactService;
import com.github.narcissujsk.openstackjsk.api.barbican.BarbicanService;
import com.github.narcissujsk.openstackjsk.api.baremetal.BaremetalService;
import com.github.narcissujsk.openstackjsk.api.compute.ComputeService;
import com.github.narcissujsk.openstackjsk.api.dns.v2.DNSService;
import com.github.narcissujsk.openstackjsk.api.gbp.GbpService;
import com.github.narcissujsk.openstackjsk.api.heat.HeatService;
import com.github.narcissujsk.openstackjsk.api.image.ImageService;
import com.github.narcissujsk.openstackjsk.api.magnum.MagnumService;
import com.github.narcissujsk.openstackjsk.api.manila.ShareService;
import com.github.narcissujsk.openstackjsk.api.murano.v1.AppCatalogService;
import com.github.narcissujsk.openstackjsk.api.networking.NetworkingService;
import com.github.narcissujsk.openstackjsk.api.networking.ext.ServiceFunctionChainService;
import com.github.narcissujsk.openstackjsk.api.octavia.OctaviaService;
import com.github.narcissujsk.openstackjsk.api.sahara.SaharaService;
import com.github.narcissujsk.openstackjsk.api.senlin.SenlinService;
import com.github.narcissujsk.openstackjsk.api.trove.TroveService;
import com.github.narcissujsk.openstackjsk.api.tacker.TackerService;
import com.github.narcissujsk.openstackjsk.api.workflow.WorkflowService;

import java.util.ServiceLoader;

/**
 * Provides access to the Major APIs and Buildables
 *
 * @author Jeremy Unruh
 */
public class Apis {

    private static final APIProvider provider = initializeProvider();

    /**
     * Gets the API implementation based on Type
     *
     * @param <T>
     *            the API type
     * @param api
     *            the API implementation
     * @return the API implementation
     */
    public static <T> T get(Class<T> api) {
        return provider.get(api);
    }

    /**
     * Gets the identity v3 services API
     *
     * @return the identity v3 services
     */
    public static com.github.narcissujsk.openstackjsk.api.identity.v3.IdentityService getIdentityV3Services() {
        return get(com.github.narcissujsk.openstackjsk.api.identity.v3.IdentityService.class);
    }
    
    /**
     * Gets the identity v2 services API
     *
     * @return the identity v2 services
     */
    public static com.github.narcissujsk.openstackjsk.api.identity.v2.IdentityService getIdentityV2Services() {
        return get(com.github.narcissujsk.openstackjsk.api.identity.v2.IdentityService.class);
    }

    /**
     * Gets the compute services API
     *
     * @return the compute services
     */
    public static ComputeService getComputeServices() {
        return get(ComputeService.class);
    }

    public static BaremetalService getBaremetalServices() {
        return get(BaremetalService.class);
    }

    /**
     * Gets the Network services API
     *
     * @return the network services
     */
    public static NetworkingService getNetworkingServices() {
        return get(NetworkingService.class);
    }

    /**
     * Gets the Service Function Chain Services API
     *
     * @return the Service Function Chain Services
     */
    public static ServiceFunctionChainService getSfcServices() {
        return get(ServiceFunctionChainService.class);
    }

    /**
     * Gets the Octavia services API
     *
     * @return the Octavia services
     */
    public static OctaviaService getOctaviaService() {
        return get(OctaviaService.class);
    }
    
    /**
     * Gets the Artifact services API
     *
     * @return the artifact services
     */
    public static ArtifactService getArtifactServices() {
        return get(ArtifactService.class);
    }

    /**
     * Gets the Tacker services API
     *
     * @return the tacker services
     */
    public static TackerService getTackerServices() {
        return get(TackerService.class);
    }

    /**
     * Gets the (Glance) Image services API
     *
     * @return the image services
     */
    public static ImageService getImageService() {
        return get(ImageService.class);
    }

    /**
     * Gets the (Glance) Image v2 services API
     * @return the image v2 services
     */
    public static com.github.narcissujsk.openstackjsk.api.image.v2.ImageService getImageV2Service() {
        return get(com.github.narcissujsk.openstackjsk.api.image.v2.ImageService.class);
    }

    /**
     * Gets the (Heat) Orchestration services API
     * 
     * @return the heat services
     */
    public static HeatService getHeatServices() {
        return get(HeatService.class);
    }

    /**
     * Gets the (Murano) App Catalog services API
     *
     * @return the murano services
     */
    public static AppCatalogService getMuranoServices() {
        return get(AppCatalogService.class);
    }

    /**
     * Gets the (Sahara) Data Processing services API
     * 
     * @return the sahara services
     */
    public static SaharaService getSaharaServices() {
        return get(SaharaService.class);
    }

    /**
     * Gets the (Mistral) Workflow services API
     *
     * @return the workflow services
     */
    public static WorkflowService getWorkflowServices() {
        return get(WorkflowService.class);
    }

    /**
     * Gets the (Manila) Shared File Systems services API
     * 
     * @return the share services
     */
    public static ShareService getShareServices() {
        return get(ShareService.class);
    }

	/**
     * Gets the group based policy services API
     * @return the gbp services 
     */
    public static GbpService getGbpServices() {
        return get(GbpService.class);
    }

    /**
     * Gets the trove services API
     * @return the trove services
     */
    public static TroveService getTroveServices(){
        return get(TroveService.class);
    }

	/**
	 * Gets the (Senlin) Orchestration services API
	 * @return the Senlin services
	 */
	public static SenlinService getSenlinServices() {
		return get(SenlinService.class);
	}

	/**
     * Gets the Magnum services API
     *
     * @return the Magnum Service
     */
    public static MagnumService getMagnumService() {
        return get(MagnumService.class);
    }

    /**
     * Gets the (BarbicanService) Orchestration services API
     * @return the BarbicanService services
     */
    public static BarbicanService getBarbicanServices() {
        return get(BarbicanService.class);
    }

    /**
     * Gets the dns services API
     * @return the dns services
     */
    public static DNSService getDNSService() { return get(DNSService.class); }


    private static APIProvider initializeProvider() {
        // No need to check for emptiness as there is default implementation registered
        APIProvider p = ServiceLoader.load(APIProvider.class, Apis.class.getClassLoader()).iterator().next();
        p.initialize();
        return p;
    }
}
