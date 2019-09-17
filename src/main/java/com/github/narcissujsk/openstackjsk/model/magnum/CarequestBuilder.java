package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Carequest;

public interface CarequestBuilder extends Builder<CarequestBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Carequest> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Carequest#getBayUuid
     */
    CarequestBuilder bayUuid(String bayUuid);

    /**
     * @see Carequest#getCsr
     */
    CarequestBuilder csr(String csr);

}
