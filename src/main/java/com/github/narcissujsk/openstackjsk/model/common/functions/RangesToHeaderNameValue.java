package com.github.narcissujsk.openstackjsk.model.common.functions;

import com.github.narcissujsk.openstackjsk.model.common.header.HeaderNameValue;
import com.github.narcissujsk.openstackjsk.model.common.header.Range;

import com.google.common.base.Function;

/**
 * Transforms a Header Range array into a single HeaderNameValue object
 * 
 * @author Jeremy Unruh
 */
public class RangesToHeaderNameValue implements Function<Range[], HeaderNameValue> {

    public static final RangesToHeaderNameValue INSTANCE = new RangesToHeaderNameValue();
    
    @Override
    public HeaderNameValue apply(Range[] input) {
        if (input == null || input.length == 0)
            return null;

        if (input.length == 1)
            return input[0].toHeader();
        
        String name = input[0].toHeader().getName();
        StringBuilder value = new StringBuilder(String.valueOf(input[0].toHeader().getValue()));
        
        for (int i = 1; i < input.length; i++) {
            value.append(",");
            value.append(input[i].value());
        }
        
        return new HeaderNameValue(name, value.toString());
    }

}
