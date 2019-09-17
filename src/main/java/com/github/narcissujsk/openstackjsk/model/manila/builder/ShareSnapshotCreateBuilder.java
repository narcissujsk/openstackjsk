package com.github.narcissujsk.openstackjsk.model.manila.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.manila.ShareSnapshotCreate;

/**
 * Builds a {@link ShareSnapshotCreate}.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareSnapshotCreateBuilder extends Buildable.Builder<ShareSnapshotCreateBuilder, ShareSnapshotCreate> {
    /**
     * Set the UUID of the share from which to create a snapshot.
     *
     * @param shareId the share ID
     * @return ShareSnapshotCreateBuilder
     */
    ShareSnapshotCreateBuilder shareId(String shareId);

    /**
     * Set whether snapshot creation is enabled when a share is busy.
     *
     * @param force whether snapshot creation is forced
     * @return ShareSnapshotCreateBuilder
     */
    ShareSnapshotCreateBuilder force(boolean force);

    /**
     * Set the snapshot name.
     *
     * @param name the snapshot name
     * @return ShareSnapshotCreateBuilder
     */
    ShareSnapshotCreateBuilder name(String name);

    /**
     * Set the snapshot name.
     *
     * The Shared File Systems API supports the use of both <code>name</code> and <code>display_name</code> attributes,
     * which are inherited attributes from the Block Storage API.
     *
     * @param displayName the snapshot name
     * @return ShareSnapshotCreateBuilder
     */
    ShareSnapshotCreateBuilder displayName(String displayName);

    /**
     * Set the snapshot description.
     *
     * @param description the snapshot description
     * @return ShareSnapshotCreateBuilder
     */
    ShareSnapshotCreateBuilder description(String description);

    /**
     * Set the snapshot description.
     *
     * The Shared File Systems API supports the use of both <code>description</code> and
     * <code>display_description</code> parameters, which are inherited attributes from the Block Storage API.
     *
     * @param displayDescription the snapshot description
     * @return ShareSnapshotCreateBuilder
     */
    ShareSnapshotCreateBuilder displayDescription(String displayDescription);
}
