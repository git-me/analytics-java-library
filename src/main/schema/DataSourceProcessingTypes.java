//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for data_source_processing_types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="data_source_processing_types">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="generic"/>
 *     &lt;enumeration value="traffic"/>
 *     &lt;enumeration value="weblog"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "data_source_processing_types")
@XmlEnum
public enum DataSourceProcessingTypes {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("generic")
    GENERIC("generic"),
    @XmlEnumValue("traffic")
    TRAFFIC("traffic"),
    @XmlEnumValue("weblog")
    WEBLOG("weblog");
    private final String value;

    DataSourceProcessingTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataSourceProcessingTypes fromValue(String v) {
        for (DataSourceProcessingTypes c: DataSourceProcessingTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
