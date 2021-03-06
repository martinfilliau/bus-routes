//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for availability of stop for use. made up of one or more stop validities in historical order Note that the Status attribute on StopPoint should correspond with the StopValidity intime of export (document  effect at the ModificationDateTime). If no explicit stop validity is present, stop is assumed to have validity as indicated by Status attribute indefinitely, 
 * 
 * <p>Java class for StopAvailabilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopAvailabilityStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}DeltaListStructure">
 *       &lt;sequence>
 *         &lt;element name="StopValidity" type="{http://www.naptan.org.uk/}StopValidityStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopAvailabilityStructure", propOrder = {
    "stopValidity"
})
public class StopAvailabilityStructure
    extends DeltaListStructure
{

    @XmlElement(name = "StopValidity", required = true)
    protected List<StopValidityStructure> stopValidity;

    /**
     * Gets the value of the stopValidity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopValidity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopValidityStructure }
     * 
     * 
     */
    public List<StopValidityStructure> getStopValidity() {
        if (stopValidity == null) {
            stopValidity = new ArrayList<StopValidityStructure>();
        }
        return this.stopValidity;
    }

}
