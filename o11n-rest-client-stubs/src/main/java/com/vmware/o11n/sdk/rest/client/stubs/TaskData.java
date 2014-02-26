//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.09 at 03:33:38 PM EET 
//


package com.vmware.o11n.sdk.rest.client.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taskData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.vmware.com/vco}taskState" minOccurs="0"/>
 *         &lt;element name="recurrence-start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recurrence-pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrence-cycle" type="{http://www.vmware.com/vco}recurrenceCycle" minOccurs="0"/>
 *         &lt;element name="recurrence-end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="start-mode" type="{http://www.vmware.com/vco}startMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskData", propOrder = {
    "name",
    "description",
    "state",
    "recurrenceStartDate",
    "recurrencePattern",
    "recurrenceCycle",
    "recurrenceEndDate",
    "startMode"
})
@XmlRootElement(name = "task-data")
public class TaskData {

    protected String name;
    protected String description;
    protected TaskState state;
    @XmlElement(name = "recurrence-start-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceStartDate;
    @XmlElement(name = "recurrence-pattern")
    protected String recurrencePattern;
    @XmlElement(name = "recurrence-cycle")
    protected RecurrenceCycle recurrenceCycle;
    @XmlElement(name = "recurrence-end-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceEndDate;
    @XmlElement(name = "start-mode")
    protected StartMode startMode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TaskState }
     *     
     */
    public TaskState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskState }
     *     
     */
    public void setState(TaskState value) {
        this.state = value;
    }

    /**
     * Gets the value of the recurrenceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceStartDate() {
        return recurrenceStartDate;
    }

    /**
     * Sets the value of the recurrenceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceStartDate(XMLGregorianCalendar value) {
        this.recurrenceStartDate = value;
    }

    /**
     * Gets the value of the recurrencePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    /**
     * Sets the value of the recurrencePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrencePattern(String value) {
        this.recurrencePattern = value;
    }

    /**
     * Gets the value of the recurrenceCycle property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceCycle }
     *     
     */
    public RecurrenceCycle getRecurrenceCycle() {
        return recurrenceCycle;
    }

    /**
     * Sets the value of the recurrenceCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceCycle }
     *     
     */
    public void setRecurrenceCycle(RecurrenceCycle value) {
        this.recurrenceCycle = value;
    }

    /**
     * Gets the value of the recurrenceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceEndDate() {
        return recurrenceEndDate;
    }

    /**
     * Sets the value of the recurrenceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceEndDate(XMLGregorianCalendar value) {
        this.recurrenceEndDate = value;
    }

    /**
     * Gets the value of the startMode property.
     * 
     * @return
     *     possible object is
     *     {@link StartMode }
     *     
     */
    public StartMode getStartMode() {
        return startMode;
    }

    /**
     * Sets the value of the startMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartMode }
     *     
     */
    public void setStartMode(StartMode value) {
        this.startMode = value;
    }

}
