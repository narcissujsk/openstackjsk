package com.github.narcissujsk.openstackjsk.openstack.compute.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.api.compute.ComputeImageService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.compute.Image;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.MetaDataWrapper;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaImage;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaImage.NovaImages;

/**
 * Provides access to Compute Images.
 *
 * @author Jeremy Unruh
 */
public class ComputeImageServiceImpl extends BaseComputeServices implements ComputeImageService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends Image> list() {
		return list(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends Image> list(boolean detailed) {
		String uri = (detailed) ? "/images/detail" : "/images";
		return get(NovaImages.class, uri(uri)).execute().getList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image get(String imageId) {
		checkNotNull(imageId);
		return get(NovaImage.class, uri("/images/%s", imageId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse delete(String imageId) {
		checkNotNull(imageId);
		return deleteWithResponse(uri("/images/%s", imageId)).execute();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, String> setMetaData(String imageId, Map<String, String> metadata) {
		checkNotNull(imageId);
		checkNotNull(metadata);
		return post(MetaDataWrapper.class, uri("/images/%s/metadata", imageId)).entity(MetaDataWrapper.wrap(metadata)).execute().getMetaData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActionResponse deleteMetaData(String imageId, String... keys) {
		checkNotNull(imageId);
		for (String k : keys)
		{
			ActionResponse resp  = deleteWithResponse(uri("/images/%s/metadata/%s", imageId, k)).execute();
			if (!resp.isSuccess())
			    return resp;
		}
		return ActionResponse.actionSuccess();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, String> getMetaData(String imageId) {
		checkNotNull(imageId);
		return get(MetaDataWrapper.class, uri("/images/%s/metadata", imageId)).execute().getMetaData();
	}

}
