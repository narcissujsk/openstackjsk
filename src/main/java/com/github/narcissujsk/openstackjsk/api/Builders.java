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
package com.github.narcissujsk.openstackjsk.api;

import com.github.narcissujsk.openstackjsk.model.artifact.builder.ArtifactUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.artifact.builder.ToscaTemplatesArtifactBuilder;
import com.github.narcissujsk.openstackjsk.model.barbican.Secret;
import com.github.narcissujsk.openstackjsk.model.barbican.builder.ContainerCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.barbican.builder.ContainerSecretBuilder;
import com.github.narcissujsk.openstackjsk.model.barbican.builder.SecretCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.BaremetalBuilders;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.IronicPortgroupBuilder;
import com.github.narcissujsk.openstackjsk.model.baremetal.builder.NodeCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.common.builder.LinkBuilder;
import com.github.narcissujsk.openstackjsk.model.compute.builder.*;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.DNSV2Builders;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.RecordsetBuilder;
import com.github.narcissujsk.openstackjsk.model.dns.v2.builder.ZoneBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.ExternalPolicyBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.ExternalRoutesBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.ExternalSegmentBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.L2PolicyBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.L3PolicyBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.NatPoolBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.NetworkServicePolicyBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyActionCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyActionUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyClassifierBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyClassifierUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyRuleBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyRuleSetBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyTargetBuilder;
import com.github.narcissujsk.openstackjsk.model.gbp.builder.PolicyTargetGroupBuilder;
import com.github.narcissujsk.openstackjsk.model.heat.*;
import com.github.narcissujsk.openstackjsk.model.heat.builder.*;
import com.github.narcissujsk.openstackjsk.model.identity.v2.builder.IdentityV2Builders;
import com.github.narcissujsk.openstackjsk.model.identity.v3.builder.*;
import com.github.narcissujsk.openstackjsk.model.image.builder.ImageBuilder;
import com.github.narcissujsk.openstackjsk.model.image.v2.builder.ImageUpdateBuilder;
import com.github.narcissujsk.openstackjsk.model.image.v2.builder.TaskBuilder;
import com.github.narcissujsk.openstackjsk.model.magnum.BaymodelBuilder;
import com.github.narcissujsk.openstackjsk.model.manila.builder.*;
import com.github.narcissujsk.openstackjsk.model.murano.v1.builder.EnvironmentBuilder;
import com.github.narcissujsk.openstackjsk.model.murano.v1.builder.AppCatalogBuilders;
import com.github.narcissujsk.openstackjsk.model.network.builder.*;
import com.github.narcissujsk.openstackjsk.model.network.ext.builder.*;
import com.github.narcissujsk.openstackjsk.model.sahara.builder.*;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.BlockQuotaSetBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.StorageBuilders;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeBackupCreateBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeSnapshotBuilder;
import com.github.narcissujsk.openstackjsk.model.storage.block.builder.VolumeTypeBuilder;
import com.github.narcissujsk.openstackjsk.model.tacker.builder.NfvBuilders;
import com.github.narcissujsk.openstackjsk.model.telemetry.builder.AlarmBuilder;
import com.github.narcissujsk.openstackjsk.model.telemetry.builder.TelemetryBuilders;
import com.github.narcissujsk.openstackjsk.model.trove.builder.DBServiceBuilders;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ArtifactUpdateModel;
import com.github.narcissujsk.openstackjsk.openstack.artifact.domain.ToscaTemplates;
import com.github.narcissujsk.openstackjsk.model.workflow.builder.WorkflowBuilders;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanContainer;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanContainerSecret;
import com.github.narcissujsk.openstackjsk.openstack.barbican.domain.BarbicanSecret;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.builder.IronicBuilders;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicNodeCreate;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPort;
import com.github.narcissujsk.openstackjsk.openstack.baremetal.domain.IronicPortgroup;
import com.github.narcissujsk.openstackjsk.openstack.common.GenericLink;
import com.github.narcissujsk.openstackjsk.openstack.compute.builder.NovaBuilders;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.*;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaSecGroupExtension.SecurityGroupRule;
import com.github.narcissujsk.openstackjsk.openstack.compute.domain.NovaServerCreate;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.builder.DesignateV2Builders;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateRecordset;
import com.github.narcissujsk.openstackjsk.openstack.dns.v2.domain.DesignateZone;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpExternalPolicyCreate;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpExternalRoutes;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpExternalSegment;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpL2Policy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpL3Policy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpNatPool;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpNetworkServicePolicy;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyAction;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyActionUpdate;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyClassifier;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyClassifierUpdate;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyRule;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyRuleSet;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyTarget;
import com.github.narcissujsk.openstackjsk.openstack.gbp.domain.GbpPolicyTargetGroupCreate;
import com.github.narcissujsk.openstackjsk.openstack.heat.builder.HeatBuilders;
import com.github.narcissujsk.openstackjsk.openstack.heat.domain.*;
import com.github.narcissujsk.openstackjsk.openstack.identity.v2.builder.KeystoneV2Builders;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.builder.KeystoneV3Builders;
import com.github.narcissujsk.openstackjsk.openstack.identity.v3.domain.*;
import com.github.narcissujsk.openstackjsk.openstack.image.domain.GlanceImage;
import com.github.narcissujsk.openstackjsk.openstack.image.v2.domain.GlanceImageUpdate;
import com.github.narcissujsk.openstackjsk.openstack.image.v2.domain.GlanceTask;
import com.github.narcissujsk.openstackjsk.openstack.magnum.MagnumBaymodel;
import com.github.narcissujsk.openstackjsk.openstack.manila.builder.ManilaBuilders;
import com.github.narcissujsk.openstackjsk.openstack.manila.domain.*;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.builder.MuranoBuilders;
import com.github.narcissujsk.openstackjsk.openstack.murano.v1.domain.MuranoEnvironment;
import com.github.narcissujsk.openstackjsk.openstack.networking.builder.NeutronBuilders;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.*;
import com.github.narcissujsk.openstackjsk.openstack.networking.domain.ext.*;
import com.github.narcissujsk.openstackjsk.openstack.octavia.builder.OctaviaBuilders;
import com.github.narcissujsk.openstackjsk.openstack.sahara.builder.SaharaBuilders;
import com.github.narcissujsk.openstackjsk.openstack.sahara.domain.*;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.builder.CinderBuilders;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderBlockQuotaSet;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderVolume;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderVolumeBackupCreate;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderVolumeSnapshot;
import com.github.narcissujsk.openstackjsk.openstack.storage.block.domain.CinderVolumeType;
import com.github.narcissujsk.openstackjsk.openstack.tacker.builders.TackerBuilders;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.builder.CeilometerBuilders;
import com.github.narcissujsk.openstackjsk.openstack.telemetry.domain.CeilometerAlarm;
import com.github.narcissujsk.openstackjsk.openstack.trove.builder.TroveBuilders;
import com.github.narcissujsk.openstackjsk.openstack.workflow.builder.MistralBuilders;

/**
 * A utility class to quickly access available Builders within the OpenStack API
 *
 * @author Jeremy Unruh
 */
public class Builders {

    /**
     * The builder to create a Link
     *
     * @return the link builder
     */
    public static LinkBuilder link() {
        return GenericLink.builder();
    }

    /**
     * The builder to create a Server
     *
     * @return the server create builder
     */
    public static ServerCreateBuilder server() {
        return NovaServerCreate.builder();
    }

    public static NodeCreateBuilder node() {
        return IronicNodeCreate.builder();
    }
    public static BaremetalBuilders baremetal() {
        return new IronicBuilders();
    }
    public static IronicPortBuilder ironicPort() {
        return  IronicPort.builder();
    }

    public static IronicPortgroupBuilder ironicPortgroup() {
        return  IronicPortgroup.builder();
    }
    public static BlockDeviceMappingBuilder blockDeviceMapping() {
        return NovaBlockDeviceMappingCreate.builder();
    }

    public static ExtraDhcpOptBuilder extraDhcpOpt() {
        return NeutronExtraDhcpOptCreate.builder();
    }

    /**
     * The builder to create a Flavor.
     *
     * @return the flavor builder
     */
    public static FlavorBuilder flavor() {
        return NovaFlavor.builder();
    }

    /**
     * The builder to create a ToscaTemplatesArtifact
     *
     * @return the ToscaTemplatesArtifactBuilder
     */
    public static ToscaTemplatesArtifactBuilder toscaTemplatesArtifact() {
        return ToscaTemplates.builder();
    }

    /**
     * The builder to update an Artifact
     *
     * @return the ArtifactUpdateBuilder
     */
    public static ArtifactUpdateBuilder artifactUpdate() {
        return ArtifactUpdateModel.builder();
    }

    /**
     * The builder to create a Network
     *
     * @return the network builder
     */
    public static NetworkBuilder network() {
        return NeutronNetwork.builder();
    }

    /**
     * The builder to create a Flow Classifier
     *
     * @return the Flow Classifier builder
     */
    public static FlowClassifierBuilder flowClassifier() {
        return NeutronFlowClassifier.builder();
    }

    /**
     * The builder to create a Port Pair
     *
     * @return the Port Pair builder
     */
    public static PortPairBuilder portPair() {
        return NeutronPortPair.builder();
    }

    /**
     * The builder to create a Port Pair Group
     *
     * @return the Port Pair Group builder
     */
    public static PortPairGroupBuilder portPairGroup() {
        return NeutronPortPairGroup.builder();
    }

    /**
     * The builder to create a Port Chain Group
     *
     * @return the Port Chain builder
     */
    public static PortChainBuilder portChain() {
        return NeutronPortChain.builder();
    }

    /**
     * The builder to create a Subnet
     *
     * @return the subnet builder
     */
    public static SubnetBuilder subnet() {
        return NeutronSubnet.builder();
    }

    /**
     * The builder to create a Port
     *
     * @return the port builder
     */
    public static PortBuilder port() {
        return NeutronPort.builder();
    }


    /**
     * The builder to create a Router
     *
     * @return the router builder
     */
    public static RouterBuilder router() {
        return NeutronRouter.builder();
    }

    /**
     * The builder to create a Glance Image
     *
     * @return the image builder
     */
    public static ImageBuilder image() {
        return GlanceImage.builder();
    }

    /**
     * The builder to create a Block Volume
     *
     * @return the volume builder
     */
    public static VolumeBuilder volume() {
        return CinderVolume.builder();
    }

    /**
     * The builder to create a Volume Type
     * 
     * @return the volume type builder
     */
    public static VolumeTypeBuilder volumeType() {
        return CinderVolumeType.builder();
    }

    /**
     * The builder to create a Block Volume Snapshot
     *
     * @return the snapshot builder
     */
    public static VolumeSnapshotBuilder volumeSnapshot() {
        return CinderVolumeSnapshot.builder();
    }
    
    /**
     * The builder to create a Block Volume Backup
     * @return the volume backup builder
     */
    public static VolumeBackupCreateBuilder volumeBackupCreate(){
    	return CinderVolumeBackupCreate.builder();
    }

    /**
     * The builder to create a Compute/Nova Floating IP
     *
     * @return the floating ip builder
     */
    public static FloatingIPBuilder floatingIP() {
        return NovaFloatingIP.builder();
    }

    /**
     * A Builder which creates a Security Group Rule
     *
     * @return the security group rule builder
     */
    public static SecurityGroupRuleBuilder secGroupRule() {
        return SecurityGroupRule.builder();
    }

    /**
     * The builder to create a Neutron Security Group
     *
     * @return the security group builder
     */
    public static NetSecurityGroupBuilder securityGroup() {
        return NeutronSecurityGroup.builder();
    }

    /**
     * The builder to update a security group
     *
     * @return the security group update builder
     */
    public static NetSecurityGroupUpdateBuilder securityGroupUpdate() {
        return NeutronSecurityGroupUpdate.builder();
    }

    /**
     * The builder to create a Neutron Security Group Rule
     *
     * @return the security group builder
     */
    public static NetSecurityGroupRuleBuilder securityGroupRule() {
        return NeutronSecurityGroupRule.builder();
    }

    /**
     * The builder to create a Neutron Floating IP Address
     *
     * @return the floating ip builder
     */
    public static NetFloatingIPBuilder netFloatingIP() {
        return NeutronFloatingIP.builder();
    }

    /**
     * The builder to create a {@link Template}
     *
     * @return the TemplateBuilder
     */
    public static TemplateBuilder template() {
        return HeatTemplate.build();
    }

    /**
     * The builder to create a {@link StackCreate}
     *
     * @return the StackCreate builder
     */
    public static StackCreateBuilder stack() {
        return HeatStackCreate.build();
    }

    /**
     * The builder to create a {@link SoftwareConfig}
     *
     * @return the software config builder
     */
    public static SoftwareConfigBuilder softwareConfig() {
        return new HeatSoftwareConfig.Builder();
    }

    /**
     * The builder to create a {@link StackUpdate}
     *
     * @return the StackUpdate builder
     */
    public static StackUpdateBuilder stackUpdate() {
        return HeatStackUpdate.builder();
    }

    /**
     * The builder to create a {@link ResourceHealth}
     * @return
     */
    public static ResourceHealthBuilder resourceHealth() {
        return HeatResourceHealth.builder();
    }

    /**
     * The builder to create NetQuota entities
     *
     * @return the NetQuota builder
     */
    public static NetQuotaBuilder netQuota() {
        return NeutronNetQuota.builder();
    }

    /**
     * The builder to update a network
     *
     * @return the NetworkUpdateBuilder
     */
    public static NetworkUpdateBuilder networkUpdate() {
        return NeutronNetworkUpdate.builder();
    }

    /**
     * The builder to create a lb member
     *
     * @return the Member Builder
     */
    public static MemberBuilder member() {
        return NeutronMember.builder();
    }

    /**
     * The builder to update a lb member
     *
     * @return the MemberUpdate Builder
     */
    public static MemberUpdateBuilder memberUpdate() {
        return NeutronMemberUpdate.builder();
    }

    /**
     * The builder to create and update a sessionPersistence
     *
     * @return SessionPersistenceBuilder
     */
    public static SessionPersistenceBuilder sessionPersistence() {
        return NeutronSessionPersistence.builder();
    }

    /**
     * The builder to create a vip.
     *
     * @return VipBuilder the vip builder
     */
    public static VipBuilder vip() {
        return NeutronVip.builder();
    }

    /**
     * The builder to update a vip.
     *
     * @return VipUpdateBuilder
     */
    public static VipUpdateBuilder vipUpdate() {
        return NeutronVipUpdate.builder();
    }

    /**
     * The builder to create a healthMonitor
     *
     * @return HealthMonitorBuilder
     */
    public static HealthMonitorBuilder healthMonitor() {
        return NeutronHealthMonitor.builder();
    }

    /**
     * The builder to update a healthMonitor
     *
     * @return HealthMonitorUpdateBuilder
     */
    public static HealthMonitorUpdateBuilder healthMonitorUpdate() {
        return NeutronHealthMonitorUpdate.builder();
    }

    /**
     * The builder to create a firewall
     *
     * @return FirewallBuilder
     */
    public static FirewallBuilder firewall() {
        return NeutronFirewall.builder();
    }

    /**
     * The builder to update a healthMonitor
     *
     * @return FirewallUpdateBuilder
     */
    public static FirewallUpdateBuilder firewallUpdate() {
        return NeutronFirewallUpdate.builder();
    }

    /**
     * The builder to create a firewallRule
     *
     * @return FirewallRuleBuilder
     */
    public static FirewallRuleBuilder firewallRule() {
        return NeutronFirewallRule.builder();
    }

    /**
     * The builder to update a firewallRule
     *
     * @return FirewallUpdateBuilder
     */
    public static FirewallRuleUpdateBuilder firewallRuleUpdate() {
        return NeutronFirewallRuleUpdate.builder();
    }

    /**
     * The builder to create a firewallPolicy
     *
     * @return FirewallPolicyBuilder
     */
    public static FirewallPolicyBuilder firewallPolicy() {
        return NeutronFirewallPolicy.builder();
    }

    /**
     * The builder to update a firewallPolicy
     *
     * @return FirewallPolicyUpdateBuilder
     */
    public static FirewallPolicyUpdateBuilder firewallPolicyUpdate() {
        return NeutronFirewallPolicyUpdate.builder();
    }

    /**
     * The builder to create a lbPool
     *
     * @return LbPoolBuilder
     */
    public static LbPoolBuilder lbPool() {
        return NeutronLbPool.builder();
    }

    /**
     * The builder to update a lbPool
     *
     * @return LbPoolUpdateBuilder
     */
    public static LbPoolUpdateBuilder lbPoolUpdate() {
        return NeutronLbPoolUpdate.builder();
    }

    /**
     * The builder to create a lbPool
     *
     * @return HealthMonitorAssociateBuilder
     */
    public static HealthMonitorAssociateBuilder lbPoolAssociateHealthMonitor() {
        return NeutronHealthMonitorAssociate.builder();
    }

    /**
     * The builder to create a sahara cluster
     *
     * @return the cluster builder
     */
    public static ClusterBuilder cluster() {
        return SaharaCluster.builder();
    }

    /**
     * The builder to create a sahara cluster template
     *
     * @return the cluster template builder
     */
    public static ClusterTemplateBuilder clusterTemplate() {
        return SaharaClusterTemplate.builder();
    }

    /**
     * The builder to create a sahara node group
     *
     * @return the node group builder
     */
    public static NodeGroupBuilder nodeGroup() {
        return SaharaNodeGroup.builder();
    }

    /**
     * The builder to create a sahara node group template
     *
     * @return the node group template builder
     */
    public static NodeGroupTemplateBuilder nodeGroupTemplate() {
        return SaharaNodeGroupTemplate.builder();
    }

    /**
     * The builder to create a sahara service configuration
     *
     * @return the service configuration builder
     */
    public static ServiceConfigBuilder serviceConfig() {
        return SaharaServiceConfig.builder();
    }

    /**
     * This builder which creates a QuotaSet for updates
     *
     * @return the QuotaSet update builder
     */
    public static QuotaSetUpdateBuilder quotaSet() {
        return NovaQuotaSetUpdate.builder();
    }

    /**
     * The builder to create an Alarm
     *
     * @return the image builder
     */
    public static AlarmBuilder alarm() {
        return CeilometerAlarm.builder();
    }

    /**
     * The builder which creates a BlockQuotaSet
     *
     * @return the block quota-set builder
     */
    public static BlockQuotaSetBuilder blockQuotaSet() {
        return CinderBlockQuotaSet.builder();
    }

    /**
     * The builder which creates a sahara Data Source
     *
     * @return the data source builder
     */
    public static DataSourceBuilder dataSource() {
        return SaharaDataSource.builder();
    }

    /**
     * The builder which creates a sahara Job Binary
     *
     * @return the job binary builder
     */
    public static JobBinaryBuilder jobBinary() {
        return SaharaJobBinary.builder();
    }

    /**
     * The builder which creates a sahara Job
     *
     * @return the job builder
     */
    public static JobBuilder job() {
        return SaharaJob.builder();
    }

    /**
     * The builder which creates a job configuration for sahara job execution
     *
     * @return the job config builder
     */
    public static JobConfigBuilder jobConfig() {
        return SaharaJobConfig.builder();
    }

    /**
     * The builder which creates a sahara job execution
     *
     * @return the job execution builder
     */
    public static JobExecutionBuilder jobExecution() {
        return SaharaJobExecution.builder();
    }

    /**
     * The builder which creates manila security services
     *
     * @return the security service builder
     */
    public static SecurityServiceCreateBuilder securityService() {
        return ManilaSecurityServiceCreate.builder();
    }

    /**
     * The builder which creates manila share networks.
     *
     * @return the share network builder
     */
    public static ShareNetworkCreateBuilder shareNetwork() {
        return ManilaShareNetworkCreate.builder();
    }

    /**
     * The builder which creates manila shares.
     *
     * @return the share builder
     */
    public static ShareCreateBuilder share() {
        return ManilaShareCreate.builder();
    }

    /**
     * The builder which creates share types.
     *
     * @return the shae type builder
     */
    public static ShareTypeCreateBuilder shareType() {
        return ManilaShareTypeCreate.builder();
    }

    /**
     * The builder which creates manila share snapshots.
     *
     * @return the share builder
     */
    public static ShareSnapshotCreateBuilder shareSnapshot() {
        return ManilaShareSnapshotCreate.builder();
    }

    /**
     * The builder which creates manila share manages
     *
     * @return the share manage builder
     */
    public static ShareManageBuilder shareManage() {
        return ManilaShareManage.builder();
    }

    /**
     * The builder to create a Region
     *
     * @return the region builder
     */
    public static RegionBuilder region() {
        return KeystoneRegion.builder();
    }

    /**
     * The builder to create a Credential.
     *
     * @return the credential builder
     */
    public static CredentialBuilder credential() {
        return KeystoneCredential.builder();
    }

    /**
     * The builder to create a Domain.
     *
     * @return the domain builder
     */
    public static DomainBuilder domain() {
        return KeystoneDomain.builder();
    }

    /**
     * The builder to create a Endpoint.
     *
     * @return the endpoint builder
     */
    public static EndpointBuilder endpoint() {
        return KeystoneEndpoint.builder();
    }

    /**
     * The builder to create a Group.
     *
     * @return the group builder
     */
    public static GroupBuilder group() {
        return KeystoneGroup.builder();
    }

    /**
     * The builder to create a Policy.
     *
     * @return the policy builder
     */
    public static PolicyBuilder policy() {
        return KeystonePolicy.builder();
    }

    /**
     * The builder to create a Project.
     *
     * @return the project builder
     */
    public static ProjectBuilder project() {
        return KeystoneProject.builder();
    }

    /**
     * The builder to create a Role.
     *
     * @return the role builder
     */
    public static RoleBuilder role() {
        return KeystoneRole.builder();
    }

    /**
     * The builder to create a Service.
     *
     * @return the service builder
     */
    public static ServiceBuilder service() {
        return KeystoneService.builder();
    }

    /**
     * The builder to create a User.
     *
     * @return the user builder
     */
    public static UserBuilder user() {
        return KeystoneUser.builder();
    }

    /**
     * The builder which creates external policy for gbp
     *
     * @return the external policy builder
     */
    public static ExternalPolicyBuilder externalPolicy() {
        return GbpExternalPolicyCreate.builder();
    }

    /**
     * The builder which creates external segment for gbp
     *
     * @return the external segment builder
     */
    public static ExternalSegmentBuilder externalSegment() {
        return GbpExternalSegment.builder();
    }

    /**
     * The builder which creates L2 policy for gbp
     *
     * @return the L2 policy builder
     */
    public static L2PolicyBuilder l2Policy() {
        return GbpL2Policy.builder();
    }

    /**
     * The builder which creates L3 policy for gbp
     *
     * @return the L3 policy builder
     */
    public static L3PolicyBuilder l3Policy() {
        return GbpL3Policy.builder();
    }

    /**
     * The builder which creates nat pool for gbp
     *
     * @return the nat pool builder
     */
    public static NatPoolBuilder natPool() {
        return GbpNatPool.builder();
    }

    /**
     * The builder which creates network service policy for gbp
     *
     *
     * @return
     */
    public static NetworkServicePolicyBuilder networkServicePolicy() {
        return GbpNetworkServicePolicy.builder();
    }

    /**
     * The builder which creates policy action for gbp
     *
     * @return the policy action builder
     */
    public static PolicyActionCreateBuilder policyAction() {
        return GbpPolicyAction.builder();
    }

    /**
     * The builder which updates policy action for gbp
     *
     * @return the policy action builder
     */
    public static PolicyActionUpdateBuilder policyActionUpdate() {
        return GbpPolicyActionUpdate.builder();
    }

    /**
     * The builder which creates policy classifier for gbp
     *
     * @return the policy classifier builder
     */
    public static PolicyClassifierBuilder policyClassifier() {
        return GbpPolicyClassifier.builder();
    }

    /**
     * The builder which updates policy classifier for gbp
     *
     * @return the policy classifier builder
     */
    public static PolicyClassifierUpdateBuilder policyClassifierUpdate() {
        return GbpPolicyClassifierUpdate.builder();
    }

    /**
     * The builder which creates policy rule for gbp
     *
     * @return the policy rule builder
     */
    public static PolicyRuleBuilder policyRule() {
        return GbpPolicyRule.builder();
    }

    /**
     * The builder which creates policy rule set for gbp
     *
     * @return the policy rule set builder
     */
    public static PolicyRuleSetBuilder policyRuleSet() {
        return GbpPolicyRuleSet.builder();
    }

    /**
     * The builder which creates policy target for gbp
     *
     * @return the policy target builder
     */
    public static PolicyTargetBuilder policyTarget() {
        return GbpPolicyTarget.builder();
    }

    /**
     * The builder which creates policy target group for gbp
     *
     * @return the policy target group builder
     */
    public static PolicyTargetGroupBuilder policyTargetGroup() {
        return GbpPolicyTargetGroupCreate.builder();
    }

    /**
     * The builder which creates external routes for gbp
     *
     * @return the external routes builder
     */
    public static ExternalRoutesBuilder externalRoutes() {
        return GbpExternalRoutes.builder();
    }

    // Builders.<service>().<object>() ..

    /**
     * Identity V2 builders
     *
     * @return the keystone v2 builders
     */
    public static IdentityV2Builders identityV2() {
        return new KeystoneV2Builders();
    }

    /**
     * The Identity V3 builders
     *
     * @return the keystone v3 builders
     */
    public static IdentityV3Builders identityV3() {
        return new KeystoneV3Builders();
    }

    /**
     * The Compute builders
     *
     * @return the nova builders
     */
    public static ComputeBuilders compute() {
        return new NovaBuilders();
    }



    /**
     * The Storage builders
     *
     * @return the cinder builders
     */
    public static StorageBuilders storage() {
        return new CinderBuilders();
    }

    /**
     * The Orchestration builders
     *
     * @return the heat builders
     */
    public static OrchestrationBuilders heat() {
        return new HeatBuilders();
    }

    /**
     * The Network builders
     *
     * @return the neutron builders
     */
    public static NetworkBuilders neutron() {
        return new NeutronBuilders();
    }

    /**
     * The Octavia builders
     *
     * @return the octavia builders
     */
    public static OctaviaBuilders octavia() {
        return new OctaviaBuilders();
    }

    /**
     * The Sahara builders
     *
     * @return the sahara builders
     */
    public static DataProcessingBuilders sahara() {
        return new SaharaBuilders();
    }

    /**
     * The Ceilometer builders
     *
     * @return the ceilometer builders
     */
    public static TelemetryBuilders ceilometer() {
        return new CeilometerBuilders();
    }

    /**
     * The Manila builders
     *
     * @return the manila builders
     */
    public static SharedFileSystemBuilders manila() {
        return new ManilaBuilders();
    }

    /**
     * The Trove builders
     *
     * @return the trove builders
     */
    public static DBServiceBuilders trove() {
        return new TroveBuilders();
    }

    /**
     * LbaasV2 pool builder
     *
     * @return the lb pool v2 builder
     */
    public static LbPoolV2Builder lbpoolV2() {
        return NeutronLbPoolV2.builder();
    }

    /**
     * LbaasV2 pool update builder
     *
     *
     * @return the lb pool v2 update builder
     */
    public static LbPoolV2UpdateBuilder lbPoolV2Update() {
        return NeutronLbPoolV2Update.builder();
    }

    /**
     * LbaasV2 member builder
     *
     *
     * @return the member v2 builder
     */
    public static MemberV2Builder memberV2() {
        return NeutronMemberV2.builder();
    }

    /**
     * LbaasV2 member update builder
     *
     *
     * @return the member v2 update builder
     */
    public static MemberV2UpdateBuilder memberV2Update() {
        return NeutronMemberV2Update.builder();
    }

    /**
     * LbaasV2 listener builder
     *
     *
     * @return the listener builder
     */
    public static ListenerV2Builder listenerV2() {
        return NeutronListenerV2.builder();
    }

    /**
     * LbaasV2 listener update builder
     *
     *
     * @return the listener v2 update builder
     */
    public static ListenerV2UpdateBuilder listenerV2Update() {
        return NeutronListenerV2Update.builder();
    }

    /**
     * LbaasV2 health monitor builder
     *
     *
     * @return the health monitor v2 builder
     */
    public static HealthMonitorV2Builder healthmonitorV2() {
        return NeutronHealthMonitorV2.builder();
    }

    /**
     * LbaasV2 healthmonitor update builder
     *
     *
     * @return the health monitor v2 update builder
     */
    public static HealthMonitorV2UpdateBuilder healthMonitorV2Update() {
        return NeutronHealthMonitorV2Update.builder();
    }

    /**
     * LbaasV2 loadbalancer builder
     *
     *
     * @return the loadbalancer v2 builder
     */
    public static LoadBalancerV2Builder loadbalancerV2() {
        return NeutronLoadBalancerV2.builder();
    }

    /**
     * LbaasV2 loadbalancer update builder
     *
     *
     * @return the loadbalancer v2 update builder
     */
    public static LoadBalancerV2UpdateBuilder loadBalancerV2Update() {
        return NeutronLoadBalancerV2Update.builder();
    }

    /**
     * Magnum builder
     * @return the magnum builder
     */

    public static BaymodelBuilder baymodel() {
        return MagnumBaymodel.builder();
    }

    /**
     * Barbican container builder
     * @return the container builder
     */
    public static ContainerCreateBuilder container() {
        return BarbicanContainer.builder();
    }

    /**
     * Barbican secret builder
     * @return the secret builder
     */
    public static ContainerSecretBuilder containerSecret() {
        return BarbicanContainerSecret.builder();
    }

    /**
     * Barbican secret builder
     * @return the secret builder
     */
    public static SecretCreateBuilder secret() { return BarbicanSecret.builder(); }

    /**
     * The Tacker builders
     * @return the tacker builders
     */
    public static NfvBuilders tacker() {
        return new TackerBuilders();
    }

    /**
     * Images V2 builder
     * @return the glance v2 image builder
     */
    public static com.github.narcissujsk.openstackjsk.model.image.v2.builder.ImageBuilder imageV2() {
        return com.github.narcissujsk.openstackjsk.openstack.image.v2.domain.GlanceImage.builder();
    }

    /**
     * Image V2 task builder
     * @return the glance v2 task builder
     */
    public static TaskBuilder taskBuilder() {
        return GlanceTask.builder();
    }

    /**
     * Image V2 json patch update builder
     * @return the image patch update builder
     */
    public static ImageUpdateBuilder imageUpdateV2() {
        return GlanceImageUpdate.builder();
    }

    /**
     * The Murano builders
     *
     * @return the murano builders
     */
    public static AppCatalogBuilders murano() {
        return new MuranoBuilders();
    }

    /**
     * The builder to create a murano environment
     *
     * @return the environment builder
     */
    public static EnvironmentBuilder environment() {
        return MuranoEnvironment.builder();
    }

    /**
     * The DNS/Designate V2 builders
     *
     * @return the dns/designate v2 builders
     */
    public static DNSV2Builders dnsV2() {
        return new DesignateV2Builders();
    }

    /**
     * The builder to create a Zone.
     *
     * @return the zone builder
     */
    public static ZoneBuilder zone() { return DesignateZone.builder(); }

    /**
     * The builder to create a Recordset.
     *
     * @return the recordset builder
     */
    public static RecordsetBuilder recordset() { return DesignateRecordset.builder(); }

    public static WorkflowBuilders workflow() {
        return new MistralBuilders();
    }
}
