//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.09 at 03:33:38 PM EET 
//


package com.vmware.o11n.sdk.rest.client.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ResourceElementCategory"/>
 *     &lt;enumeration value="ConfigurationElementCategory"/>
 *     &lt;enumeration value="WorkflowCategory"/>
 *     &lt;enumeration value="ScriptModuleCategory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryType")
@XmlEnum
public enum CategoryType {

    @XmlEnumValue("ResourceElementCategory")
    RESOURCE_ELEMENT_CATEGORY("ResourceElementCategory"),
    @XmlEnumValue("ConfigurationElementCategory")
    CONFIGURATION_ELEMENT_CATEGORY("ConfigurationElementCategory"),
    @XmlEnumValue("WorkflowCategory")
    WORKFLOW_CATEGORY("WorkflowCategory"),
    @XmlEnumValue("ScriptModuleCategory")
    SCRIPT_MODULE_CATEGORY("ScriptModuleCategory");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c: CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
