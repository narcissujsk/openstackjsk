package com.github.narcissujsk.openstackjsk.openstack.common;

import java.util.HashMap;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * A generic MetaData model class which is just a Map of Key to Value
 * 
 * @author Jeremy Unruh
 */
@JsonRootName("metadata")
public class Metadata extends HashMap<String, String> implements ModelEntity {

    private static final long serialVersionUID = 1L;

    public static Metadata toMetadata(Map<String, String> from) {
        Metadata md = new Metadata();
        md.putAll(from);
        return md;
    }
    
}
