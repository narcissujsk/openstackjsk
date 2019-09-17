package com.github.narcissujsk.openstackjsk.openstack.common;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

public interface Auth extends ModelEntity {

	public enum Type { CREDENTIALS, TOKEN, RAX_APIKEY, TOKENLESS }

}
