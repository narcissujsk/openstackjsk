package com.github.narcissujsk.openstackjsk.openstack.murano.v1.internal;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.narcissujsk.openstackjsk.api.murano.v1.MuranoApplicationService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.Application;
import com.github.narcissujsk.openstackjsk.openstack.common.MapEntity;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.domain.MuranoApplication;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.utils.MuranoApplicationUtils;

import java.util.List;
import java.util.Map;

/**
 * @author Nikolay Mahotkin.
 */
public class MuranoApplicationServiceImpl extends BaseMuranoServices implements MuranoApplicationService {
    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Application> list(String environmentId, String sessionId) {
        Invocation<MuranoApplication.ApplicationList> invocation;

        invocation = get(
            MuranoApplication.ApplicationList.class,
            uri("/environments/%s/services", environmentId)
        );

        if (sessionId != null) {
            invocation.header("X-Configuration-Session", sessionId);
        }

        return invocation.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Application> list(String environmentId) {
        return list(environmentId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Application> get(String environmentId, String path, String sessionId) {
        Invocation<JsonNode> invocation;

        invocation = get(
            JsonNode.class,
            uri("/environments/%s/services/%s", environmentId, path)
        );

        if (sessionId != null) {
            invocation.header("X-Configuration-Session", sessionId);
        }

        return MuranoApplicationUtils.toApplications(invocation.execute());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Application> get(String environmentId, String path) {
        return get(environmentId, path, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Application create(String environmentId, String sessionId, Map<String, Object> data) {
        MapEntity entity = new MapEntity();
        entity.putAll(data);

        Invocation<MuranoApplication> invocation;

        invocation = post(MuranoApplication.class, uri("/environments/%s/services//", environmentId))
            .header("X-Configuration-Session", sessionId)
            .entity(entity);

        return invocation.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Application> create(String environmentId, String sessionId, String jsonString) {
        Invocation<MuranoApplication.ApplicationList> invocation;
        MuranoApplication.ApplicationList toCreate = MuranoApplicationUtils.toApplications(jsonString);

        invocation = post(MuranoApplication.ApplicationList.class, uri("/environments/%s/services//", environmentId))
            .header("X-Configuration-Session", sessionId)
            .entity(toCreate);

        return invocation.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Application update(String environmentId, String sessionId, Map<String, Object> data) {
        MapEntity entity = new MapEntity();
        entity.putAll(data);

        Invocation<MuranoApplication> invocation;

        invocation = put(MuranoApplication.class, uri("/environments/%s/services//", environmentId))
            .header("X-Configuration-Session", sessionId)
            .entity(entity);

        return invocation.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Application> update(String environmentId, String sessionId, String jsonString) {
        Invocation<MuranoApplication.ApplicationList> invocation;
        MuranoApplication.ApplicationList toUpdate = MuranoApplicationUtils.toApplications(jsonString);

        invocation = put(MuranoApplication.ApplicationList.class, uri("/environments/%s/services//", environmentId))
            .header("X-Configuration-Session", sessionId)
            .entity(toUpdate);

        return invocation.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String environmentId, String path, String sessionId) {
        return deleteWithResponse(uri("/environments/%s/services/%s", environmentId, path))
            .header("X-Configuration-Session", sessionId)
            .execute();
    }
}
