//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for a NaPTAN stop definition.
 * 
 * <p>Java class for StopPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPointStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}VersionedObjectTimestampedStructure">
 *       &lt;sequence>
 *         &lt;element name="AtcoCode" type="{http://www.naptan.org.uk/}AtcoCodeType"/>
 *         &lt;group ref="{http://www.naptan.org.uk/}StopIdentifierGroup"/>
 *         &lt;element name="Descriptor" type="{http://www.naptan.org.uk/}DescriptorStructure"/>
 *         &lt;element name="AlternativeDescriptors" type="{http://www.naptan.org.uk/}AlternativeDescriptorsStructure" minOccurs="0"/>
 *         &lt;element name="Place">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NptgLocalityRef" type="{http://www.naptan.org.uk/}NptgLocalityCodeType"/>
 *                   &lt;element name="LocalityName" type="{http://www.naptan.org.uk/}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *                   &lt;element name="AlternativeNptgLocalities" type="{http://www.naptan.org.uk/}NptgLocalityRefsStructure" minOccurs="0"/>
 *                   &lt;element name="MainNptgLocalities" type="{http://www.naptan.org.uk/}NptgLocalityRefsStructure" minOccurs="0"/>
 *                   &lt;element name="Suburb" type="{http://www.naptan.org.uk/}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *                   &lt;element name="Town" type="{http://www.naptan.org.uk/}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *                   &lt;element name="LocalityCentre" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Location">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.naptan.org.uk/}LocationStructure">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StopClassification" type="{http://www.naptan.org.uk/}StopClassificationStructure"/>
 *         &lt;element name="StopAreas" type="{http://www.naptan.org.uk/}StopAreaRefsStructure" minOccurs="0"/>
 *         &lt;element name="AdministrativeAreaRef" type="{http://www.naptan.org.uk/}AdministrativeAreaRefStructure"/>
 *         &lt;element name="PlusbusZones" type="{http://www.naptan.org.uk/}PlusbusZoneRefsStructure" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.naptan.org.uk/}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopAvailability" type="{http://www.naptan.org.uk/}StopAvailabilityStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPointStructure", propOrder = {
    "atcoCode",
    "naptanCode",
    "plateCode",
    "privateCode",
    "cleardownCode",
    "formerStopPointRef",
    "descriptor",
    "alternativeDescriptors",
    "place",
    "stopClassification",
    "stopAreas",
    "administrativeAreaRef",
    "plusbusZones",
    "notes",
    "_public",
    "stopAvailability"
})
@XmlSeeAlso({
    StopPoint.class
})
public class StopPointStructure
    extends VersionedObjectTimestampedStructure
{

    @XmlElement(name = "AtcoCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String atcoCode;
    @XmlElement(name = "NaptanCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String naptanCode;
    @XmlElement(name = "PlateCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String plateCode;
    @XmlElement(name = "PrivateCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String privateCode;
    @XmlElement(name = "CleardownCode")
    protected BigInteger cleardownCode;
    @XmlElement(name = "FormerStopPointRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String formerStopPointRef;
    @XmlElement(name = "Descriptor", required = true)
    protected DescriptorStructure descriptor;
    @XmlElement(name = "AlternativeDescriptors")
    protected AlternativeDescriptorsStructure alternativeDescriptors;
    @XmlElement(name = "Place", required = true)
    protected StopPointStructure.Place place;
    @XmlElement(name = "StopClassification", required = true)
    protected StopClassificationStructure stopClassification;
    @XmlElement(name = "StopAreas")
    protected StopAreaRefsStructure stopAreas;
    @XmlElement(name = "AdministrativeAreaRef", required = true)
    protected AdministrativeAreaRefStructure administrativeAreaRef;
    @XmlElement(name = "PlusbusZones")
    protected PlusbusZoneRefsStructure plusbusZones;
    @XmlElement(name = "Notes")
    protected NaturalLanguageStringStructure notes;
    @XmlElement(name = "Public", defaultValue = "true")
    protected Boolean _public;
    @XmlElement(name = "StopAvailability")
    protected StopAvailabilityStructure stopAvailability;

    /**
     * Gets the value of the atcoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtcoCode() {
        return atcoCode;
    }

    /**
     * Sets the value of the atcoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtcoCode(String value) {
        this.atcoCode = value;
    }

    /**
     * Gets the value of the naptanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaptanCode() {
        return naptanCode;
    }

    /**
     * Sets the value of the naptanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaptanCode(String value) {
        this.naptanCode = value;
    }

    /**
     * Gets the value of the plateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateCode() {
        return plateCode;
    }

    /**
     * Sets the value of the plateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateCode(String value) {
        this.plateCode = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the cleardownCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCleardownCode() {
        return cleardownCode;
    }

    /**
     * Sets the value of the cleardownCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCleardownCode(BigInteger value) {
        this.cleardownCode = value;
    }

    /**
     * Gets the value of the formerStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormerStopPointRef() {
        return formerStopPointRef;
    }

    /**
     * Sets the value of the formerStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormerStopPointRef(String value) {
        this.formerStopPointRef = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptorStructure }
     *     
     */
    public DescriptorStructure getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorStructure }
     *     
     */
    public void setDescriptor(DescriptorStructure value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the alternativeDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeDescriptorsStructure }
     *     
     */
    public AlternativeDescriptorsStructure getAlternativeDescriptors() {
        return alternativeDescriptors;
    }

    /**
     * Sets the value of the alternativeDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeDescriptorsStructure }
     *     
     */
    public void setAlternativeDescriptors(AlternativeDescriptorsStructure value) {
        this.alternativeDescriptors = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointStructure.Place }
     *     
     */
    public StopPointStructure.Place getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointStructure.Place }
     *     
     */
    public void setPlace(StopPointStructure.Place value) {
        this.place = value;
    }

    /**
     * Gets the value of the stopClassification property.
     * 
     * @return
     *     possible object is
     *     {@link StopClassificationStructure }
     *     
     */
    public StopClassificationStructure getStopClassification() {
        return stopClassification;
    }

    /**
     * Sets the value of the stopClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopClassificationStructure }
     *     
     */
    public void setStopClassification(StopClassificationStructure value) {
        this.stopClassification = value;
    }

    /**
     * Gets the value of the stopAreas property.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefsStructure }
     *     
     */
    public StopAreaRefsStructure getStopAreas() {
        return stopAreas;
    }

    /**
     * Sets the value of the stopAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefsStructure }
     *     
     */
    public void setStopAreas(StopAreaRefsStructure value) {
        this.stopAreas = value;
    }

    /**
     * Gets the value of the administrativeAreaRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public AdministrativeAreaRefStructure getAdministrativeAreaRef() {
        return administrativeAreaRef;
    }

    /**
     * Sets the value of the administrativeAreaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public void setAdministrativeAreaRef(AdministrativeAreaRefStructure value) {
        this.administrativeAreaRef = value;
    }

    /**
     * Gets the value of the plusbusZones property.
     * 
     * @return
     *     possible object is
     *     {@link PlusbusZoneRefsStructure }
     *     
     */
    public PlusbusZoneRefsStructure getPlusbusZones() {
        return plusbusZones;
    }

    /**
     * Sets the value of the plusbusZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlusbusZoneRefsStructure }
     *     
     */
    public void setPlusbusZones(PlusbusZoneRefsStructure value) {
        this.plusbusZones = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setNotes(NaturalLanguageStringStructure value) {
        this.notes = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublic(Boolean value) {
        this._public = value;
    }

    /**
     * Gets the value of the stopAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link StopAvailabilityStructure }
     *     
     */
    public StopAvailabilityStructure getStopAvailability() {
        return stopAvailability;
    }

    /**
     * Sets the value of the stopAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAvailabilityStructure }
     *     
     */
    public void setStopAvailability(StopAvailabilityStructure value) {
        this.stopAvailability = value;
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
     *         &lt;element name="NptgLocalityRef" type="{http://www.naptan.org.uk/}NptgLocalityCodeType"/>
     *         &lt;element name="LocalityName" type="{http://www.naptan.org.uk/}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
     *         &lt;element name="AlternativeNptgLocalities" type="{http://www.naptan.org.uk/}NptgLocalityRefsStructure" minOccurs="0"/>
     *         &lt;element name="MainNptgLocalities" type="{http://www.naptan.org.uk/}NptgLocalityRefsStructure" minOccurs="0"/>
     *         &lt;element name="Suburb" type="{http://www.naptan.org.uk/}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
     *         &lt;element name="Town" type="{http://www.naptan.org.uk/}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
     *         &lt;element name="LocalityCentre" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Location">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.naptan.org.uk/}LocationStructure">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "nptgLocalityRef",
        "localityName",
        "alternativeNptgLocalities",
        "mainNptgLocalities",
        "suburb",
        "town",
        "localityCentre",
        "location"
    })
    public static class Place {

        @XmlElement(name = "NptgLocalityRef", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nptgLocalityRef;
        @XmlElement(name = "LocalityName")
        protected NaturalLanguagePlaceNameStructure localityName;
        @XmlElement(name = "AlternativeNptgLocalities")
        protected NptgLocalityRefsStructure alternativeNptgLocalities;
        @XmlElement(name = "MainNptgLocalities")
        protected NptgLocalityRefsStructure mainNptgLocalities;
        @XmlElement(name = "Suburb")
        protected NaturalLanguagePlaceNameStructure suburb;
        @XmlElement(name = "Town")
        protected NaturalLanguagePlaceNameStructure town;
        @XmlElement(name = "LocalityCentre")
        protected Boolean localityCentre;
        @XmlElement(name = "Location", required = true)
        protected StopPointStructure.Place.Location location;

        /**
         * Gets the value of the nptgLocalityRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNptgLocalityRef() {
            return nptgLocalityRef;
        }

        /**
         * Sets the value of the nptgLocalityRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNptgLocalityRef(String value) {
            this.nptgLocalityRef = value;
        }

        /**
         * Gets the value of the localityName property.
         * 
         * @return
         *     possible object is
         *     {@link NaturalLanguagePlaceNameStructure }
         *     
         */
        public NaturalLanguagePlaceNameStructure getLocalityName() {
            return localityName;
        }

        /**
         * Sets the value of the localityName property.
         * 
         * @param value
         *     allowed object is
         *     {@link NaturalLanguagePlaceNameStructure }
         *     
         */
        public void setLocalityName(NaturalLanguagePlaceNameStructure value) {
            this.localityName = value;
        }

        /**
         * Gets the value of the alternativeNptgLocalities property.
         * 
         * @return
         *     possible object is
         *     {@link NptgLocalityRefsStructure }
         *     
         */
        public NptgLocalityRefsStructure getAlternativeNptgLocalities() {
            return alternativeNptgLocalities;
        }

        /**
         * Sets the value of the alternativeNptgLocalities property.
         * 
         * @param value
         *     allowed object is
         *     {@link NptgLocalityRefsStructure }
         *     
         */
        public void setAlternativeNptgLocalities(NptgLocalityRefsStructure value) {
            this.alternativeNptgLocalities = value;
        }

        /**
         * Gets the value of the mainNptgLocalities property.
         * 
         * @return
         *     possible object is
         *     {@link NptgLocalityRefsStructure }
         *     
         */
        public NptgLocalityRefsStructure getMainNptgLocalities() {
            return mainNptgLocalities;
        }

        /**
         * Sets the value of the mainNptgLocalities property.
         * 
         * @param value
         *     allowed object is
         *     {@link NptgLocalityRefsStructure }
         *     
         */
        public void setMainNptgLocalities(NptgLocalityRefsStructure value) {
            this.mainNptgLocalities = value;
        }

        /**
         * Gets the value of the suburb property.
         * 
         * @return
         *     possible object is
         *     {@link NaturalLanguagePlaceNameStructure }
         *     
         */
        public NaturalLanguagePlaceNameStructure getSuburb() {
            return suburb;
        }

        /**
         * Sets the value of the suburb property.
         * 
         * @param value
         *     allowed object is
         *     {@link NaturalLanguagePlaceNameStructure }
         *     
         */
        public void setSuburb(NaturalLanguagePlaceNameStructure value) {
            this.suburb = value;
        }

        /**
         * Gets the value of the town property.
         * 
         * @return
         *     possible object is
         *     {@link NaturalLanguagePlaceNameStructure }
         *     
         */
        public NaturalLanguagePlaceNameStructure getTown() {
            return town;
        }

        /**
         * Sets the value of the town property.
         * 
         * @param value
         *     allowed object is
         *     {@link NaturalLanguagePlaceNameStructure }
         *     
         */
        public void setTown(NaturalLanguagePlaceNameStructure value) {
            this.town = value;
        }

        /**
         * Gets the value of the localityCentre property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLocalityCentre() {
            return localityCentre;
        }

        /**
         * Sets the value of the localityCentre property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLocalityCentre(Boolean value) {
            this.localityCentre = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link StopPointStructure.Place.Location }
         *     
         */
        public StopPointStructure.Place.Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopPointStructure.Place.Location }
         *     
         */
        public void setLocation(StopPointStructure.Place.Location value) {
            this.location = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.naptan.org.uk/}LocationStructure">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Location
            extends LocationStructure
        {


        }

    }

}
