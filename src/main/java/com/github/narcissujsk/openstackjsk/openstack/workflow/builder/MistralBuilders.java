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
package com.github.narcissujsk.openstackjsk.openstack.workflow.builder;

import com.github.narcissujsk.openstackjsk.model.workflow.builder.*;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralActionDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkbookDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowDefinition;
import com.github.narcissujsk.openstackjsk.openstack.workflow.domain.MistralWorkflowExecution;

/**
 * The Mistral v2 Builders.
 */
public class MistralBuilders implements WorkflowBuilders {

    @Override
    public WorkflowDefinitionBuilder workflowDefinition() {
        return MistralWorkflowDefinition.builder();
    }

    @Override
    public WorkbookDefinitionBuilder workbookDefinition() {
        return MistralWorkbookDefinition.builder();
    }

    @Override
    public ActionDefinitionBuilder actionDefinition() {
        return MistralActionDefinition.builder();
    }

    @Override
    public WorkflowExecutionBuilder workflowExecution() {
        return MistralWorkflowExecution.builder();
    }
}
