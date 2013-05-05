//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for Type of Ferry stop. 
 * 
 * <p>Java class for FerryStopClassificationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryStopClassificationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Entrance" type="{http://www.naptan.org.uk/}EmptyType"/>
 *           &lt;element name="AccessArea" type="{http://www.naptan.org.uk/}EmptyType"/>
 *           &lt;element name="Berth" type="{http://www.naptan.org.uk/}EmptyType"/>
 *         &lt;/choice>
 *         &lt;element name="AnnotatedFerryRef" type="{http://www.naptan.org.uk/}AnnotatedFerryRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryStopClassificationStructure", propOrder = {
    "entrance",
    "accessArea",
    "berth",
    "annotatedFerryRef"
})
public class FerryStopClassificationStructure {

    @XmlElement(name = "Entrance")
    protected String entrance;
    @XmlElement(name = "AccessArea")
    protected String accessArea;
    @XmlElement(name = "Berth")
    protected String berth;
    @XmlElement(name = "AnnotatedFerryRef")
    protected AnnotatedFerryRefStructure annotatedFerryRef;

    /**
     * Gets the value of the entrance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrance() {
        return entrance;
    }

    /**
     * Sets the value of the entrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrance(String value) {
        this.entrance = value;
    }

    /**
     * Gets the value of the accessArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessArea() {
        return accessArea;
    }

    /**
     * Sets the value of the accessArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessArea(String value) {
        this.accessArea = value;
    }

    /**
     * Gets the value of the berth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerth() {
        return berth;
    }

    /**
     * Sets the value of the berth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerth(String value) {
        this.berth = value;
    }

    /**
     * Gets the value of the annotatedFerryRef property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedFerryRefStructure }
     *     
     */
    public AnnotatedFerryRefStructure getAnnotatedFerryRef() {
        return annotatedFerryRef;
    }

    /**
     * Sets the value of the annotatedFerryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedFerryRefStructure }
     *     
     */
    public void setAnnotatedFerryRef(AnnotatedFerryRefStructure value) {
        this.annotatedFerryRef = value;
    }

}
