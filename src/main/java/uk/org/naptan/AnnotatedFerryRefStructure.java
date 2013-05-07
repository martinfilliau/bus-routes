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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Collation with ferry and shipping industry reference systems.
 * 
 * <p>Java class for AnnotatedFerryRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedFerryRefStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}AnnotatedCrossRefStructure">
 *       &lt;sequence>
 *         &lt;element name="FerryRef" type="{http://www.naptan.org.uk/}NationalFerryPortCodeType"/>
 *         &lt;element name="Name" type="{http://www.naptan.org.uk/}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.naptan.org.uk/}LocationStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedFerryRefStructure", propOrder = {
    "ferryRef",
    "name",
    "location"
})
public class AnnotatedFerryRefStructure
    extends AnnotatedCrossRefStructure
{

    @XmlElement(name = "FerryRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ferryRef;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "Location")
    protected LocationStructure location;

    /**
     * Gets the value of the ferryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFerryRef() {
        return ferryRef;
    }

    /**
     * Sets the value of the ferryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFerryRef(String value) {
        this.ferryRef = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

}