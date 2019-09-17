package com.github.narcissujsk.openstackjsk.openstack.manila.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.model.manila.Share;
import com.github.narcissujsk.openstackjsk.model.manila.ShareSnapshot;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import java.util.List;

/**
 * A share snapshot is a point-in-time, read-only copy of the data that is contained in a share.
 *
 * @author Daniel Gonzalez Nothnagel
 */
@JsonRootName("snapshot")
public class ManilaShareSnapshot implements ShareSnapshot {
    private static final long serialVersionUID = 1L;

    private String id;
    private Status status;
    @JsonProperty("share_id")
    private String shareId;
    private String name;
    private List<GenericLink> links;
    private String description;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("share_proto")
    private Share.Protocol shareProto;
    @JsonProperty("share_size")
    private Integer shareSize;
    private Integer size;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getShareId() {
        return shareId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends Link> getLinks() {
        return links;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Share.Protocol getShareProto() {
        return shareProto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getShareSize() {
        return shareSize;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getSize() {
        return size;
    }

    public static class ShareSnapshots extends ListResult<ManilaShareSnapshot> {
        private static final long serialVersionUID = 1L;

        @JsonProperty("snapshots")
        private List<ManilaShareSnapshot> snapshots;

        @Override
        protected List<ManilaShareSnapshot> value() {
            return snapshots;
        }
    }
}
