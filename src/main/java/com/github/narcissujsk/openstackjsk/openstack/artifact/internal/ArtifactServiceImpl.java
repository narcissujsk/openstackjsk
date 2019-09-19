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
package com.github.narcissujsk.openstackjsk.openstack.artifact.internal;

import com.github.narcissujsk.openstackjsk.api.Apis;
import com.github.narcissujsk.openstackjsk.api.artifact.ArtifactService;
import com.github.narcissujsk.openstackjsk.api.artifact.ToscaTemplatesArtifactService;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactType;
import com.github.narcissujsk.openstackjsk.model.artifact.Artifacts;
import com.github.narcissujsk.openstackjsk.model.artifact.ToscaTemplatesArtifacts;

/**
 * Created by vadavi on 18-01-2017.
 */
public class ArtifactServiceImpl implements ArtifactService {


    @Override
    public ToscaTemplatesArtifactService toscaTemplatesArtifact() {
        return Apis.get(ToscaTemplatesArtifactService.class);
    }
}
