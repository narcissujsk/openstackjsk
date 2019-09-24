
package com.github.narcissujsk.openstackjsk.openstack.common;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.common.Update;
import com.github.narcissujsk.openstackjsk.model.common.builder.UpdateBuilder;

import java.util.List;

/**
 * @author jiangsk
 */
public class OpenstackUpdate implements Update {

    @JsonProperty("op")
    private String op;
    @JsonProperty("path")
    private String path;
    @JsonProperty("value")
    private String value;


    @Override
    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }


    @Override
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public UpdateConcreteBuilder toBuilder() {
        return new UpdateConcreteBuilder(this);
    }

    public static UpdateConcreteBuilder builder() {
        return new UpdateConcreteBuilder();
    }

    public static class Updates extends ListResult<OpenstackUpdate> {

        @Override
        protected List<OpenstackUpdate> value() {
            return null;
        }
    }

    public static class UpdateConcreteBuilder implements UpdateBuilder {

        private OpenstackUpdate update;

        UpdateConcreteBuilder() {
            this(new OpenstackUpdate());
        }

        UpdateConcreteBuilder(OpenstackUpdate update) {
            this.update = update;
        }

        @Override
        public UpdateBuilder op(String op) {
            update.op = op;
            return this;
        }

        @Override
        public UpdateBuilder path(String path) {
            update.path = path;
            return this;
        }

        @Override
        public UpdateBuilder value(String value) {
            update.value = value;
            return this;
        }

        @Override
        public OpenstackUpdate build() {
            return update;
        }



        @Override
        public UpdateBuilder from(OpenstackUpdate in) {
            this.update = (OpenstackUpdate) in;
            return this;
        }

    }
}
