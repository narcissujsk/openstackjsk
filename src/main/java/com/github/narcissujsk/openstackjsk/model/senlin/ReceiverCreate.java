package com.github.narcissujsk.openstackjsk.model.senlin;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.senlin.Receiver;
import com.github.narcissujsk.openstackjsk.model.senlin.builder.ReceiverCreateBuilder;

/**
 * This interface describes the model of a {@link Receiver}, before it is sent to
 * the server for creation
 * 
 * @author lion
 * 
 */
public interface ReceiverCreate extends ModelEntity, Buildable<ReceiverCreateBuilder> {

}
