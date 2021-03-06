/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.openstack.compute.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.common.Link;
import com.github.narcissujsk.openstackjsk.model.compute.Image;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

/**
 * An OpenStack image is a collection of files used to create a Server.  Users provide pre-built OS images by default and or custom
 * images can be built
 *
 * @author Jeremy Unruh
 */
@JsonRootName("image")
public class NovaImage implements Image {

	private static final long serialVersionUID = 1L;

  private String id;
	private Status status;
	private String name;
	private int progress;
	private int minRam;
	private int minDisk;
	private Date created;
	private Date updated;
	@JsonProperty("OS-EXT-IMG-SIZE:size")
	private long size;
	private List<GenericLink> links;
	@JsonProperty("metadata")
	private Map<String, Object> metadata;

	public NovaImage() {
	}

	public NovaImage(String empty) {
		if (!"".equals(empty)) {
			throw new IllegalArgumentException();
		}
	}



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
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getSize() {
		return size;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getMinDisk() {
		return minDisk;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getMinRam() {
		return minRam;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getProgress() {
		return progress;
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
	public Date getCreated() {
		return created;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date getUpdated() {
		return updated;
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
	public Map<String, Object> getMetaData() {
		return metadata;
	}

	/**
	 * {@inheritDoc}
	 */
	@JsonIgnore
    @Override
    public boolean isSnapshot() {
        return getMetaData() != null && getMetaData().containsKey("image_location") && "snapshot".equals(getMetaData().get("image_location"));
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
						.add("id", id).add("name", name).add("status", status).add("isSnapshot", isSnapshot())
						.add("progress", progress).add("size", size).add("minRam", minRam)
						.add("minDisk", minDisk).add("created", created).add("updated", updated)
						.add("metadata", metadata).add("links", links).addValue("\n")
						.toString();
	}

	public static class NovaImages extends ListResult<NovaImage> {

		private static final long serialVersionUID = 1L;

		@JsonProperty("images")
		private List<NovaImage> images;

		public List<NovaImage> value() {
			return images;
		}

	}
}
