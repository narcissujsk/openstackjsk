package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.api.baremetal.IronicPortService;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPort;
import com.github.narcissujsk.openstackjsk.openstack.common.ListEntity;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;


public class IronicPortServiceImpl extends BaseBaremetalServices implements IronicPortService {

    private static final Logger LOG = LoggerFactory.getLogger(IronicPortServiceImpl.class);

    @Override
    public List<? extends Port> list() {
        return get(IronicPorts.class, uri("v1/ports")).execute().getList();
    }
    @Override
    public List<? extends Port> list(boolean detail) {
        return get(IronicPorts.class, uri("v1/ports/detail")).execute().getList();
    }

    @Override
    public Port get(String uuid) {
        checkNotNull(uuid);
        return get(IronicPort.class, uri("v1/ports/%s", uuid)).execute();
    }


    @Override
    public Port create(Port port) {
        checkNotNull(port);
        return post(IronicPort.class, uri("/v1/ports"))
                .entity(port)
                .execute();
    }

    @Override
    public Port update(String portid, List<OpenstackUpdate> update) {
        checkNotNull(update);
        return  patch(IronicPort.class, uri("/v1/ports/%s", portid)).entity(new ListEntity<OpenstackUpdate>(update)).execute();

    }

    @Override
    public ActionResponse delete(String portid) {
        checkNotNull(portid);
        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/v1/ports/%s", portid)).executeWithResponse()
        );
    }


    public static class IronicPorts extends ListResult<IronicPort> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("ports")
        private List<IronicPort> ports;

        @Override
        public List<IronicPort> value() {
            return ports;
        }
    }





}
