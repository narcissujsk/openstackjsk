package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.senlin.Profile;
import com.github.narcissujsk.openstackjsk.model.senlin.builder.ProfileCreateBuilder;

/**
 * This interface describes the model of a {@link Profile}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface ProfileCreate extends ModelEntity, Buildable<ProfileCreateBuilder> {

}
