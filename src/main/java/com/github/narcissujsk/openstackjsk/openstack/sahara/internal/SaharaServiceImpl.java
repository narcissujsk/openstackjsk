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
package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.sahara.ClusterService;
import com.github.narcissujsk.openstackjsk.api.sahara.ClusterTemplateService;
import com.github.narcissujsk.openstackjsk.api.sahara.JobBinaryInternalService;
import com.github.narcissujsk.openstackjsk.api.sahara.JobBinaryService;
import com.github.narcissujsk.openstackjsk.api.sahara.JobExecutionService;
import com.github.narcissujsk.openstackjsk.api.sahara.JobService;
import com.github.narcissujsk.openstackjsk.api.sahara.NodeGroupTemplateService;
import com.github.narcissujsk.openstackjsk.api.sahara.SaharaImageService;
import com.github.narcissujsk.openstackjsk.api.sahara.SaharaPluginService;
import com.github.narcissujsk.openstackjsk.api.sahara.SaharaService;
import com.github.narcissujsk.openstackjsk.api.sahara.DataSourceService;

/**
 * Sahara (Data Processing) Operations API implementation
 * 
 * @author Ekasit Kijsipongse
 */
public class SaharaServiceImpl extends BaseSaharaServices implements SaharaService {

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterService clusters() {
       return Apis.get(ClusterService.class);
    }

    /**
     * {@inheritDoc}
     */
     @Override
     public NodeGroupTemplateService nodeGroupTemplates() {
        return Apis.get(NodeGroupTemplateService.class);
     }

     /**
      * {@inheritDoc}
      */
     @Override
     public ClusterTemplateService clusterTemplates() {
        return Apis.get(ClusterTemplateService.class);
     }

     /**
      * {@inheritDoc}
      */
     @Override
     public SaharaImageService images() {
        return Apis.get(SaharaImageService.class);
     }

     /**
      * {@inheritDoc}
      */
     @Override
     public SaharaPluginService plugins() {
        return Apis.get(SaharaPluginService.class);
     }
		
     /**
      * {@inheritDoc}
      */
     @Override
     public DataSourceService dataSources() {
	return Apis.get(DataSourceService.class);
     }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBinaryInternalService jobBinaryInternals() {
        return Apis.get(JobBinaryInternalService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBinaryService jobBinaries() {
        return Apis.get(JobBinaryService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobService jobs() {
        return Apis.get(JobService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobExecutionService jobExecutions() {
        return Apis.get(JobExecutionService.class);
    }
}
