package com.github.narcissujsk.openstackjsk.model.compute.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.compute.QuotaSetUpdate;

/**
 * A builder which creates a QuotaSetUpdate object
 * 
 * @author Jeremy Unruh
 */
public interface QuotaSetUpdateBuilder extends Builder<QuotaSetUpdateBuilder, QuotaSetUpdate> {
    
    /**
     * Metadata items permitted
     */
    QuotaSetUpdateBuilder metadataItems(int metadataitems);

    /**
     * Injected file maximum length
     */
    QuotaSetUpdateBuilder injectedFileContentBytes(int injectedFileContentBytes);

    /**
     * Number of inject-able files
     */
    QuotaSetUpdateBuilder injectedFiles(int injectedFiles);

    /**
     * Quantity of instanceable RAM (MBytes)
     */
    QuotaSetUpdateBuilder ram(int ram);

    /**
     * Number of floating IP
     */
    QuotaSetUpdateBuilder floatingIps(int floatingIps);

    /**
     * Number of permitted instances
     */
    QuotaSetUpdateBuilder instances(int instances);

    /**
     * Number of instanceable cores
     */
    QuotaSetUpdateBuilder cores(int cores);

    /**
     * Number of security groups permitted
     */
    QuotaSetUpdateBuilder securityGroups(int securityGroups);

    /**
     * Number of rules per security group permitted
     */
    QuotaSetUpdateBuilder securityGroupRules(int securityGroupRules);

    /**
     * Injected file path name maximum length
     */
    QuotaSetUpdateBuilder injectedFilePathBytes(int injectedFilePathBytes);

    /**
     * Number of keypairs
     */
    QuotaSetUpdateBuilder keyPairs(int keyPairs);

}
