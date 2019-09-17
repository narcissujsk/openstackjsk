package com.github.narcissujsk.openstackjsk.api.barbican;

import com.github.narcissujsk.openstackjsk.api.barbican.ContainerService;
import com.github.narcissujsk.openstackjsk.api.barbican.SecretService;
import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * Barbican (Key Management) Operations API
 *
 */
public interface BarbicanService extends RestService {

    /**
     * @return the Container Service API
     */
    ContainerService containers();
    /**
     * @return the Secrets Service API
     */
    SecretService secrets();
}
