package com.github.narcissujsk.openstackjsk.api.baremetal;

import com.github.narcissujsk.openstackjsk.common.RestService;

/**
 * @program: openstackjsk
 * @description:
 * @author: jiangsk@inspur.com
 * @create: 2019-09-30 15:31
 **/
public interface  IronicVolumeService  extends RestService {

    ConnectorService connectors();

    TargetService targets();


}
