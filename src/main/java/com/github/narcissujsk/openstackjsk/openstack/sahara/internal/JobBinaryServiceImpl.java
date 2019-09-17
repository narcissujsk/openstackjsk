package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.InputStream;
import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.JobBinaryService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpEntityHandler;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.Payload;
import com.github.narcissujsk.openstackjsk.model.common.Payloads;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.JobBinary;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobBinary;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobBinary.JobBinaries;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobBinaryUnwrapped;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */

public class JobBinaryServiceImpl extends BaseSaharaServices implements JobBinaryService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends JobBinary> list() {
        return get(JobBinaries.class, uri("/job-binaries")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBinary get(String JobBinaryId) {
        checkNotNull(JobBinaryId);
        return get(SaharaJobBinary.class, uri("/job-binaries/%s", JobBinaryId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBinary create(JobBinary jobBinary) {
        checkNotNull(jobBinary);
        SaharaJobBinaryUnwrapped unwrapped = new SaharaJobBinaryUnwrapped(jobBinary);
        return post(SaharaJobBinary.class, uri("/job-binaries"))
                     .entity(unwrapped)  // setup request
                     .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String JobBinaryId) {
        checkNotNull(JobBinaryId);
        return deleteWithResponse(uri("/job-binaries/%s", JobBinaryId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payload<InputStream> getData(String JobBinaryId) {
        HttpResponse response = get(Void.class, uri("/job-binaries/%s/data", JobBinaryId)).executeWithResponse();
        try
        {
            if (response.getStatus() < 400)
                return Payloads.create(response.getInputStream());
            return null;
        }
        finally {
            HttpEntityHandler.closeQuietly(response);
        }
    }

}
