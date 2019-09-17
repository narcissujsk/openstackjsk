package com.github.narcissujsk.openstackjsk.model.sahara.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.sahara.ClusterTemplate;
import com.github.narcissujsk.openstackjsk.model.sahara.NodeGroup;
import com.github.narcissujsk.openstackjsk.model.sahara.ServiceConfig;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.ClusterTemplateBuilder;

/**
 * Builder interface used for {@link ClusterTemplate} object.
 * 
 * @author Ekasit Kijsipongse
 */
public interface ClusterTemplateBuilder extends Builder<ClusterTemplateBuilder, ClusterTemplate> {

        //
        // Define setter apis for user to create a new cluster template
        //
        
	/**
	 * See {@link ClusterTemplate#getPluginName()}
	 * 
	 * @param pluginName the name of the sahara plugin
	 * @return ClusterTemplateBuilder
	 */
	ClusterTemplateBuilder pluginName(String pluginName);

	/**
	 * See {@link ClusterTemplate#getHadoopVersion()}
	 * 
	 * @param hadoopVersion the version of hadoop
	 * @return ClusterTemplateBuilder
	 */
	ClusterTemplateBuilder hadoopVersion(String hadoopVersion);

         /**
          * Add a node group
          *
          * @param nodeGroup the node group
          * @return this builder
          */
        ClusterTemplateBuilder addNodeGroup(NodeGroup nodeGroup);

	/**
	 * See {@link ClusterTemplate#getName()}
	 * 
	 * @param name the name of the cluster template
	 * @return ClusterTemplateBuilder
	 */
	ClusterTemplateBuilder name(String name);
	
	/**
	 * See {@link ClusterTemplate#getDescription()}
	 * 
	 * @param description the description of cluster template
	 * @return ClusterTemplateBuilder
	 */
	ClusterTemplateBuilder description(String description);


        /**
         * See {@link ClusterTemplate#getNeutronManagementNetworkId()}
         * 
         * @param  networkId the id of management network
         * @return ClusterTemplateBuilder
         */
        ClusterTemplateBuilder managementNetworkId(String networkId);

         /**
          * Add a cluster config
          *
          * @param name the service name
          * @param config the config
          * @return this builder
          */
        ClusterTemplateBuilder addServiceConfig(String name, ServiceConfig config);

}
