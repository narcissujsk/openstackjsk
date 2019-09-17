package com.github.narcissujsk.openstackjsk.openstack.manila.internal;

import com.github.narcissujsk.openstackjsk.api.manila.QuotaSetService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.manila.QuotaSet;
import com.github.narcissujsk.openstackjsk.model.manila.QuotaSetUpdateOptions;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaQuotaSet;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.ManilaQuotaSetUpdate;

import static com.google.common.base.Preconditions.checkNotNull;

public class QuotaSetServiceImpl extends BaseShareServices implements QuotaSetService {
    @Override
    public QuotaSet get(String tenantId) {
        return get(tenantId, null);
    }

    @Override
    public QuotaSet get(String tenantId, String userId) {
        checkNotNull(tenantId);

        return get(ManilaQuotaSet.class, uri("/os-quota-sets/%s", tenantId))
                .param(userId != null, "user_id", userId)
                .execute();
    }

    @Override
    public QuotaSet update(String tenantId, QuotaSetUpdateOptions options) {
        return update(tenantId, null, options);
    }

    @Override
    public QuotaSet update(String tenantId, String userId, QuotaSetUpdateOptions options) {
        checkNotNull(tenantId);
        checkNotNull(options);

        return put(ManilaQuotaSet.class, uri("/os-quota-sets/%s", tenantId))
                .param(userId != null, "user_id", userId)
                .entity(ManilaQuotaSetUpdate.fromOptions(options))
                .execute();
    }

    @Override
    public ActionResponse delete(String tenantId) {
        return delete(tenantId, null);
    }

    @Override
    public ActionResponse delete(String tenantId, String userId) {
        checkNotNull(tenantId);

        return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/os-quota-sets/%s", tenantId))
                        .param(userId != null, "user_id", userId)
                        .executeWithResponse());
    }

    @Override
    public QuotaSet getDefault(String tenantId) {
        checkNotNull(tenantId);

        return get(ManilaQuotaSet.class, uri("/os-quota-sets/%s/defaults", tenantId)).execute();
    }
}
