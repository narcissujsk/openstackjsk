package com.github.narcissujsk.openstackjsk.model.image.v2.builder;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.image.v2.Task;

import java.util.Map;

/**
 * Builder for Glance V2 tasks
 * @author emjburns
 */
public interface TaskBuilder extends Buildable.Builder<TaskBuilder, Task> {
    /**
     * @see Task#getType()
     */
    TaskBuilder type(String type);

    /**
     * @see Task#getInput()
     */
    TaskBuilder input(Map<String, Object> input);
}
