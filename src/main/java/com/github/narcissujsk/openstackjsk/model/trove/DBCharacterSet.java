/*******************************************************************************
 * 	Copyright 2019 ContainX and OpenStack4j
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.github.narcissujsk.openstackjsk.model.trove;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by sumit gandhi on 9/3/2016.
 */
public enum DBCharacterSet {

    UTF8,
    UTF16,
    UTF32,
    UNRECOGNIZED
    ;

    @JsonValue
    public String value() { return name().toLowerCase(); }

    @JsonCreator
    public static DBCharacterSet value(String paramType) {
        try {
            return valueOf(paramType.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            return UNRECOGNIZED;
        }
    }
}
