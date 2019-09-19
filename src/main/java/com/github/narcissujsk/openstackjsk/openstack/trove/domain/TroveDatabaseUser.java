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
package com.github.narcissujsk.openstackjsk.openstack.trove.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.narcissujsk.openstackjsk.model.trove.DatabaseUser;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DatabaseUserBuilder;
import com.github.narcissujsk.openstackjsk.openstack.common.ListResult;
import com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase;

import java.util.List;

/**
 * Model implementation for Database User
 *
 * @author sumit gandhi
 */

public class TroveDatabaseUser implements DatabaseUser {

    @JsonProperty("name")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("databases")
    List<com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase> troveDatabaseList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase> getTroveDatabaseList() {
        return troveDatabaseList;
    }

    public void setTroveDatabaseList(List<com.github.narcissujsk.openstackjsk.openstack.trove.domain.TroveDatabase> troveDatabaseList) {
        this.troveDatabaseList = troveDatabaseList;
    }

    @Override
    public DatabaseUserBuilder toBuilder() {
        return new DatabaseUserConcreteBuilder();
    }

    public static class DatabaseUsers extends ListResult<TroveDatabaseUser> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("users")
        private List<TroveDatabaseUser> troveDatabaseUserList;

        public List<TroveDatabaseUser> getTroveDatabaseUserList() {
            return troveDatabaseUserList;
        }

        public void setTroveDatabaseUserList(List<TroveDatabaseUser> troveDatabaseUserList) {
            this.troveDatabaseUserList = troveDatabaseUserList;
        }

        @Override
        protected List<TroveDatabaseUser> value() {
            return troveDatabaseUserList;
        }

    }

    public static class DatabaseUserConcreteBuilder implements DatabaseUserBuilder {

        private TroveDatabaseUser databaseUser;

        public DatabaseUserConcreteBuilder(TroveDatabaseUser troveDatabaseUser) {
            this.databaseUser = troveDatabaseUser;
        }

        public DatabaseUserConcreteBuilder() {
            this(new TroveDatabaseUser());
        }

        @Override
        public DatabaseUser build() {
            return databaseUser;
        }

        @Override
        public DatabaseUserBuilder from(DatabaseUser in) {
            this.databaseUser = (TroveDatabaseUser)in;
            return this;
        }

        @Override
        public DatabaseUserBuilder username(String username) {
            this.databaseUser.username = username;
            return this;
        }

        @Override
        public DatabaseUserBuilder password(String password) {
            this.databaseUser.password = password;
            return this;
        }

        @Override
        public DatabaseUserBuilder troveDatabaseList(List<TroveDatabase> troveDatabaseList) {
            this.databaseUser.troveDatabaseList = troveDatabaseList;
            return this;
        }
    }

    public static DatabaseUserBuilder builder() {
        return new DatabaseUserConcreteBuilder();
    }

}
