package com.github.narcissujsk.openstackjsk.openstack.identity.v3.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.github.narcissujsk.openstackjsk.core.transport.ClientConstants.PATH_PROJECTS;

import java.util.List;

import com.github.narcissujsk.openstackjsk.api.identity.v3.ProjectService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Project;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneProject;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.KeystoneProject.Projects;

public class ProjectServiceImpl extends BaseIdentityServices implements ProjectService  {

	@Override
	public Project create(Project project) {
		checkNotNull(project);
		return post(KeystoneProject.class, PATH_PROJECTS).entity(project).execute();
	}

    @Override
    public Project create(String domainId, String name, String description, boolean enabled) {
        checkNotNull(domainId);
        checkNotNull(name);
        checkNotNull(description);
        checkNotNull(enabled);
        return create(KeystoneProject.builder().domainId(domainId).name(name).description(description).enabled(enabled).build());
    }

    @Override
    public Project get(String projectId) {
        checkNotNull(projectId);
        return get(KeystoneProject.class, PATH_PROJECTS, "/", projectId).execute();
    }

    @Override
    public List<? extends Project> getByName(String projectName) {
        checkNotNull(projectName);
        return get(Projects.class, uri(PATH_PROJECTS)).param("name", projectName).execute().getList();
    }

    @Override
    public Project getByName(String projectName, String domainId) {
        checkNotNull(projectName);
        checkNotNull(domainId);
        return get(Projects.class, uri(PATH_PROJECTS)).param("name", projectName).param("domain_id", domainId).execute().first();
    }

    @Override
    public Project update(Project project) {
        checkNotNull(project);
        return patch(KeystoneProject.class, PATH_PROJECTS, "/", project.getId()).entity(project).execute();
    }

    @Override
    public ActionResponse delete(String projectId) {
        checkNotNull(projectId);
        return deleteWithResponse(PATH_PROJECTS, "/", projectId).execute();
    }

    @Override
    public List<? extends Project> list() {
        return get(Projects.class, uri(PATH_PROJECTS)).execute().getList();
    }

}
