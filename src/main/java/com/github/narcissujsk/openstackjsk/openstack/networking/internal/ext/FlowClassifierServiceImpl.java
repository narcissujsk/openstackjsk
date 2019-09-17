package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.networking.ext.FlowClassifierService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.FlowClassifier;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronFlowClassifier;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronFlowClassifier.FlowClassifiers;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;

/**
 * {@inheritDoc}
 */
public class FlowClassifierServiceImpl extends BaseNetworkingServices implements FlowClassifierService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends FlowClassifier> list() {
        return get(FlowClassifiers.class, uri("/sfc/flow_classifiers")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowClassifier create(FlowClassifier flowClassifier) {
        checkNotNull(flowClassifier);
        return post(NeutronFlowClassifier.class, uri("/sfc/flow_classifiers")).entity(flowClassifier).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String flowClassifierId) {
        checkNotNull(flowClassifierId);
        return deleteWithResponse(uri("/sfc/flow_classifiers/%s", flowClassifierId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowClassifier get(String flowClassifierId) {
        checkNotNull(flowClassifierId);
        return get(NeutronFlowClassifier.class, uri("/sfc/flow_classifiers/%s", flowClassifierId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlowClassifier update(String flowClassifierId, FlowClassifier flowClassifier) {
        checkNotNull(flowClassifierId);
        return put(NeutronFlowClassifier.class, uri("/sfc/flow_classifiers/%s", flowClassifierId)).entity(flowClassifier).execute();
    }

}
