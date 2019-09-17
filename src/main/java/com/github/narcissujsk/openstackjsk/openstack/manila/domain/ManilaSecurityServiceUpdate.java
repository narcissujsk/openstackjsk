package com.github.narcissujsk.openstackjsk.openstack.manila.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.manila.SecurityService;
import com.github.narcissujsk.openstackjsk.model.manila.SecurityServiceUpdateOptions;

/**
 * Object used to update existing security services.
 *
 * @author Daniel Gonzalez Nothnagel
 */
@JsonRootName("security_service")
public class ManilaSecurityServiceUpdate implements ModelEntity {
    private static final long serialVersionUID = 1L;

    private SecurityService.Type type;
    private String name;
    private String description;
    @JsonProperty("dns_ip")
    private String dnsIp;
    private String user;
    private String password;
    private String domain;
    private String server;

    private ManilaSecurityServiceUpdate() {}

    /**
     * Creates a security service from options.
     * This can be used to update an existing security service.
     *
     * @param options the security service update options
     * @return a security service with the given options
     */
    public static ManilaSecurityServiceUpdate fromOptions(SecurityServiceUpdateOptions options) {
        ManilaSecurityServiceUpdate securityServiceUpdate = new ManilaSecurityServiceUpdate();
        securityServiceUpdate.type = options.getType();
        securityServiceUpdate.name = options.getName();
        securityServiceUpdate.description = options.getDescription();
        securityServiceUpdate.dnsIp = options.getDnsIp();
        securityServiceUpdate.user = options.getUser();
        securityServiceUpdate.password = options.getPassword();
        securityServiceUpdate.domain = options.getDomain();
        securityServiceUpdate.server = options.getServer();

        return securityServiceUpdate;
    }
}
