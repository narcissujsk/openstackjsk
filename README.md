# openstackjsk
openstack jdk

        <dependency>
            <groupId>com.github.narcissujsk</groupId>
            <artifactId>openstackjsk</artifactId>
            <version>1.3.2-SNAPSHOT</version>
        </dependency>
发布
mvn clean deploy -P release


#### add header "X-Openstack-Nova-Api-Version" 

now you can add header "X-Openstack-Nova-Api-Version" in the nova request 

use Config like 

Config config = Config.newConfig().withNovaApiVersion();

the default X-Openstack-Nova-Api-Version is 2.53

you can set it by   config.withNovaApiVersion("2.53");


#### add tags

in the NovaServer add attribute  "tags" 
