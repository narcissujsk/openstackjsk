package com.github.narcissujsk.openstackjsk.api.murano.v1;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Deployment;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Report;

import java.util.List;

/**
 * @author Nikolay Mahotkin.
 */
public interface MuranoDeploymentService extends RestService {
    /**
     * List all the deployments of the environment.
     *
     * @param environmentId The environment id.
     * @return Deployment list.
     */
    List<? extends Deployment> list(String environmentId);

    /**
     * Get the reports (deployment logs) of the specified deployment.
     *
     * @param environmentId environment id.
     * @param deploymentId deployment id.
     * @param serviceIds (optional) list of service ids.
     * @return Report list.
     */
    List<? extends Report> reports(String environmentId, String deploymentId, List<String> serviceIds);
    List<? extends Report> reports(String environmentId, String deploymentId);
}
