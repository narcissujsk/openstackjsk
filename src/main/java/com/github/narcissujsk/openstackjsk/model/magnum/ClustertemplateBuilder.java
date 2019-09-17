package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate;
import com.github.narcissujsk.openstackjsk.model.magnum.Label;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface ClustertemplateBuilder extends Builder<ClustertemplateBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getInsecureRegistry
     */
    ClustertemplateBuilder insecureRegistry(String insecureRegistry);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getLinks
     */
    ClustertemplateBuilder links(List<GenericLink> links);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getHttpProxy
     */
    ClustertemplateBuilder httpProxy(String httpProxy);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getUpdatedAt
     */
    ClustertemplateBuilder updatedAt(String updatedAt);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getFloatingIpEnabled
     */
    ClustertemplateBuilder floatingIpEnabled(Boolean floatingIpEnabled);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getFixedSubnet
     */
    ClustertemplateBuilder fixedSubnet(String fixedSubnet);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getMasterFlavorId
     */
    ClustertemplateBuilder masterFlavorId(String masterFlavorId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getUuid
     */
    ClustertemplateBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getNoProxy
     */
    ClustertemplateBuilder noProxy(String noProxy);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getHttpsProxy
     */
    ClustertemplateBuilder httpsProxy(String httpsProxy);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getTlsDisabled
     */
    ClustertemplateBuilder tlsDisabled(Boolean tlsDisabled);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getKeypairId
     */
    ClustertemplateBuilder keypairId(String keypairId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getPublicTemplate
     */
    ClustertemplateBuilder publicTemplate(Boolean publicTemplate);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getLabels
     */
    ClustertemplateBuilder labels(Label labels);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getDockerVolumeSize
     */
    ClustertemplateBuilder dockerVolumeSize(Integer dockerVolumeSize);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getServerType
     */
    ClustertemplateBuilder serverType(String serverType);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getExternalNetworkId
     */
    ClustertemplateBuilder externalNetworkId(String externalNetworkId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getClusterDistro
     */
    ClustertemplateBuilder clusterDistro(String clusterDistro);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getImageId
     */
    ClustertemplateBuilder imageId(String imageId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getVolumeDriver
     */
    ClustertemplateBuilder volumeDriver(String volumeDriver);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getRegistryEnabled
     */
    ClustertemplateBuilder registryEnabled(Boolean registryEnabled);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getDockerStorageDriver
     */
    ClustertemplateBuilder dockerStorageDriver(String dockerStorageDriver);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getApiserverPort
     */
    ClustertemplateBuilder apiserverPort(String apiserverPort);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getName
     */
    ClustertemplateBuilder name(String name);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getCreatedAt
     */
    ClustertemplateBuilder createdAt(String createdAt);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getNetworkDriver
     */
    ClustertemplateBuilder networkDriver(String networkDriver);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getFixedNetwork
     */
    ClustertemplateBuilder fixedNetwork(String fixedNetwork);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getCoe
     */
    ClustertemplateBuilder coe(String coe);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getFlavorId
     */
    ClustertemplateBuilder flavorId(String flavorId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Clustertemplate#getMasterLbEnabled
     */
    ClustertemplateBuilder masterLbEnabled(Boolean masterLbEnabled);

    /**
     * @see Clustertemplate#getDnsNameserver
     */
    ClustertemplateBuilder dnsNameserver(String dnsNameserver);

}
