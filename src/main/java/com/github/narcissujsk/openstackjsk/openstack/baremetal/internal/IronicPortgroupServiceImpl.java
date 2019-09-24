package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.api.baremetal.IronicPortgroupService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Portgroup;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPortgroup;
import com.github.narcissujsk.openstackjsk.openstack.common.ListEntity;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;


public class IronicPortgroupServiceImpl extends BaseBaremetalServices implements IronicPortgroupService {

    private static final Logger LOG = LoggerFactory.getLogger(IronicPortgroupServiceImpl.class);

    @Override
    public List<? extends Portgroup> list() {
        return get(IronicPorts.class, uri("v1/portgroups")).execute().getList();
    }
    @Override
    public List<? extends Portgroup> list(boolean detail) {
        return get(IronicPorts.class, uri("v1/portgroups/detail")).execute().getList();
    }

    @Override
    public List<? extends Portgroup> list(Map<String, String> filteringParams) {
        Invocation<IronicPorts> invocation = get(IronicPorts.class, "v1/portgroups/detail");
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                invocation = invocation.param(entry.getKey(), entry.getValue());
            }
        }
        return invocation.execute().getList();
    }

    @Override
    public Portgroup get(String uuid) {
        checkNotNull(uuid);
        return get(IronicPortgroup.class, uri("v1/portgroups/%s", uuid)).execute();
    }


    @Override
    public Portgroup create(Portgroup portgroup) {
        checkNotNull(portgroup);
        return post(IronicPortgroup.class, uri("/v1/portgroups"))
                .entity(portgroup)
                .execute();
    }

    @Override
    public Portgroup update(String portgroupId, List<OpenstackUpdate> update) {
        checkNotNull(update);
        return  patch(IronicPortgroup.class, uri("/v1/portgroups/%s", portgroupId)).entity(new ListEntity<OpenstackUpdate>(update)).execute();

    }

    @Override
    public ActionResponse delete(String portgroupId) {
        checkNotNull(portgroupId);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/portgroups/%s", portgroupId)).executeWithResponse()
        );
    }


    public static class IronicPorts extends ListResult<IronicPortgroup> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("portgroups")
        private List<IronicPortgroup> portgroups;

        @Override
        public List<IronicPortgroup> value() {
            return portgroups;
        }
    }





}
