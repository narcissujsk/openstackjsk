package com.github.narcissujsk.openstackjsk.api.telemetry;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.telemetry.Meter;
import com.github.narcissujsk.openstackjsk.model.telemetry.MeterSample;
import com.github.narcissujsk.openstackjsk.model.telemetry.SampleCriteria;
import com.github.narcissujsk.openstackjsk.model.telemetry.Statistics;

/**
 * Provides Measurements against Meters within an OpenStack deployment
 * 
 * @author Jeremy Unruh
 */
public interface MeterService extends RestService {

	/**
	 * Return all known meters, based on the data recorded so far.
	 * 
	 * @return list of all known meters
	 */
	List<? extends Meter> list();
	
	/**
	 * Returns samples for the specified Meter
	 * @param meterName the name of the meter to fetch samples from
	 * 
	 * @return List of Samples
	 */
	List<? extends MeterSample> samples(String meterName);
	
	/**
     * Returns samples for the specified Meter
     * @param meterName the name of the meter to fetch samples from
     * @param criteria the sample query criteria for filtering results
     * 
     * @return List of Samples
     */
    List<? extends MeterSample> samples(String meterName, SampleCriteria criteria);
	
	/**
	 * Returns computed statistics for the given meterName
	 * @param meterName the name of the meter to fetch statistics for
	 * 
	 * @return List of Statistics
	 */
	List<? extends Statistics> statistics(String meterName);
	
	/**
     * Returns computed statistics for the given meterName
     * 
     * @param meterName the name of the meter to fetch statistics for
     * @param criteria additional query criteria
     * @return List of Statistics
     */
    List<? extends Statistics> statistics(String meterName, SampleCriteria criteria);
    
    /**
     * Returns computed statistics for the given meterName
     * 
     * @param meterName the name of the meter to fetch statistics for
     * @param criteria additional query criteria
     * @param period the result will be statistics for a period long of that number of seconds
     * @return List of Statistics
     */
    List<? extends Statistics> statistics(String meterName, SampleCriteria criteria, int period);
	
	/**
	 * Returns computed statistics for the given meterName for the given time range
	 * 
	 * @param meterName the name of the meter to fetch statistics for
	 * @param period the result will be statistics for a period long of that number of seconds
	 * @return List of Statistics
	 */
	List<? extends Statistics> statistics(String meterName, int period);
	
	void putSamples(List<MeterSample> sampleList, String meterName);
}
