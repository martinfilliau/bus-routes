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
import javax.xml.datatype.Duration;


/**
 * Data type for Type of Marked Bus Stop. 
 * 
 * <p>Java class for MarkedPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkedPointStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}BusStopTypeStructure">
 *       &lt;sequence>
 *         &lt;element name="DefaultWaitTime" type="{http://www.naptan.org.uk/}DurationType" minOccurs="0"/>
 *         &lt;element name="Bearing" type="{http://www.naptan.org.uk/}BearingStructure"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkedPointStructure", propOrder = {
    "defaultWaitTime",
    "bearing"
})
public class MarkedPointStructure
    extends BusStopTypeStructure
{

    @XmlElement(name = "DefaultWaitTime")
    protected Duration defaultWaitTime;
    @XmlElement(name = "Bearing", required = true)
    protected BearingStructure bearing;

    /**
     * Gets the value of the defaultWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDefaultWaitTime() {
        return defaultWaitTime;
    }

    /**
     * Sets the value of the defaultWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDefaultWaitTime(Duration value) {
        this.defaultWaitTime = value;
    }

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link BearingStructure }
     *     
     */
    public BearingStructure getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BearingStructure }
     *     
     */
    public void setBearing(BearingStructure value) {
        this.bearing = value;
    }

}