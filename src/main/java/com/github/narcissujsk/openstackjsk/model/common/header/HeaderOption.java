package com.github.narcissujsk.openstackjsk.model.common.header;

import com.github.narcissujsk.openstackjsk.model.common.header.HeaderNameValue;

/**
 * Transforms an Option into a Header based name and value
 * 
 * @author Jeremy Unruh
 */
public interface HeaderOption {

    /**
     * Transform the option into a Header
     * 
     * @return the header name value object
     */
    HeaderNameValue toHeader();
}
