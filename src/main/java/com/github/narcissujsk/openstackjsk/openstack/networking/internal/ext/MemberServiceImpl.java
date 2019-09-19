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
package com.github.narcissujsk.openstackjsk.openstack.networking.internal.ext;

import java.util.List;
import java.util.Map;
import com.github.narcissujsk.openstackjsk.api.networking.ext.MemberService;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.network.ext.Member;
import com.github.narcissujsk.openstackjsk.model.network.ext.MemberUpdate;
import com.github.narcissujsk.openstackjsk.openstack.compute.functions.ToActionResponseFunction;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronMember;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.NeutronMember.Members;
import com.github.narcissujsk.openstackjsk.openstack.networking.internal.BaseNetworkingServices;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * OpenStack (Neutron) Lbaas member based Operations
 * @author liujunpeng
 */
public class MemberServiceImpl extends BaseNetworkingServices implements MemberService {

    /**
     * {@inheritDoc}
     */
	public List<? extends Member> list() {

		return get(Members.class, uri("/lb/members")).execute().getList();
	}

    /**
     * {@inheritDoc}
     */
	public List<? extends Member> list(Map<String, String> filteringParams) {
		Invocation<Members> req = get(Members.class, uri("/lb/members"));
		if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
            	req = req.param(entry.getKey(), entry.getValue());
            }
        }
		return req.execute().getList();
	}

    /**
     * {@inheritDoc}
     */
	public Member get(String memberId) {
		checkNotNull(memberId);
		return get(NeutronMember.class,uri("/lb/members/%s",memberId)).execute();
	}
	
    /**
     * {@inheritDoc}
     */
	public ActionResponse delete(String memberId){
		checkNotNull(memberId);
		return ToActionResponseFunction.INSTANCE.apply(
                delete(Void.class, uri("/lb/members/%s", memberId)).executeWithResponse());
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public Member create(Member member) {
		checkNotNull(member);
		return post(NeutronMember.class, uri("/lb/members")).entity(member).execute();
	}
	
    /**
     * {@inheritDoc}
     */
	@Override
	public Member update(String memberId,MemberUpdate member) {
		checkNotNull(memberId);
		checkNotNull(member);
		return put(NeutronMember.class, uri("/lb/members/%s",memberId)).entity(member).execute();
	}
	
	
}
