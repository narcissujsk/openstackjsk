package com.github.narcissujsk.openstackjsk.model.sahara.builder;

import com.github.narcissujsk.openstackjsk.model.sahara.DataSource;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.ClusterBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.ClusterTemplateBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.DataSourceBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.JobBinaryBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.JobBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.JobConfigBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.JobExecutionBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.NodeGroupBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.NodeGroupTemplateBuilder;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.ServiceConfigBuilder;

/**
 * The Data Processing (Sahara) builders
 */
public interface DataProcessingBuilders {

    /**
     * The builder to create a sahara cluster
     *
     * @return the cluster builder
     */
    public ClusterBuilder cluster();

    /**
     * The builder to create a sahara cluster template
     *
     * @return the cluster template builder
     */
    public ClusterTemplateBuilder clusterTemplate();

    /**
     * The builder to create a sahara node group
     *
     * @return the node group builder
     */
    public NodeGroupBuilder nodeGroup();

    /**
     * The builder to create a sahara node group template
     *
     * @return the node group template builder
     */
    public NodeGroupTemplateBuilder nodeGroupTemplate();

    /**
     * The builder to create a sahara service configuration
     *
     * @return the service configuration builder
     */
    public ServiceConfigBuilder serviceConfig();

    /**
     * The builder which creates a sahara Data Source
     *
     * @return the data source builder
     */
    public DataSourceBuilder dataSource();

    /**
     * The builder which creates a sahara Job Binary
     *
     * @return the job binary builder
     */
    public JobBinaryBuilder jobBinary();

    /**
     * The builder which creates a sahara Job
     *
     * @return the job builder
     */
    public JobBuilder job();

    /**
     * The builder which creates a job configuration for sahara job execution
     *
     * @return the job config builder
     */
    public JobConfigBuilder jobConfig();

    /**
     * The builder which creates a sahara job execution
     *
     * @return the job execution builder
     */
    public JobExecutionBuilder jobExecution();


}
