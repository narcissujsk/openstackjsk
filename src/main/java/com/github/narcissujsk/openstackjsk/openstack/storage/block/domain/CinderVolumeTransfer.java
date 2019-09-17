package com.github.narcissujsk.openstackjsk.openstack.storage.block.domain;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Date;
import java.util.List;

import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.model.storage.block.VolumeTransfer;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Represents a Volume Transfer Entity which is used for creating a volume transfer
 *
 * @author Jeremy Unruh
 */
@JsonRootName("transfer")
public class CinderVolumeTransfer implements VolumeTransfer {

    private static final long serialVersionUID = 126124717679358069L;
    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty("auth_key")
    private String authKey;
    @JsonProperty("volume_id")
    private String volumeId;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty
    private List<GenericLink> links;

    public static CinderVolumeTransfer create(String volumeId, String name) {
        CinderVolumeTransfer r = new CinderVolumeTransfer();
        r.volumeId = volumeId;
        r.name = name;
        return r;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthKey() {
        return authKey;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String getVolumeId() {
        return volumeId;
    }

    @Override
    public List<? extends Link> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return toStringHelper(this).omitNullValues()
                .add("id", id).add("name", name).add("authKey", authKey)
                .add("volumeId", volumeId).add("createdAt", createdAt).add("links", links)
                .toString();
    }

    public static class VolumeTransferList extends ListResult<CinderVolumeTransfer> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("transfers")
        private List<CinderVolumeTransfer> results;

        @Override
        protected List<CinderVolumeTransfer> value() {
            return results;
        }

    }
}
