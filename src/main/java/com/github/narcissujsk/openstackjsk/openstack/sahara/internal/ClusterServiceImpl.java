package com.github.narcissujsk.openstackjsk.openstack.sahara.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.sahara.ClusterService;
import com.github.narcissujsk.openstackjsk.core.transport.ExecutionOptions;
import com.github.narcissujsk.openstackjsk.core.transport.propagation.PropagateOnStatus;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.sahara.Cluster;
import com.github.narcissujsk.openstackjsk.model.sahara.NodeGroup;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaCluster;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaCluster.Clusters;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.SaharaClusterUnwrapped;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.actions.SaharaActions.AddNodeGroupAction;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.actions.SaharaActions.ResizeNodeGroupAction;

/**
 * Sahara Data Processing Operations
 * 
 * @author ekasit.kijsipongse@nectec.or.th
 */
public class ClusterServiceImpl extends BaseSaharaServices implements ClusterService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Cluster> list() {
        return get(Clusters.class, uri("/clusters")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cluster get(String clusterId) {
        checkNotNull(clusterId);
        return get(SaharaCluster.class, uri("/clusters/%s", clusterId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cluster create(Cluster cluster) {
        checkNotNull(cluster);
        SaharaClusterUnwrapped unwrapped = new SaharaClusterUnwrapped(cluster);
        return post(SaharaCluster.class, uri("/clusters"))
                     .entity(unwrapped)  // setup request
                     .execute();
       
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String clusterId) {
        checkNotNull(clusterId);
        return deleteWithResponse(uri("/clusters/%s", clusterId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cluster resizeNodeGroup(String clusterId, String groupName, int count) {
        checkNotNull(clusterId);
        checkNotNull(groupName);
        return put(SaharaCluster.class, uri("/clusters/%s", clusterId)).entity(new ResizeNodeGroupAction(groupName,count)).execute(ExecutionOptions.<SaharaCluster>create(PropagateOnStatus.on(404))); // Use respongse progagation for "Not found" status to throw exception instead of return null
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cluster addNodeGroup(String clusterId, NodeGroup nodeGroup) {
        checkNotNull(clusterId);
        checkNotNull(nodeGroup);
        return put(SaharaCluster.class, uri("/clusters/%s", clusterId)).entity(new AddNodeGroupAction(nodeGroup)).execute(ExecutionOptions.<SaharaCluster>create(PropagateOnStatus.on(404))); // Use respongse progagation for "Not found" status to throw exception instead of return null
    }

}
