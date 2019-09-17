package com.github.narcissujsk.openstackjsk.model.magnum;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.Buildable.Builder;
import com.github.narcissujsk.openstackjsk.model.magnum.Label;
import com.github.narcissujsk.openstackjsk.model.magnum.Pod;

public interface PodBuilder extends Builder<PodBuilder, com.github.narcissujsk.openstackjsk.model.magnum.Pod> {
    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getId
     */
    PodBuilder id(String id);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getUuid
     */
    PodBuilder uuid(String uuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getName
     */
    PodBuilder name(String name);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getDesc
     */
    PodBuilder desc(String desc);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getBayUuid
     */
    PodBuilder bayUuid(String bayUuid);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getImages
     */
    PodBuilder images(List<String> images);

    /**
     * @see com.github.narcissujsk.openstackjsk.model.magnum.Pod#getLabels
     */
    PodBuilder labels(Label labels);

    /**
     * @see Pod#getStatus
     */
    PodBuilder status(String status);

}
