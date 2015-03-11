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
 * Java class for tCondition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="expressionLanguage" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCondition", propOrder = {"any"})
public class TCondition {
	
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "expressionLanguage", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String expressionLanguage;
	
	
	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * {@link org.w3c.dom.Element }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (this.any == null) {
			this.any = new ArrayList<Object>();
		}
		return this.any;
	}
	
	/**
	 * Gets the value of the expressionLanguage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionLanguage() {
		return this.expressionLanguage;
	}
	
	/**
	 * Sets the value of the expressionLanguage property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setExpressionLanguage(String value) {
		this.expressionLanguage = value;
	}
	
}