package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.api.baremetal.ConnectorService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
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
public class ConnectorServiceImpl extends BaseBaremetalServices  implements ConnectorService {
    @Override
    public List<? extends Connector> list() {
        return get(VolumeConnectors.class, uri("/v1/volume/connectors")).execute().getList();
    }

    @Override
    public List<? extends Connector> list(Map<String, String> filteringParams) {
        Invocation<VolumeConnectors> invocation = get(VolumeConnectors.class, "/v1/volume/connectors");
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                invocation = invocation.param(entry.getKey(), entry.getValue());
            }
        }
        return invocation.execute().getList();
    }

    @Override
    public Connector get(String uuid) {
        checkNotNull(uuid);
        return get(VolumeConnector.class, uri("/v1/volume/connectors/%s", uuid)).execute();
    }

    @Override
    public Connector create(Connector connector) {
        checkNotNull(connector);
        return post(VolumeConnector.class, uri("/v1/volume/connectors"))
                .entity(connector)
                .execute();
    }

    @Override
    public Connector update(String uuid, List<OpenstackUpdate> update) {
        checkNotNull(update);
        return  patch(VolumeConnector.class, uri("/v1/volume/connectors/%s", uuid)).entity(new ListEntity<OpenstackUpdate>(update)).execute();

    }

    @Override
    public ActionResponse delete(String uuid) {
        checkNotNull(uuid);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/volume/connectors/%s", uuid)).executeWithResponse()
        );
    }

    public static class VolumeConnectors extends ListResult<VolumeConnector> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("connectors")
        private List<VolumeConnector> connectors;

        @Override
        public List<VolumeConnector> value() {
            return connectors;
        }
    }
}
