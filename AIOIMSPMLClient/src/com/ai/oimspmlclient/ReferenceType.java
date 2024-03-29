
package com.ai.oimspmlclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SPML:2:0}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="toPsoID" type="{urn:oasis:names:tc:SPML:2:0}PSOIdentifierType" minOccurs="0"/>
 *         &lt;element name="referenceData" type="{urn:oasis:names:tc:SPML:2:0}ExtensibleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeOfReference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", namespace = "urn:oasis:names:tc:SPML:2:0:reference", propOrder = {
    "toPsoID",
    "referenceData"
})
public class ReferenceType
    extends ExtensibleType
{

    protected PSOIdentifierType toPsoID;
    protected ExtensibleType referenceData;
    @XmlAttribute(name = "typeOfReference", required = true)
    protected String typeOfReference;

    /**
     * Gets the value of the toPsoID property.
     * 
     * @return
     *     possible object is
     *     {@link PSOIdentifierType }
     *     
     */
    public PSOIdentifierType getToPsoID() {
        return toPsoID;
    }

    /**
     * Sets the value of the toPsoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSOIdentifierType }
     *     
     */
    public void setToPsoID(PSOIdentifierType value) {
        this.toPsoID = value;
    }

    /**
     * Gets the value of the referenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensibleType }
     *     
     */
    public ExtensibleType getReferenceData() {
        return referenceData;
    }

    /**
     * Sets the value of the referenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensibleType }
     *     
     */
    public void setReferenceData(ExtensibleType value) {
        this.referenceData = value;
    }

    /**
     * Gets the value of the typeOfReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfReference() {
        return typeOfReference;
    }

    /**
     * Sets the value of the typeOfReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfReference(String value) {
        this.typeOfReference = value;
    }

}
