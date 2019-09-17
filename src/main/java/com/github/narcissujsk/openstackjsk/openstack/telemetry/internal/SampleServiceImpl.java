package com.github.narcissujsk.openstackjsk.openstack.telemetry.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.telemetry.SampleService;
import com.github.narcissujsk.openstackjsk.model.telemetry.Sample;
import com.github.narcissujsk.openstackjsk.model.telemetry.SampleCriteria;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeiloMeterSample;

/**
 * Provides Measurements for Samples within an OpenStack deployment
 * 
 * @author Shital Patil
 */

public class SampleServiceImpl extends BaseTelemetryServices implements SampleService {

    private static final String FIELD = "q.field";
    private static final String OPER = "q.op";
    private static final String VALUE = "q.value";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Sample> list() {
        CeiloMeterSample[] samples = get(CeiloMeterSample[].class, uri("/samples")).execute();
        return wrapList(samples);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Sample> list(SampleCriteria criteria) {
        checkNotNull(criteria);
        Invocation<CeiloMeterSample[]> invocation = get(CeiloMeterSample[].class, uri("/samples"));
        if(criteria.getLimit() > 0){
            invocation.param("limit", criteria.getLimit());
        }
        
        for (SampleCriteria.NameOpValue c : criteria.getCriteriaParams()) {
            invocation.param(FIELD, c.getField());
            invocation.param(OPER, c.getOperator().getQueryValue());
            invocation.param(VALUE, c.getValue());
        }
        CeiloMeterSample[] samples = invocation.execute();
        return wrapList(samples);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sample get(String sampleId) {
        checkNotNull(sampleId);

        CeiloMeterSample sample = get(CeiloMeterSample.class, uri("/samples/%s", sampleId)).execute();
        return sample;
    }

}
