//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.09 at 03:33:38 PM EET 
//


package com.vmware.o11n.sdk.rest.client.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for primary-field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primary-field">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.vmware.com/vco}field">
 *       &lt;sequence>
 *         &lt;element name="fields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="field" type="{http://www.vmware.com/vco}field" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="sdk-object" type="{http://www.vmware.com/vco}sdk-object"/>
 *           &lt;element name="string" type="{http://www.vmware.com/vco}string"/>
 *           &lt;element name="secure-string" type="{http://www.vmware.com/vco}secure-string"/>
 *           &lt;element name="properties" type="{http://www.vmware.com/vco}properties"/>
 *           &lt;element name="number" type="{http://www.vmware.com/vco}number"/>
 *           &lt;element name="array" type="{http://www.vmware.com/vco}array"/>
 *           &lt;element name="mime-attachment" type="{http://www.vmware.com/vco}mime-attachment"/>
 *           &lt;element name="date" type="{http://www.vmware.com/vco}date"/>
 *           &lt;element name="boolean" type="{http://www.vmware.com/vco}boolean"/>
 *           &lt;element name="composite" type="{http://www.vmware.com/vco}composite"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "primary-field", propOrder = {
    "fields",
    "sdkObject",
    "string",
    "secureString",
    "properties",
    "number",
    "array",
    "mimeAttachment",
    "date",
    "_boolean",
    "composite"
})
public class PrimaryField
    extends Field
{

    protected PrimaryField.Fields fields;
    @XmlElement(name = "sdk-object")
    protected SdkObject sdkObject;
    protected String string;
    @XmlElement(name = "secure-string")
    protected SecureString secureString;
    protected Properties properties;
    protected Double number;
    protected Array array;
    @XmlElement(name = "mime-attachment")
    protected MimeAttachment mimeAttachment;
    protected XMLGregorianCalendar date;
    @XmlElement(name = "boolean")
    protected Boolean _boolean;
    protected Composite composite;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryField.Fields }
     *     
     */
    public PrimaryField.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryField.Fields }
     *     
     */
    public void setFields(PrimaryField.Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the sdkObject property.
     * 
     * @return
     *     possible object is
     *     {@link SdkObject }
     *     
     */
    public SdkObject getSdkObject() {
        return sdkObject;
    }

    /**
     * Sets the value of the sdkObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdkObject }
     *     
     */
    public void setSdkObject(SdkObject value) {
        this.sdkObject = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the secureString property.
     * 
     * @return
     *     possible object is
     *     {@link SecureString }
     *     
     */
    public SecureString getSecureString() {
        return secureString;
    }

    /**
     * Sets the value of the secureString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecureString }
     *     
     */
    public void setSecureString(SecureString value) {
        this.secureString = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber(Double value) {
        this.number = value;
    }

    /**
     * Gets the value of the array property.
     * 
     * @return
     *     possible object is
     *     {@link Array }
     *     
     */
    public Array getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     * @param value
     *     allowed object is
     *     {@link Array }
     *     
     */
    public void setArray(Array value) {
        this.array = value;
    }

    /**
     * Gets the value of the mimeAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link MimeAttachment }
     *     
     */
    public MimeAttachment getMimeAttachment() {
        return mimeAttachment;
    }

    /**
     * Sets the value of the mimeAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeAttachment }
     *     
     */
    public void setMimeAttachment(MimeAttachment value) {
        this.mimeAttachment = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the composite property.
     * 
     * @return
     *     possible object is
     *     {@link Composite }
     *     
     */
    public Composite getComposite() {
        return composite;
    }

    /**
     * Sets the value of the composite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Composite }
     *     
     */
    public void setComposite(Composite value) {
        this.composite = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="field" type="{http://www.vmware.com/vco}field" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "field"
    })
    public static class Fields {

        protected List<Field> field;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Field }
         * 
         * 
         */
        public List<Field> getField() {
            if (field == null) {
                field = new ArrayList<Field>();
            }
            return this.field;
        }

    }

}
