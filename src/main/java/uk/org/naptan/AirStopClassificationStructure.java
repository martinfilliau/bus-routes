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
 * Data type for Type of Air stop.  
 * 
 * <p>Java class for AirStopClassificationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirStopClassificationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Entrance" type="{http://www.naptan.org.uk/}EmptyType"/>
 *           &lt;element name="AccessArea" type="{http://www.naptan.org.uk/}EmptyType"/>
 *         &lt;/choice>
 *         &lt;element name="AnnotatedAirRef" type="{http://www.naptan.org.uk/}AnnotatedAirRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirStopClassificationStructure", propOrder = {
    "entrance",
    "accessArea",
    "annotatedAirRef"
})
public class AirStopClassificationStructure {

    @XmlElement(name = "Entrance")
    protected String entrance;
    @XmlElement(name = "AccessArea")
    protected String accessArea;
    @XmlElement(name = "AnnotatedAirRef")
    protected AnnotatedAirRefStructure annotatedAirRef;

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
     * Gets the value of the annotatedAirRef property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedAirRefStructure }
     *     
     */
    public AnnotatedAirRefStructure getAnnotatedAirRef() {
        return annotatedAirRef;
    }

    /**
     * Sets the value of the annotatedAirRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedAirRefStructure }
     *     
     */
    public void setAnnotatedAirRef(AnnotatedAirRefStructure value) {
        this.annotatedAirRef = value;
    }

}
