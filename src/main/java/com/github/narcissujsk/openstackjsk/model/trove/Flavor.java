package com.github.narcissujsk.openstackjsk.model.trove;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * Flavor Model Entity
 *
 * @author sumit gandhi
 */
public interface Flavor extends ModelEntity {

    String getName();
    String getId();
    String getStrId();
    int getRam();
    int getVcpus();
    int getDisk();
}
