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
 * Position of a point in Grid Coordinates
 * 
 * <p>Java class for GridPositionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridPositionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GridType" type="{http://www.naptan.org.uk/}LocationGridTypeEnumeration"/>
 *         &lt;element name="Easting" type="{http://www.naptan.org.uk/}EastingType"/>
 *         &lt;element name="Northing" type="{http://www.naptan.org.uk/}NorthingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridPositionStructure", propOrder = {
    "gridType",
    "easting",
    "northing"
})
public class GridPositionStructure {

    @XmlElement(name = "GridType", required = true)
    protected LocationGridTypeEnumeration gridType;
    @XmlElement(name = "Easting")
    protected int easting;
    @XmlElement(name = "Northing")
    protected int northing;

    /**
     * Gets the value of the gridType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationGridTypeEnumeration }
     *     
     */
    public LocationGridTypeEnumeration getGridType() {
        return gridType;
    }

    /**
     * Sets the value of the gridType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationGridTypeEnumeration }
     *     
     */
    public void setGridType(LocationGridTypeEnumeration value) {
        this.gridType = value;
    }

    /**
     * Gets the value of the easting property.
     * 
     */
    public int getEasting() {
        return easting;
    }

    /**
     * Sets the value of the easting property.
     * 
     */
    public void setEasting(int value) {
        this.easting = value;
    }

    /**
     * Gets the value of the northing property.
     * 
     */
    public int getNorthing() {
        return northing;
    }

    /**
     * Sets the value of the northing property.
     * 
     */
    public void setNorthing(int value) {
        this.northing = value;
    }

}
