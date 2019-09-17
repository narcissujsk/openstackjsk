package com.github.narcissujsk.openstackjsk.api.telemetry;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.telemetry.Sample;
import com.github.narcissujsk.openstackjsk.model.telemetry.SampleCriteria;


public interface SampleService extends RestService{
	
	List<? extends Sample> list();

	List<? extends Sample> list(SampleCriteria criteria);
	
	Sample get(String sampleId);
}
