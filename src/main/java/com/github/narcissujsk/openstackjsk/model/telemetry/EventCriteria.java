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
package com.github.narcissujsk.openstackjsk.model.telemetry;

import com.google.common.collect.Lists;
import com.github.narcissujsk.openstackjsk.openstack.internal.Parser;

import java.util.Date;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Query options used in retrieving Events
 * 
 * @author Jeremy Unruh
 * @author Miroslav Lacina
 */
public class EventCriteria {

    public enum Oper {
        /** Less Than : < */
        LT("lt"),
        /** Greater Than : > */
        GT("gt"),
        /** Less Than Equals : <= */
        LTE("le"),
        /** Greater Than Equals : >= */
        GTE("ge"),
        /** Equals : = */
        EQUALS("eq")
        ;
        private final String queryValue;
        Oper(String queryValue) {
            this.queryValue = queryValue;
        }
        
        public String getQueryValue() {
            return queryValue;
        }
    }
    
    private List<NameOpValue> params = Lists.newArrayList();
    
    public static EventCriteria create() {
        return new EventCriteria();
    }

    /**
     * Matches the given event type
     * @param eventType the resource id
     * @return EventCriteria
     */
    public EventCriteria eventType(String eventType) {
        checkNotNull(eventType, "eventType must not be null");
        return add("event_type", Oper.EQUALS, eventType);
    }

    /**
     * Matches the given message identifier
     * @param messageId the message id
     * @return EventCriteria
     */
    public EventCriteria messageId(String messageId) {
        checkNotNull(messageId, "messageId must not be null");
        return add("message_id", Oper.EQUALS, messageId);
    }
    
    /**
     * Adds the start timestamp event criteria
     * @param operator the operator
     * @param value the date for this timestamp
     * @return EventCriteria
     */
    public EventCriteria startTimestamp(Oper operator, Date value) {
        checkNotNull(value, "Date must not be null");
        return add("start_timestamp", operator, Parser.toISO8601DateFormat(value));
    }

    /**
     * Adds the end timestamp event criteria
     * @param operator the operator
     * @param value the date for this timestamp
     * @return EventCriteria
     */
    public EventCriteria endTimestamp(Oper operator, Date value) {
        checkNotNull(value, "Date must not be null");
        return add("end_timestamp", operator, Parser.toISO8601DateFormat(value));
    }
    
    /**
     * Adds an adhoc field criteria
     * @param field the field name (will be treated as trait name and applied on trait)
     * @param operator the operator
     * @param value the value
     * @return EventCriteria
     */
    public EventCriteria add(String field, Oper operator, Number value) {
        checkNotNull(value, "Value must not be null");
        return add(field, operator, value.toString());
    }

    /**
     * Adds an adhoc field criteria
     * @param field the field name (will be treated as trait name and applied on trait)
     * @param operator the operator
     * @param value the value
     * @return EventCriteria
     */
    public EventCriteria add(String field, Oper operator, String value) {
        checkNotNull(field, "Field must not be null");
        checkNotNull(operator, "Operator must not be null");
        checkNotNull(value, "Value must not be null");

        params.add(new NameOpValue(field, operator, value));
        return this;
    }
    
    /**
     * @return the criteria parameters for this query
     */
    public List<NameOpValue> getCriteriaParams() {
        return params;
    }
    
    public static class NameOpValue {
        private final String field;
        private final Oper operator;
        private String value;
        
        NameOpValue(String field, Oper operator, Comparable<?> value) {
            this.field = field;
            this.operator = operator;
            if (value instanceof Date) 
                this.value = Parser.toISO8601DateFormat(Date.class.cast(value));
            else
                this.value = String.valueOf(value);
        }
        
        public String getField() {
            return field;
        }
        
        public Oper getOperator() {
            return operator;
        }
        
        public String getValue() {
            return value;
        }
    }
}
