//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for report_suite_unique_visitor_variable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="report_suite_unique_visitor_variable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="site_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unique_visitor_variable" type="{http://marketing.adobe.com/analytics/2015/04/16}unique_visitor_variable_enum"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report_suite_unique_visitor_variable", propOrder = {

})
public class ReportSuiteUniqueVisitorVariable {

    @XmlElement(required = true)
    protected String rsid;
    @XmlElement(name = "site_title", required = true)
    protected String siteTitle;
    @XmlElement(name = "unique_visitor_variable", required = true)
    protected UniqueVisitorVariableEnum uniqueVisitorVariable;

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
    }

    /**
     * Gets the value of the siteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTitle() {
        return siteTitle;
    }

    /**
     * Sets the value of the siteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTitle(String value) {
        this.siteTitle = value;
    }

    /**
     * Gets the value of the uniqueVisitorVariable property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueVisitorVariableEnum }
     *     
     */
    public UniqueVisitorVariableEnum getUniqueVisitorVariable() {
        return uniqueVisitorVariable;
    }

    /**
     * Sets the value of the uniqueVisitorVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueVisitorVariableEnum }
     *     
     */
    public void setUniqueVisitorVariable(UniqueVisitorVariableEnum value) {
        this.uniqueVisitorVariable = value;
    }

}
