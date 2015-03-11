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
 * Java class for tTopologyElementInstanceStates complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tTopologyElementInstanceStates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstanceState" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTopologyElementInstanceStates", propOrder = {"instanceState"})
public class TTopologyElementInstanceStates {
	
	@XmlElement(name = "InstanceState", required = true)
	protected List<InstanceState> instanceState;


	/**
	 * Gets the value of the instanceState property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the instanceState property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getInstanceState().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TTopologyElementInstanceStates.InstanceState }
	 *
	 *
	 */
	public List<InstanceState> getInstanceState() {
		if (this.instanceState == null) {
			this.instanceState = new ArrayList<InstanceState>();
		}
		return this.instanceState;
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
	 *       &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class InstanceState {
		
		@XmlAttribute(name = "state", required = true)
		@XmlSchemaType(name = "anyURI")
		protected String state;
		
		
		/**
		 * Gets the value of the state property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getState() {
			return this.state;
		}
		
		/**
		 * Sets the value of the state property.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setState(String value) {
			this.state = value;
		}
		
	}
	
}