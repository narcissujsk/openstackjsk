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
package com.github.narcissujsk.openstackjsk.model.identity.v3;

import java.util.List;

import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.ResourceEntity;

public interface Authentication extends ModelEntity {

    Identity getIdentity();

    Scope getScope();

    public interface Identity {

        Password getPassword();

        Token getToken();

        List<String> getMethods();

        public interface Password {

            User getUser();

            public interface User extends ResourceEntity {

                Domain getDomain();

                String getPassword();

                public interface Domain extends ResourceEntity {
                }
            }
        }

        public interface Token {

            String getId();

        }

    }

    public interface Scope {

        Project getProject();

        Domain getDomain();

        public interface Project extends ResourceEntity {

            Domain getDomain();
        }

        public interface Domain extends ResourceEntity {
        }

    }

}
