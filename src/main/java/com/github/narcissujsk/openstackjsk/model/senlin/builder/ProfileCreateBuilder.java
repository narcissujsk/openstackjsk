package com.github.narcissujsk.openstackjsk.model.senlin.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.senlin.ProfileCreate;

import java.util.Map;

/**
 * This interface describes a builder for {@link ProfileCreate} objects
 * 
 * @author lion
 */
public interface ProfileCreateBuilder extends Buildable.Builder<ProfileCreateBuilder, ProfileCreate> {

	/**
	 *  Add the name for the profile.
	 *
	 * @param name The name for the profile.
	 * @return ProfileCreateBuilder
	 */
	ProfileCreateBuilder name(String name);

	/**
	 *  Add detailed specification based on the chosen profile type.
	 *
	 * @param spec The detailed specification based on the chosen profile type.
	 * @return ProfileCreateBuilder
	 */
	ProfileCreateBuilder spec(Map<String, Object> spec);

	/**
	 *  Add a list of key and value pairs to associate with the profile.
	 *
	 * @param metadata The list of key and value pairs to associate with the profile.
	 * @return ProfileCreateBuilder
	 */
	ProfileCreateBuilder metadata(Map<String, Map> metadata);


}
