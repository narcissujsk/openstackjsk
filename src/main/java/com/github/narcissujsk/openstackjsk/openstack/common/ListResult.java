package com.github.narcissujsk.openstackjsk.openstack.common;

import java.util.Collections;
import java.util.List;

import com.github.narcissujsk.openstackjsk.core.transport.ListType;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;

/**
 * A List result which wrappers a JSON Array
 *
 * @param <T> the generic type
 */
public abstract class ListResult<T> implements ModelEntity, ListType {

	private static final long serialVersionUID = 1L;

	protected abstract List<T> value();
	
	public List<T> getList() {
		if (value() == null) {
            return Collections.emptyList();
        }
		return value();
	}

	
    public T first() {
    	return value().isEmpty() ? null : value().get(0);   	
    }
}
