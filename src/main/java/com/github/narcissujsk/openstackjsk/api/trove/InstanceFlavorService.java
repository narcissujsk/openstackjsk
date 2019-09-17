package com.github.narcissujsk.openstackjsk.api.trove;

import com.github.narcissujsk.openstackjsk.model.trove.Flavor;

import java.util.List;

/**
 * This interface defines all methods for the manipulation of trove instance flavors
 *
 * @author sumit gandhi
 */

public interface InstanceFlavorService {

    /**
     * Returns all the available database instance flavors
     * @return the list of available flavors
     */
    List<? extends Flavor> list();

    /**
     * Get the instance flavor specified by ID
     * @param id
     * @return the flavor or null if not found
     */
    Flavor get(String id);


}
