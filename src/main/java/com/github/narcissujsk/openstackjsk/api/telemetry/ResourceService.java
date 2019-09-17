package com.github.narcissujsk.openstackjsk.api.telemetry;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.telemetry.Resource;

public interface ResourceService {

    List<? extends Resource> list();

    Resource get(String resourceId);

}
