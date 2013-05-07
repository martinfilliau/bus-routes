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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for an individual Stop Validity Description of a  period ofr stop activity.
 * 
 * <p>Java class for StopValidityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopValidityStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}VersionedChildStructure">
 *       &lt;sequence>
 *         &lt;element name="DateRange" type="{http://www.naptan.org.uk/}HalfOpenDateRangeStructure"/>
 *         &lt;choice>
 *           &lt;element name="Active" type="{http://www.naptan.org.uk/}EmptyType"/>
 *           &lt;element name="Suspended" type="{http://www.naptan.org.uk/}EmptyType"/>
 *           &lt;element name="Transferred" type="{http://www.naptan.org.uk/}StopPointWrappedRefStructure"/>
 *         &lt;/choice>
 *         &lt;element name="Note" type="{http://www.naptan.org.uk/}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopValidityStructure", propOrder = {
    "dateRange",
    "active",
    "suspended",
    "transferred",
    "note"
})
@XmlSeeAlso({
    StopValidity.class
})
public class StopValidityStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "DateRange", required = true)
    protected HalfOpenDateRangeStructure dateRange;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "Suspended")
    protected String suspended;
    @XmlElement(name = "Transferred")
    protected StopPointWrappedRefStructure transferred;
    @XmlElement(name = "Note")
    protected NaturalLanguageStringStructure note;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenDateRangeStructure }
     *     
     */
    public HalfOpenDateRangeStructure getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenDateRangeStructure }
     *     
     */
    public void setDateRange(HalfOpenDateRangeStructure value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the suspended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspended() {
        return suspended;
    }

    /**
     * Sets the value of the suspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspended(String value) {
        this.suspended = value;
    }

    /**
     * Gets the value of the transferred property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointWrappedRefStructure }
     *     
     */
    public StopPointWrappedRefStructure getTransferred() {
        return transferred;
    }

    /**
     * Sets the value of the transferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointWrappedRefStructure }
     *     
     */
    public void setTransferred(StopPointWrappedRefStructure value) {
        this.transferred = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setNote(NaturalLanguageStringStructure value) {
        this.note = value;
    }

}