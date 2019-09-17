package com.github.narcissujsk.openstackjsk.openstack.sahara.domain.actions;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.Builders;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.sahara.NodeGroup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;

/**
 * Simple Actions Classes used for Sahara Action 
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */
//@SuppressWarnings("serial")
public final class SaharaActions {
    
    public static class ResizeNodeGroupAction implements ModelEntity {

        private static final long serialVersionUID = 1L;
        
        @JsonProperty("resize_node_groups")
        List<NodeGroup> nodeGroups; 
        
        public ResizeNodeGroupAction(String groupName,int count) { 
            NodeGroup nodeGroup = Builders.nodeGroup().name(groupName)
                                     .count(count).build();
            nodeGroups = Lists.newArrayList();
            nodeGroups.add(nodeGroup);
        }
    }
    
    public static class AddNodeGroupAction implements ModelEntity {

        private static final long serialVersionUID = 1L;
        
        @JsonProperty("add_node_groups")
        List<NodeGroup> nodeGroups; 
        
        public AddNodeGroupAction(NodeGroup nodeGroup) { 
            nodeGroups = Lists.newArrayList();
            nodeGroups.add(nodeGroup);
        }
    }
}
