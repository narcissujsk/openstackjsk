package com.github.narcissujsk.openstackjsk.api.networking.ext;

import java.util.List;
import java.util.Map;

import com.github.narcissujsk.openstackjsk.common.RestService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.Member;
import com.github.narcissujsk.openstackjsk.model.network.ext.MemberUpdate;
/**
 * Networking (Neutron) Lbaas member Extension API
 * @author liujunpeng
 *
 */
public interface MemberService extends RestService {
    /**
     * List all members  that the current tenant has access to
     *
     * @return list of all Member
     */
    List<? extends Member> list();

    /**
     * Returns list of member filtered by parameters.
     * 
     * @param filteringParams map (name, value) of filtering parameters
     * @return 
     */
    List<? extends Member> list(Map<String, String> filteringParams);


    /**
     * Get the specified member by ID
     *
     * @param memberId the member identifier
     * @return the member or null if not found
     */
    Member get(String memberId);
    
    /**
     * Delete the specified member by ID
     * @param memberId the member identifier
     * @return the action response
     */
    ActionResponse delete(String memberId);
    /**
     * Create a member
     * @param member Member
     * @return Member
     */
    Member create(Member member);
    /**
     * Update a member
     * @param memberId the member identifier
     * @param member MemberUpdate
     * @return Member
     */
    Member update(String memberId, MemberUpdate member);
}
