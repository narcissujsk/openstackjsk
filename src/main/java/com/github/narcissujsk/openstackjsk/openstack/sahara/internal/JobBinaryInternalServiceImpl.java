package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.JobBinaryInternalService;
import com.github.narcissujsk.openstackjsk.core.transport.HttpEntityHandler;
import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.Payload;
import com.github.narcissujsk.openstackjsk.model.common.Payloads;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.JobBinaryInternal;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobBinaryInternal;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaJobBinaryInternal.JobBinaryInternals;

/**
 * Sahara Data Processing Operations
 *
 * @author ekasit.kijsipongse@nectec.or.th
 * @author siwat.pru@outlook.com
 */
public class JobBinaryInternalServiceImpl extends BaseSaharaServices implements JobBinaryInternalService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends JobBinaryInternal> list() {
        return get(JobBinaryInternals.class, uri("/job-binary-internals")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBinaryInternal get(String jobBinaryInternalId) {
        checkNotNull(jobBinaryInternalId);
        return get(SaharaJobBinaryInternal.class, uri("/job-binary-internals/%s", jobBinaryInternalId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String jobBinaryInternalId) {
        checkNotNull(jobBinaryInternalId);
        return deleteWithResponse(uri("/job-binary-internals/%s", jobBinaryInternalId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobBinaryInternal create(Payload<File> payload) {
        checkNotNull(payload);
        return put(SaharaJobBinaryInternal.class, uri("/job-binary-internals/%s", payload.getRaw().getName()))
                     .entity(payload)
                     .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payload<InputStream> getData(String jobBinaryInternalId) {
        HttpResponse response = get(Void.class, uri("/job-binary-internals/%s/data", jobBinaryInternalId)).executeWithResponse();
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
