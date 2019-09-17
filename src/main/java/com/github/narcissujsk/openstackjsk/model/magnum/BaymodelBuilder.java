package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Baymodel;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface BaymodelBuilder extends Builder<BaymodelBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Baymodel> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getInsecureRegistry()
     */
    BaymodelBuilder insecureRegistry(String insecureRegistry);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getLinks()
     */
    BaymodelBuilder links(List<GenericLink> links);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getHttpProxy()
     */
    BaymodelBuilder httpProxy(String httpProxy);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getUpdatedAt()
     */
    BaymodelBuilder updatedAt(String updatedAt);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getisFloatingIpEnabled()
     */
    BaymodelBuilder isFloatingIpEnabled(Boolean floatingIpEnabled);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getFixedSubnet()
     */
    BaymodelBuilder fixedSubnet(String fixedSubnet);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getMasterFlavorId()
     */
    BaymodelBuilder masterFlavorId(String masterFlavorId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getUuid()
     */
    BaymodelBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getNoProxy()
     */
    BaymodelBuilder noProxy(String noProxy);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getHttpsProxy()
     */
    BaymodelBuilder httpsProxy(String httpsProxy);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getTlsDisabled()
     */
    BaymodelBuilder tlsDisabled(Boolean tlsDisabled);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getKeypairId()
     */
    BaymodelBuilder keypairId(String keypairId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getPublicBaymodel()
     */
    BaymodelBuilder publicBaymodel(Boolean publicBaymodel);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getDockerVolumeSize()
     */
    BaymodelBuilder dockerVolumeSize(String dockerVolumeSize);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getServerType()
     */
    BaymodelBuilder serverType(String serverType);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getExternalNetworkId()
     */
    BaymodelBuilder externalNetworkId(String externalNetworkId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getClusterDistro()
     */
    BaymodelBuilder clusterDistro(String clusterDistro);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getImageId()
     */
    BaymodelBuilder imageId(String imageId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getVolumeDriver()
     */
    BaymodelBuilder volumeDriver(String volumeDriver);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getRegistryEnabled()
     */
    BaymodelBuilder registryEnabled(Boolean registryEnabled);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getDockerStorageDriver()
     */
    BaymodelBuilder dockerStorageDriver(String dockerStorageDriver);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getApiserverPort()
     */
    BaymodelBuilder apiserverPort(String apiserverPort);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getName()
     */
    BaymodelBuilder name(String name);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getCreatedAt()
     */
    BaymodelBuilder createdAt(String createdAt);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getNetworkDriver()
     */
    BaymodelBuilder networkDriver(String networkDriver);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getFixedNetwork()
     */
    BaymodelBuilder fixedNetwork(String fixedNetwork);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getCoe()
     */
    BaymodelBuilder coe(String coe);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getFlavorId()
     */
    BaymodelBuilder flavorId(String flavorId);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Baymodel#getMasterLbEnabled()
     */
    BaymodelBuilder masterLbEnabled(Boolean masterLbEnabled);

    /**
     * @see Baymodel#getDnsNameserver()
     */
    BaymodelBuilder dnsNameserver(String dnsNameserver);

}
