package com.github.narcissujsk.openstackjsk.openstack.murano.v1.internal;

import com.github.narcissujsk.openstackjsk.api.murano.v1.MuranoSessionService;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.murano.v1.domain.AppCatalogSession;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.domain.MuranoEnvironment;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.domain.MuranoSession;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class implements all methods for manipulation of {@link MuranoEnvironment} objects.
 *
 * @author Nikolay Mahotkin
 *
 */
public class MuranoSessionServiceImpl extends BaseMuranoServices implements MuranoSessionService {
    /**
     * {@inheritDoc}
     */
    @Override
    public MuranoSession get(String environmentId, String sessionId) {
        checkNotNull(environmentId);
        checkNotNull(sessionId);
        return get(MuranoSession.class, uri("/environments/%s/sessions/%s", environmentId, sessionId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuranoSession configure(String environmentId) {
        checkNotNull(environmentId);
        return post(MuranoSession.class, uri("/environments/%s/configure", environmentId))
                .execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String environmentId, String sessionId) {
        checkNotNull(environmentId);
        checkNotNull(sessionId);
        return deleteWithResponse(uri("/environments/%s/sessions/%s", environmentId, sessionId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse deploy(String environmentId, String sessionId) {
        checkNotNull(environmentId);
        checkNotNull(sessionId);
        return post(ActionResponse.class, uri("/environments/%s/sessions/%s/deploy", environmentId, sessionId))
                .execute();
    }
}
