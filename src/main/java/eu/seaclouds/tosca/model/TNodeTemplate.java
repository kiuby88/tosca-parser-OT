//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2013.07.10 at 12:45:26 PM CEST
//
// TOSCA version: TOSCA-v1.0-cs02.xsd
//

package eu.seaclouds.tosca.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for tNodeTemplate complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tNodeTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tEntityTemplate">
 *       &lt;sequence>
 *         &lt;element name="Requirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Requirement" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequirement" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Capabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Capability" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tCapability" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Policy" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tPolicy" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minInstances" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="maxInstances" default="1">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                 &lt;pattern value="([1-9]+[0-9]*)"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="unbounded"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNodeTemplate", propOrder = {"location","requirements", "capabilities", "policies", "deploymentArtifacts"})
public class TNodeTemplate extends TEntityTemplate {
	
	@XmlElement(name = "Requirements")
	protected TNodeTemplate.Requirements requirements;
	@XmlElement(name = "Capabilities")
	protected TNodeTemplate.Capabilities capabilities;
	@XmlElement(name = "Policies")
	protected TNodeTemplate.Policies policies;
	@XmlElement(name = "DeploymentArtifacts")
	protected TDeploymentArtifacts deploymentArtifacts;
	@XmlAttribute(name = "name")
	protected String name;
	@XmlAttribute(name = "minInstances")
	protected Integer minInstances;
	@XmlAttribute(name = "maxInstances")
	protected String maxInstances;
    @XmlElement(name = "Location")
    protected TLocation location;


	/**
	 * Gets the value of the requirements property.
	 *
	 * @return possible object is {@link TNodeTemplate.Requirements }
	 *
	 */
	public TNodeTemplate.Requirements getRequirements() {
		return this.requirements;
	}

	/**
	 * Sets the value of the requirements property.
	 *
	 * @param value allowed object is {@link TNodeTemplate.Requirements }
	 *
	 */
	public void setRequirements(TNodeTemplate.Requirements value) {
		this.requirements = value;
	}

	/**
	 * Gets the value of the capabilities property.
	 *
	 * @return possible object is {@link TNodeTemplate.Capabilities }
	 *
	 */
	public TNodeTemplate.Capabilities getCapabilities() {
		return this.capabilities;
	}

	/**
	 * Sets the value of the capabilities property.
	 *
	 * @param value allowed object is {@link TNodeTemplate.Capabilities }
	 *
	 */
	public void setCapabilities(TNodeTemplate.Capabilities value) {
		this.capabilities = value;
	}

	/**
	 * Gets the value of the policies property.
	 *
	 * @return possible object is {@link TNodeTemplate.Policies }
	 *
	 */
	public TNodeTemplate.Policies getPolicies() {
		return this.policies;
	}

	/**
	 * Sets the value of the policies property.
	 *
	 * @param value allowed object is {@link TNodeTemplate.Policies }
	 *
	 */
	public void setPolicies(TNodeTemplate.Policies value) {
		this.policies = value;
	}
	
	/**
	 * Gets the value of the deploymentArtifacts property.
	 * 
	 * @return possible object is {@link TDeploymentArtifacts }
	 * 
	 */
	public TDeploymentArtifacts getDeploymentArtifacts() {
		return this.deploymentArtifacts;
	}
	
	/**
	 * Sets the value of the deploymentArtifacts property.
	 * 
	 * @param value allowed object is {@link TDeploymentArtifacts }
	 * 
	 */
	public void setDeploymentArtifacts(TDeploymentArtifacts value) {
		this.deploymentArtifacts = value;
	}
	
	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the value of the name property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
        this.name = value;
	}
	
	/**
	 * Gets the value of the minInstances property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public int getMinInstances() {
		if (this.minInstances == null) {
			return 1;
		} else {
			return this.minInstances;
		}
	}
	
	/**
	 * Sets the value of the minInstances property.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setMinInstances(Integer value) {
		this.minInstances = value;
	}
	
	/**
	 * Gets the value of the maxInstances property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaxInstances() {
		if (this.maxInstances == null) {
			return "1";
		} else {
			return this.maxInstances;
		}
	}
	
	/**
	 * Sets the value of the maxInstances property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMaxInstances(String value) {
		this.maxInstances = value;
	}

    /**
     * Return the elements of the NodeTemplate
     */

    public TLocation getLocation(){
        return location;
    }

    public void setLocation(TLocation tLocation){
        location=tLocation;
    }

	
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Capability" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tCapability" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {"capability"})
	public static class Capabilities {
		
		@XmlElement(name = "Capability", required = true)
		protected List<TCapability> capability;
		
		
		/**
		 * Gets the value of the capability property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the capability property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getCapability().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TCapability }
		 * 
		 * 
		 */
		public List<TCapability> getCapability() {
			if (this.capability == null) {
				this.capability = new ArrayList<TCapability>();
			}
			return this.capability;
		}
		
	}
	
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Policy" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tPolicy" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {"policy"})
	public static class Policies {
		
		@XmlElement(name = "Policy", required = true)
		protected List<TPolicy> policy;
		
		
		/**
		 * Gets the value of the policy property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the policy property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPolicy().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TPolicy }
		 * 
		 * 
		 */
		public List<TPolicy> getPolicy() {
			if (this.policy == null) {
				this.policy = new ArrayList<TPolicy>();
			}
			return this.policy;
		}
		
	}
	
	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Requirement" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequirement" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {"requirement"})
	public static class Requirements {
		
		@XmlElement(name = "Requirement", required = true)
		protected List<TRequirement> requirement;
		
		
		/**
		 * Gets the value of the requirement property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the requirement property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getRequirement().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link TRequirement }
		 * 
		 * 
		 */
		public List<TRequirement> getRequirement() {
			if (this.requirement == null) {
				this.requirement = new ArrayList<TRequirement>();
			}
			return this.requirement;
		}
		
	}

	
}
