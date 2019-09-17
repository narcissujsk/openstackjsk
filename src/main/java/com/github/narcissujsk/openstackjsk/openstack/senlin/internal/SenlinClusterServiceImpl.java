package com.github.narcissujsk.openstackjsk.openstack.senlin.internal;

import com.github.narcissujsk.openstackjsk.api.senlin.SenlinClusterService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.senlin.ActionID;
import com.github.narcissujsk.openstackjsk.model.senlin.Cluster;
import com.github.narcissujsk.openstackjsk.model.senlin.ClusterActionCreate;
import com.github.narcissujsk.openstackjsk.model.senlin.ClusterCreate;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinActionID;
import com.github.narcissujsk.openstackjsk.openstack.senlin.domain.SenlinCluster;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class contains getters for all implementation of the available cluster services
 * 
 * @author lion
 */
public class SenlinClusterServiceImpl extends BaseSenlinServices implements SenlinClusterService {

	@Override
	public List<? extends Cluster> list() {
		return get(SenlinCluster.Cluster.class, uri("/clusters")).execute().getList();
	}

	@Override
	public Cluster get(String clusterID) {
		checkNotNull(clusterID);
		return get(SenlinCluster.class, uri("/clusters/%s", clusterID)).execute();
	}

	@Override
	public Cluster create(ClusterCreate newCluster) {
		checkNotNull(newCluster);
		return post(SenlinCluster.class, uri("/clusters")).entity(newCluster).execute();
	}

	@Override
	public ActionResponse delete(String clusterID) {
		checkNotNull(clusterID);
		return deleteWithResponse(uri("/clusters/%s", clusterID)).execute();
	}

	@Override
	public Cluster update(String clusterID, ClusterCreate newCluster) {
		checkNotNull(clusterID);
		checkNotNull(newCluster);
		return patch(SenlinCluster.class, uri("/clusters/%s", clusterID)).entity(newCluster).execute();
	}

	@Override
	public ActionID action(String clusterID, ClusterActionCreate newClusterAction) {
		checkNotNull(clusterID);
		checkNotNull(newClusterAction);
		return post(SenlinActionID.class, uri("/clusters/%s/actions", clusterID)).entity(newClusterAction).execute();
	}

}
