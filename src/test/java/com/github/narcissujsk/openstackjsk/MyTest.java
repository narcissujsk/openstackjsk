package com.github.narcissujsk.openstackjsk;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.narcissujsk.openstackjsk.api.Builders;
import com.github.narcissujsk.openstackjsk.api.OSClient;
import com.github.narcissujsk.openstackjsk.api.OSClient.*;
import com.github.narcissujsk.openstackjsk.core.transport.Config;
import com.github.narcissujsk.openstackjsk.model.artifact.ArtifactUpdate;
import com.github.narcissujsk.openstackjsk.model.baremetal.*;
import com.github.narcissujsk.openstackjsk.model.common.ActionResponse;
import com.github.narcissujsk.openstackjsk.model.common.Identifier;
import com.github.narcissujsk.openstackjsk.model.compute.Action;
import com.github.narcissujsk.openstackjsk.model.compute.Flavor;
import com.github.narcissujsk.openstackjsk.model.compute.ServerCreate;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.Target;
import org.junit.Test;
import com.github.narcissujsk.openstackjsk.openstack.OSFactory;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class MyTest {
    Logger logger = Logger.getLogger("RequestBuilder");

   // @Test
    public void test() {
        OSClientV3 os = getOpenstackClient();
        Flavor flavor= Builders.flavor().build();
        //os.compute().flavors().create(flavor);
        System.out.println("test");
    }
    @Test
    public void get() {
        OSClientV3 os = getOpenstackClient();
        Node  node = os.baremetal().nodes().get("test");
        logger.info(node);
        logger.info(node.getName());
    }
    //@Test
    public void poweron() throws JsonProcessingException {
        NodePowerState powerState=NodePowerState.POWEROFF;
        logger.info(powerState.name());
        logger.info(powerState.getTarget());
        logger.info(powerState.getClass().getName());
        ObjectMapper mapper = new ObjectMapper();
        Target target=new Target();
        target.setTarget("power on");
        String re = mapper.writeValueAsString(target);
        logger.info(re);
        OSClientV3 os = getOpenstackClient();
        ActionResponse list = os.baremetal().nodes().provision("test", NodeProvisionState.DELETED);
        logger.info(list);
    }
    //@Test
    public void delete() {
        OSClientV3 os = getOpenstackClient();
        ActionResponse list = os.baremetal().nodes().delete("test");
        logger.info(list);
    }

   // @Test
    public void getPorts() {
        OSClientV3 os = getOpenstackClient();
        List<? extends Port> list = os.baremetal().ports().list(true);
        logger.info(list);
    }

    //@Test
    public void getPort() {
        OSClientV3 os = getOpenstackClient();
        Port re = os.baremetal().ports().get("a033fa08-fd5a-4cab-bae4-6772b94019cc");
        logger.info(re==null);
        logger.info(re);
    }

   // @Test
    public void deletePort() {
        OSClientV3 os = getOpenstackClient();
        ActionResponse re = os.baremetal().ports().delete("48ab54ec-33c9-4fee-8ccd-2c51ec851c26");
        logger.info(re);
    }
    //48ab54ec-33c9-4fee-8ccd-2c51ec851c26
    //@Test
    public void createPort() {
        OSClientV3 os = getOpenstackClient();
        Port port = Builders.ironicPort().address("6c:92:bf:74:81:42").nodeUuid("a033fa08-fd5a-4cab-bae4-6772b94019cc").build();
        logger.info(port);
        Port re = os.baremetal().ports().create(port);
        logger.info(re.getUuid());

    }

    //@Test
    public void updatePort() {
        OSClientV3 os = getOpenstackClient();
        ArtifactUpdate up = Builders.artifactUpdate().op("add").path("/local_link_connection/switch_info").value("t").build();
        List uplist=new ArrayList<ArtifactUpdate>();
        uplist.add(up);
        Port re = os.baremetal().ports().update("34b95a0f-0f8a-4906-887d-d0ce5a86d718", uplist);
        logger.info(re);

    }

    //@Test
    public void updateNode() {
        OSClientV3 os = getOpenstackClient();
        ArtifactUpdate up = Builders.artifactUpdate().op("add").path("/driver_info/deploy_ramdisk").value("t").build();
        List uplist=new ArrayList<ArtifactUpdate>();
        uplist.add(up);
        Node re = os.baremetal().nodes().update("a033fa08-fd5a-4cab-bae4-6772b94019cc", uplist);
        logger.info(re);

    }
   // @Test
    public void create() {
        OSClientV3 os = getOpenstackClient();
        NodeCreate node =Builders.node().name("test")
                .driver("fake").build();
        Node list = os.baremetal().nodes().create(node);
        logger.info(list);
    }

    public void testCreate(){
        OSClientV3 os = getOpenstackClient();
        ServerCreate server = os.compute().servers().serverBuilder().flavor("").build();
        os.compute().servers().boot(server);
        os.compute().servers().instanceActions().list("");
    }

   // @Test
    public void testPoweron() {
        OSClientV3 os = getOpenstackClient();
        //List<? extends Project> list = os.identity().projects().list();
        ActionResponse re = os.compute().servers().action("a4dad9c8-4772-4fd2-b1b1-10d92ec1eab4", Action.START);
        List<? extends Node> list = os.baremetal().nodes().list();
        System.out.println("test");

        System.out.println(list.size());
        System.out.println(list.get(0).toString());
        for (int i = 0; i < list.size(); i++) {
            logger.info(list.get(i));
        }
        System.out.println("test");
    }

    public OSClientV3 getOpenstackClient() {
        String domainname = "Default";
        String v3url = "https://10.110.28.35:5000/v3";
        String name = "cps_admin";
        String password = "rnxjAmD24yGUZiF";
        Config config = Config.newConfig().withSSLVerificationDisabled();
        config.withIronicApiVersion("1.37");
        Identifier domainIdentifier = Identifier.byName(domainname);
        OSClientV3 os = OSFactory.builderV3().endpoint(v3url).credentials(name, password, domainIdentifier)
                .withConfig(config).authenticate().useRegion("inspurtest");
        return os;
    }
}
