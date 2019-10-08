package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.api.baremetal.ConnectorService;
import com.github.narcissujsk.openstackjsk.api.baremetal.TargetService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPortgroup;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.VolumeConnector;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.VolumeTarget;
import com.github.narcissujsk.openstackjsk.openstack.common.ListEntity;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @program: openstackjsk
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-30 15:40
 **/
public class TargetServiceImpl extends BaseBaremetalServices  implements TargetService {
    @Override
    public List<? extends Target> list() {
        return get(VolumeTargets.class, uri("/v1/volume/targets")).execute().getList();
    }

    @Override
    public List<? extends Target> list(Map<String, String> filteringParams) {
        Invocation<VolumeTargets> invocation = get(VolumeTargets.class, "/v1/volume/targets");
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                invocation = invocation.param(entry.getKey(), entry.getValue());
            }
        }
        return invocation.execute().getList();
    }

    @Override
    public Target get(String uuid) {
        checkNotNull(uuid);
        return get(VolumeTarget.class, uri("/v1/volume/targets/%s", uuid)).execute();
    }

    @Override
    public Target create(Target target) {
        checkNotNull(target);
        return post(VolumeTarget.class, uri("/v1/volume/targets"))
                .entity(target)
                .execute();
    }

    @Override
    public Target update(String uuid, List<OpenstackUpdate> update) {
        checkNotNull(update);
        return  patch(VolumeTarget.class, uri("/v1/volume/targets/%s", uuid)).entity(new ListEntity<OpenstackUpdate>(update)).execute();

    }

    @Override
    public ActionResponse delete(String uuid) {
        checkNotNull(uuid);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/volume/targets/%s", uuid)).executeWithResponse()
        );
    }

    public static class VolumeTargets extends ListResult<VolumeTarget> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("targets")
        private List<VolumeTarget> targets;

        @Override
        public List<VolumeTarget> value() {
            return targets;
        }
    }
}
