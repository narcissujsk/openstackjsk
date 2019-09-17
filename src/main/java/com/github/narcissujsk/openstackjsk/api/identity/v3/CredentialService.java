package com.github.narcissujsk.openstackjsk.api.identity.v3;

import java.util.List;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.identity.v3.Credential;

/**
 * Identity V3 Credential service
 *
 */
public interface CredentialService extends RestService {

    /**
     * Create a new credential
     *
     * @param credential the credential
     * @return the newly created credential
     */
    Credential create(Credential credential);

    /**
     * Create a new credential
     *
     * @param blob the credential itself as serialized blob
     * @param type the credential type such as 'ec2', 'cert', ..
     * @param projectId the id of the associated project
     * @param userId the id of the user who owns the credential
     * @return
     */
    Credential create(String blob, String type, String projectId, String userId);

    /**
     * Get details for a credential
     *
     * @param credentialId the id of the credential object
     * @return the credential
     */
    Credential get(String credentialId);

    /**
     * Update credentials
     *
     * @param credential the credential set to update
     * @return the updated credential
     */
    Credential update(Credential credential);

    /**
     * Delete credential
     *
     * @param credentialId the id of the credential object
     * @return the ActionResponse
     */
    ActionResponse delete(String credentialId);

    /**
     * List all credentials
     *
     * @return list of credentials
     */
    List<? extends Credential> list();

}
