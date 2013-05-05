//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Spatial co-ordinates of a location.
 * 
 * <p>Java class for LocationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.naptan.org.uk/}GridGroup"/>
 *         &lt;group ref="{http://www.naptan.org.uk/}WgsGroup"/>
 *         &lt;sequence>
 *           &lt;element name="Translation">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;group ref="{http://www.naptan.org.uk/}GridGroup"/>
 *                     &lt;group ref="{http://www.naptan.org.uk/}WgsGroup"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="Precision" type="{http://www.naptan.org.uk/}PrecisionEnumeration" default="1km" />
 *       &lt;attribute name="id" type="{http://www.naptan.org.uk/}LocationIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationStructure", propOrder = {
    "gridType",
    "easting",
    "northing",
    "longitude",
    "latitude",
    "translation"
})
@XmlSeeAlso({
    uk.org.naptan.AnnotatedStopPointRefStructure.Location.class,
    uk.org.naptan.StopPointStructure.Place.Location.class
})
public class LocationStructure {

    @XmlElement(name = "GridType", defaultValue = "UKOS")
    protected LocationGridTypeEnumeration gridType;
    @XmlElement(name = "Easting")
    protected Integer easting;
    @XmlElement(name = "Northing")
    protected Integer northing;
    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "Translation")
    protected LocationStructure.Translation translation;
    @XmlAttribute(name = "Precision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String precision;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEasting() {
        return easting;
    }

    /**
     * Sets the value of the easting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEasting(Integer value) {
        this.easting = value;
    }

    /**
     * Gets the value of the northing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNorthing() {
        return northing;
    }

    /**
     * Sets the value of the northing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNorthing(Integer value) {
        this.northing = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.Translation }
     *     
     */
    public LocationStructure.Translation getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.Translation }
     *     
     */
    public void setTranslation(LocationStructure.Translation value) {
        this.translation = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecision() {
        if (precision == null) {
            return "1km";
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecision(String value) {
        this.precision = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.naptan.org.uk/}GridGroup"/>
     *         &lt;group ref="{http://www.naptan.org.uk/}WgsGroup"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gridType",
        "easting",
        "northing",
        "longitude",
        "latitude"
    })
    public static class Translation {

        @XmlElement(name = "GridType", defaultValue = "UKOS")
        protected LocationGridTypeEnumeration gridType;
        @XmlElement(name = "Easting")
        protected int easting;
        @XmlElement(name = "Northing")
        protected int northing;
        @XmlElement(name = "Longitude", required = true)
        protected BigDecimal longitude;
        @XmlElement(name = "Latitude", required = true)
        protected BigDecimal latitude;

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

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLongitude(BigDecimal value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLatitude(BigDecimal value) {
            this.latitude = value;
        }

    }

}
