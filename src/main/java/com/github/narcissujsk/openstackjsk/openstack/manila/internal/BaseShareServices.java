package com.github.narcissujsk.openstackjsk.openstack.manila.internal;

import com.github.narcissujsk.openstackjsk.api.types.ServiceType;
import com.github.narcissujsk.openstackjsk.openstack.internal.MicroVersion;
import com.github.narcissujsk.openstackjsk.openstack.internal.MicroVersionedOpenStackService;

public class BaseShareServices extends MicroVersionedOpenStackService {
    private final static String API_VERSION_HEADER = "X-Openstack-Manila-Api-Version";

    private static final MicroVersion LIBERTY_VERSION = new MicroVersion(2, 6);
    private static final MicroVersion MITAKA_VERSION = new MicroVersion(2, 15);
    // At the moment, 2.6 is the latest micro-version supported by OpenStack4j. So set it as default.
    private static final MicroVersion DEFAULT_VERSION = LIBERTY_VERSION;

    protected BaseShareServices(MicroVersion version) {
        super(ServiceType.SHARE, version);
    }

    protected BaseShareServices() {
        this(DEFAULT_VERSION);
    }

    @Override
    protected String getApiVersionHeader() {
        return API_VERSION_HEADER;
    }
}
