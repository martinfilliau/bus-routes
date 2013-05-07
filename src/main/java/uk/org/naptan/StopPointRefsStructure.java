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
 * Data type for a  collection of one or more stop refs.
 * 
 * <p>Java class for StopPointRefsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPointRefsStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}DeltaListStructure">
 *       &lt;sequence>
 *         &lt;element name="StopPointRef" type="{http://www.naptan.org.uk/}StopPointVersionedRefStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPointRefsStructure", propOrder = {
    "stopPointRef"
})
public class StopPointRefsStructure
    extends DeltaListStructure
{

    @XmlElement(name = "StopPointRef", required = true)
    protected List<StopPointVersionedRefStructure> stopPointRef;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopPointVersionedRefStructure }
     * 
     * 
     */
    public List<StopPointVersionedRefStructure> getStopPointRef() {
        if (stopPointRef == null) {
            stopPointRef = new ArrayList<StopPointVersionedRefStructure>();
        }
        return this.stopPointRef;
    }

}