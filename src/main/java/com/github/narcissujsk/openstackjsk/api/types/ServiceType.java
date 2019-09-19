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
package com.github.narcissujsk.openstackjsk.api.types;

import java.util.regex.Pattern;
public enum ServiceType {

	IDENTITY("keystone", "identity"),
	APP_CATALOG("murano", "application-catalog"),
	COMPUTE("nova", "compute"),
    BAREMETAL("ironic", "baremetal"),
	IMAGE("glance", "image"),
	BLOCK_STORAGE("cinder", "volume"),
	OBJECT_STORAGE("object-store", "object-store"),
	NETWORK("neutron", "network"),
	OCTAVIA("octavia", "load-balancer"),
	EC2("ec2", "ec2"),
	TELEMETRY("ceilometer", "metering"),
	TELEMETRY_AODH("aodh", "alarming"),
	ORCHESTRATION("heat", "orchestration"),
	CLUSTERING("senlin", "clustering"),
	SAHARA("sahara", "data_processing"),
	SHARE("manila", "share"),
	DATABASE("trove","database"),
	BARBICAN("barbican", "key-manager"),
	TACKER("tacker", "nfv-orchestration"),
	ARTIFACT("glare", "artifact"),
  	MAGNUM("magnum", "container"),
	DNS("designate", "dns"),
	WORKFLOW("mistral", "workflow"),
	UNKNOWN("NA", "NA")
	;

	private final String serviceName;
	private final String type;
    private final Pattern servicePattern;
    private static final String SERVICE_PATTERN_SUFFIX = "[v|\\d|\\.]*";

	ServiceType(String serviceName, String type) {
		this.serviceName = serviceName;
		this.type = type;
        this.servicePattern = Pattern.compile(Pattern.quote(serviceName) + SERVICE_PATTERN_SUFFIX +
                        "|" + Pattern.quote(type) + SERVICE_PATTERN_SUFFIX +
                        "|" + Pattern.quote(this.name()) + SERVICE_PATTERN_SUFFIX
                , Pattern.CASE_INSENSITIVE);
    }

	public String getServiceName() {
		return this.serviceName;
	}

	public String getType() {
		return this.type;
	}

    private Pattern getServicePattern()
    {
        return this.servicePattern;
    }

    public static ServiceType forName(String name)
    {
        if (name == null || name.isEmpty())
        {
            return ServiceType.UNKNOWN;
        }
        for (ServiceType s : ServiceType.values())
        {
            if(s.getServicePattern().matcher(name).matches()) {
                return s;
            }
        }
        return ServiceType.UNKNOWN;
    }
}
