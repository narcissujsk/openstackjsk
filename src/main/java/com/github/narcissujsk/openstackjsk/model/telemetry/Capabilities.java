package com.github.narcissujsk.openstackjsk.model.telemetry;

import java.util.Map;

public interface Capabilities {

    Map<String, Boolean> getAPI();

    Map<String, Boolean> getStorage();

    Map<String, Boolean> getEventStorage();
}
