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
 * Data type for a Reference to a place, may be any one out of a stop point, geospatial location or Locality
 * 
 * <p>Java class for PlaceRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="StopPointRef" type="{http://www.naptan.org.uk/}StopPointRefStructure"/>
 *         &lt;element name="Location" type="{http://www.naptan.org.uk/}GridPositionStructure"/>
 *         &lt;element name="NptgLocalityRef" type="{http://www.naptan.org.uk/}NptgLocalityVersionedRefStructure"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceRefStructure", propOrder = {
    "stopPointRef",
    "location",
    "nptgLocalityRef"
})
public class PlaceRefStructure {

    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "Location")
    protected GridPositionStructure location;
    @XmlElement(name = "NptgLocalityRef")
    protected NptgLocalityVersionedRefStructure nptgLocalityRef;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GridPositionStructure }
     *     
     */
    public GridPositionStructure getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridPositionStructure }
     *     
     */
    public void setLocation(GridPositionStructure value) {
        this.location = value;
    }

    /**
     * Gets the value of the nptgLocalityRef property.
     * 
     * @return
     *     possible object is
     *     {@link NptgLocalityVersionedRefStructure }
     *     
     */
    public NptgLocalityVersionedRefStructure getNptgLocalityRef() {
        return nptgLocalityRef;
    }

    /**
     * Sets the value of the nptgLocalityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NptgLocalityVersionedRefStructure }
     *     
     */
    public void setNptgLocalityRef(NptgLocalityVersionedRefStructure value) {
        this.nptgLocalityRef = value;
    }

}
