package com.github.narcissujsk.openstackjsk.model.magnum;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.magnum.CarequestBuilder;

public interface Carequest extends ModelEntity, Buildable<CarequestBuilder> {
    /**
     * Gets bayUuid
     * 
     * @return bayUuid
     */
    String getBayUuid();

    /**
     * Gets csr
     * 
     * @return csr
     */
    String getCsr();

}
