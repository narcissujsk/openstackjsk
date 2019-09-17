package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.CertificateBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface Certificate extends ModelEntity, Buildable<CertificateBuilder> {
    /**
     * Gets pem
     * 
     * @return pem
     */
    String getPem();

    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets links
     * 
     * @return links
     */
    List<GenericLink> getLinks();

}
