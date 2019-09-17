package com.github.narcissujsk.openstackjsk.openstack.manila.domain.actions;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.manila.ShareSnapshot;

/**
 * Actions used for share snapshot action invocation.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public class ShareSnapshotActions {
    @JsonRootName("os-reset_status")
    public static class ResetStateAction implements ShareSnapshotAction {
        private ShareSnapshot.Status status;

        ResetStateAction(ShareSnapshot.Status status) {
            this.status = status;
        }

        public ShareSnapshot.Status getStatus() {
            return status;
        }
    }

    @JsonRootName("os-force_delete")
    public static class ForceDeleteAction implements ShareSnapshotAction {}

    public static ResetStateAction resetState(ShareSnapshot.Status status) {
        return new ResetStateAction(status);
    }

    public static ForceDeleteAction forceDelete() {
        return new ForceDeleteAction();
    }
}
