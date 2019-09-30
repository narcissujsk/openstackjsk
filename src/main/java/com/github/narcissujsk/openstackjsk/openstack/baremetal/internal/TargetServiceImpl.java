package com.github.narcissujsk.openstackjsk.openstack.baremetal.internal;

import com.github.narcissujsk.openstackjsk.api.baremetal.TargetService;
import com.github.narcissujsk.openstackjsk.model.baremetal.Target;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.openstack.common.OpenstackUpdate;

import java.util.List;
import java.util.Map;

/**
 * @program: openstackjsk
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-30 15:41
 **/
public class TargetServiceImpl  extends BaseBaremetalServices implements TargetService {
    @Override
    public List<? extends Target> list() {
        return null;
    }

    @Override
    public List<? extends Target> list(Map<String, String> filteringParams) {
        return null;
    }

    @Override
    public Target get(String uuid) {
        return null;
    }

    @Override
    public Target create(Target target) {
        return null;
    }

    @Override
    public Target update(String uuid, List<OpenstackUpdate> update) {
        return null;
    }

    @Override
    public ActionResponse delete(String uuid) {
        return null;
    }
}
