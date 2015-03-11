package eu.seaclouds;

import eu.seaclouds.tosca.ToscaParser;
import eu.seaclouds.tosca.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.*;
import java.util.List;



public class ToscaParserTest {

    TNodeTemplate nodeTemplateAWSMAl;
    List<TNodeTemplate> nodeTemplatesAWSSample;
    List<TRelationshipTemplate> relationshipTemplateListMalFormedTopology, relationshipTemplatesAWSSample;
    String AWSFileMalFormedRelation = resourceNameResolver("AWS-Location-Sample-MalFormedRelation.xml");
    String AWSNotArtifactTemplate=resourceNameResolver("AWS-NotArtifactTemplate.xml");
    String AWSNotDeploymentArtifact=resourceNameResolver("AWS-NotDeploymentArtifact.xml");
    String AWSNotDeploymentArtifactsSpecification=resourceNameResolver("AWS-NotDeploymentArtifactsSpecification.xml");
    String AWSNotNodeTypeImplementation=resourceNameResolver("AWS-NotNodeTypeImplementation.xml");
    String AWSNotNodeTypeDefinition=resourceNameResolver("AWS-NotNodeTypeDefinition.xml");
    String AWSFile = resourceNameResolver("AWS-Location-Sample.xml");
    String jBossPayWebServerId = "JBossPayWebServer".toLowerCase();

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ToscaParserTest.class);
    }

    public static String resourceNameResolver(String resource){
        return ToscaParserTest.class.getClassLoader().getResource(resource).getFile();
    }

    void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        System.out.println("entra");
        String cadena;
        FileReader f = new FileReader(archivo);
        System.out.println("entra");
        BufferedReader b = new BufferedReader(f);
        System.out.println("entra");
        System.out.println(b.readLine());
        while((cadena = b.readLine())!=null) {

            System.out.println(cadena);
        }
        b.close();
        System.out.println("sale");
    }

    @Before
    public void setUp() throws IOException {
        System.out.println("Jose- "+AWSFile);
        //muestraContenido(AWSFile);
        nodeTemplatesAWSSample = ToscaParser.getNodeTemplates(new File(AWSFile));
        //nodeTemplatesAWSSample = ToscaParser.getNodeTemplates(new File(AWSFileMalFormedRelation));
        //relationshipTemplateListMalFormedTopology = ToscaParser.getRelationshipTemplates(new File(resourceNameResolver(AWSFileMalFormedRelation)));
        //relationshipTemplatesAWSSample = ToscaParser.getRelationshipTemplates(new File(resourceNameResolver(AWSFile)));
        //nodeTemplateAWSMAl = nodeTemplatesAWSSample.get(0);
    }

    @Test
    public void nodeTemplateIdTest() {
        //assertEquals(nodeTemplatesAWSSample.size(), 1);
        //assertEquals(nodeTemplatesAWSSample.get(0).getType().getLocalPart().toLowerCase(), "jbosswebserver");
    }
/*
    @Test
    public void locationTest() {
        assertEquals(nodeTemplatesAWSSample.get(0).getLocation().getLocationId(), "AWS");
    }

    @Test
    public void relationshipNullTest() {
        TNodeTemplate source = (TNodeTemplate) relationshipTemplateListMalFormedTopology.get(0).getSourceElement().getRef();
        TNodeTemplate target = (TNodeTemplate) relationshipTemplateListMalFormedTopology.get(0).getTargetElement().getRef();
        assertEquals(source.getId().toLowerCase(), jBossPayWebServerId);
        assertNull(target);
    }

    @Test
    public void relationshipNotNullTest() {
        assertEquals(relationshipTemplatesAWSSample.size(), 1);
        TNodeTemplate source = (TNodeTemplate) relationshipTemplatesAWSSample.get(0).getSourceElement().getRef();
        TNodeTemplate target = (TNodeTemplate) relationshipTemplatesAWSSample.get(0).getTargetElement().getRef();
        assertEquals(source.getId().toLowerCase(), jBossPayWebServerId);
        assertEquals(target.getId().toLowerCase(), jBossPayWebServerId);
    }

    @Test
    public void nodeTemplateProperties() {
        Map<String, String> propertyMap =
                ToscaParser.getProperties(nodeTemplatesAWSSample.get(0));
        assertEquals(propertyMap.keySet().size(), 1);
        assertEquals(propertyMap.containsKey("httpdport"), true);
        assertEquals(propertyMap.get("httpdport"), "80");
    }

    @Test
    public void testGetArtifactTemplate_NotNodeTypeImplementationDefinition(){
        TDefinitions definitions1=ToscaParser.getDefinitions(new File(AWSNotNodeTypeImplementation));
        List<TNodeTemplate> nodeTemplates=ToscaParser.getNodeTemplates(new File(AWSNotNodeTypeImplementation));
        assertEquals(nodeTemplates.size(), 1);
        List<TDeploymentArtifact> deploymentArtifacts=
                ToscaParser.getDeploymentArtifact(definitions1, nodeTemplates.get(0));
        assertNull(deploymentArtifacts);
    }

    @Test
    public void testGetArtifactTemplate_NotDeploymentArtifactsTemplateDefinition(){

        TDefinitions definitions1=ToscaParser.getDefinitions(new File(AWSNotDeploymentArtifactsSpecification));
        List<TNodeTemplate> nodeTemplates=ToscaParser.getNodeTemplates(new File(AWSNotDeploymentArtifactsSpecification));
        assertEquals(nodeTemplates.size(), 1);
        List<TDeploymentArtifact> deploymentArtifacts=
                ToscaParser.getDeploymentArtifact(definitions1, nodeTemplates.get(0));
        assertNull(deploymentArtifacts);
    }

    @Test
    public void testGetArtifactTemplate_NotDeploymentArtifactTemplateListDefinition(){
        TDefinitions definitions1=ToscaParser.getDefinitions(new File(AWSNotDeploymentArtifact));
        List<TNodeTemplate> nodeTemplates=ToscaParser.getNodeTemplates(new File(AWSNotDeploymentArtifact));
        assertEquals(nodeTemplates.size(), 1);
        List<TDeploymentArtifact> deploymentArtifacts=
                ToscaParser.getDeploymentArtifact(definitions1, nodeTemplates.get(0));
        assertNull(deploymentArtifacts);
    }

    @Test
    public void testGetArtifactTemplate_NotArtifactTemplateDefinition(){
        TDefinitions definitions=ToscaParser.getDefinitions(new File(AWSNotArtifactTemplate));
        List<TNodeTemplate> nodeTemplates=ToscaParser.getNodeTemplates(new File(AWSNotArtifactTemplate));
        assertEquals(nodeTemplates.size(), 1);
        List<TDeploymentArtifact> deploymentArtifacts=
                ToscaParser.getDeploymentArtifact(definitions, nodeTemplates.get(0));
        assertEquals(deploymentArtifacts.size(),1);
        TArtifactTemplate artifactTemplates = ToscaParser.getArtifactTemplate(definitions, deploymentArtifacts.get(0));
        assertNull(artifactTemplates);
    }

    @Test
    public void testNodeTypeImplementation(){
        TDefinitions definitions=ToscaParser.getDefinitions(new File(AWSFile));
        List<TNodeTypeImplementation> nodeTypeImplementations=
                ToscaParser.getTNodeTypeImplementations(definitions);
        assertEquals(nodeTypeImplementations.size(),1);
        assertEquals(nodeTypeImplementations.get(0).getNodeType().getLocalPart(), "JBossWebServer");
    }

    @Test
    public void testArtifactTemplate(){
        TDefinitions definitions=ToscaParser.getDefinitions(new File(AWSFile));
        List<TNodeTemplate> nodeTemplates=ToscaParser.getNodeTemplates(new File(AWSFile));
        assertEquals(nodeTemplates.size(), 1);
        List<TDeploymentArtifact> deploymentArtifacts=
                ToscaParser.getDeploymentArtifact(definitions, nodeTemplates.get(0));
        assertEquals(deploymentArtifacts.size(),1);
        TArtifactTemplate artifactTemplates = ToscaParser.getArtifactTemplate(definitions, deploymentArtifacts.get(0));
        assertNotNull(artifactTemplates);
    }


    @Test
    public void testArtifactTemplate_NotNodeTypeDefinition(){
        TDefinitions definitions=ToscaParser.getDefinitions(new File(AWSNotNodeTypeDefinition));
        List<TNodeTemplate> nodeTemplates=ToscaParser.getNodeTemplates(new File(AWSNotNodeTypeDefinition));
        assertEquals(nodeTemplates.size(), 1);
        List<TDeploymentArtifact> deploymentArtifacts=
                ToscaParser.getDeploymentArtifact(definitions, nodeTemplates.get(0));
        assertEquals(deploymentArtifacts.size(),1);
        TArtifactTemplate artifactTemplates = ToscaParser.getArtifactTemplate(definitions, deploymentArtifacts.get(0));
        assertNotNull(artifactTemplates);
    }
    */
}
