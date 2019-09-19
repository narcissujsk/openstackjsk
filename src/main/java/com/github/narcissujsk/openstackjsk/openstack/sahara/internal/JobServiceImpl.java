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

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.JobService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.Job;
import com.github.narcissujsk.openstackjsk.model.sahara.JobConfigHint;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJob;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJob.Jobs;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobConfigHint;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobUnwrapped;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public class JobServiceImpl extends BaseSaharaServices implements JobService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Job> list() {
        return get(Jobs.class, uri("/jobs")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Job get(String JobId) {
        checkNotNull(JobId);
        return get(SaharaJob.class, uri("/jobs/%s", JobId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Job create(Job job) {
        checkNotNull(job);
        SaharaJobUnwrapped unwrapped = new SaharaJobUnwrapped(job);
        return post(SaharaJob.class, uri("/jobs"))
                     .entity(unwrapped)  // setup request
                     .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String JobId) {
        checkNotNull(JobId);
        return deleteWithResponse(uri("/jobs/%s", JobId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobConfigHint getConfigHint(String type) {
        checkNotNull(type);
        return get(SaharaJobConfigHint.class, uri("/jobs/config-hints/%s", type)).execute();
    }

}
