package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.api.baremetal.ConnectorService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Connector;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPortgroup;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.VolumeConnector;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;

import java.util.List;
import java.util.Map;

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
        return null;
    }

    @Override
    public Connector get(String uuid) {
        return null;
    }

    @Override
    public Connector create(Connector connector) {
        return null;
    }

    @Override
    public Connector update(String uuid, List<OpenstackUpdate> update) {
        return null;
    }

    @Override
    public ActionResponse delete(String uuid) {
        return null;
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
