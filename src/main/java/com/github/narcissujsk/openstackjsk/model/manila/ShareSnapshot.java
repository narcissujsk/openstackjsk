package com.github.narcissujsk.openstackjsk.model.manila;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.model.manila.Share;

import java.util.List;

/**
 * A share snapshot is a point-in-time, read-only copy of the data that is contained in a share.
 *
 * @author Daniel Gonzalez Nothnagel
 */
public interface ShareSnapshot extends ModelEntity {
    enum Status {
        AVAILABLE, ERROR, CREATING, DELETING, ERROR_DELETING;

        @JsonCreator
        public static Status value(String v) {
            return valueOf(v.toUpperCase());
        }

        @JsonValue
        public String value() {
            return name().toLowerCase();
        }
    }

    /**
     * @return the UUID of the snapshot
     */
    String getId();

    /**
     * @return the snapshot status
     */
    Status getStatus();

    /**
     * @return the UUID of the source share that was used to create the snapshot
     */
    String getShareId();

    /**
     * @return the snapshot name
     */
    String getName();

    /**
     * @return The share snapshot links
     */
    List<? extends Link> getLinks();

    /**
     * @return the snapshot description
     */
    String getDescription();

    /**
     * @return the date and time stamp when the snapshot was created
     */
    String getCreatedAt();

    /**
     * @return the file system protocol of a share snapsho
     */
    Share.Protocol getShareProto();

    /**
     * @return the size of a source share, in GBs
     */
    Integer getShareSize();

    /**
     * @return the snapshot size, in GBs
     */
    Integer getSize();
}
