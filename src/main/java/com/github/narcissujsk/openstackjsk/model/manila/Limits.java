package com.github.narcissujsk.openstackjsk.model.manila;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.manila.AbsoluteLimit;
import com.github.narcissujsk.openstackjsk.model.manila.RateLimit;

import java.util.List;

/**
 * Limits are the resource limitations that are allowed for each tenant (project).
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface Limits extends ModelEntity {
    /**
     * @return the rate limits
     */
    List<? extends RateLimit> getRate();

    /**
     * @return the absolute limits
     */
    AbsoluteLimit getAbsolute();
}
