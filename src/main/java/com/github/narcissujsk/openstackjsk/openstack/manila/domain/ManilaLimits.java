package com.github.narcissujsk.openstackjsk.openstack.manila.domain;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.manila.AbsoluteLimit;
import com.github.narcissujsk.openstackjsk.model.manila.Limits;
import com.github.narcissujsk.openstackjsk.model.manila.RateLimit;

import java.util.List;

/**
 * Limits are the resource limitations that are allowed for each tenant (project).
 *
 * @author Daniel Gonzalez Nothnagel
 */
@JsonRootName("limits")
public class ManilaLimits implements Limits {
    private static final long serialVersionUID = 1L;

    private List<ManilaRateLimit> rate;
    private ManilaAbsoluteLimit absolute;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends RateLimit> getRate() {
        return rate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbsoluteLimit getAbsolute() {
        return absolute;
    }
}
