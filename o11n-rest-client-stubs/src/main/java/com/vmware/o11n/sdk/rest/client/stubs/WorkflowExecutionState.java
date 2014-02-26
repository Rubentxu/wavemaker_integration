//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.09 at 03:33:38 PM EET 
//


package com.vmware.o11n.sdk.rest.client.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workflowExecutionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="workflowExecutionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="canceled"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="running"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="waiting"/>
 *     &lt;enumeration value="waiting-signal"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="initializing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "workflowExecutionState")
@XmlEnum
@XmlRootElement(name = "state")
public enum WorkflowExecutionState {

    @XmlEnumValue("canceled")
    CANCELED("canceled"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("waiting")
    WAITING("waiting"),
    @XmlEnumValue("waiting-signal")
    WAITING_SIGNAL("waiting-signal"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("initializing")
    INITIALIZING("initializing");
    private final String value;

    WorkflowExecutionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowExecutionState fromValue(String v) {
        for (WorkflowExecutionState c: WorkflowExecutionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
