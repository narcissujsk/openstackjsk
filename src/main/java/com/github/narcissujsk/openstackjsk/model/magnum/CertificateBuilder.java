package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Certificate;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;

public interface CertificateBuilder extends Builder<CertificateBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Certificate> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Certificate#getPem
     */
    CertificateBuilder pem(String pem);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Certificate#getBayUuid
     */
    CertificateBuilder bayUuid(String bayUuid);

    /**
     * @see Certificate#getLinks
     */
    CertificateBuilder links(List<GenericLink> links);

}
