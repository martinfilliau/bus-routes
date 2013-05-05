//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of one or more elements corresponding to members of a relationship. Normally all members but may beretrticed to dletas if indicated by   Modifcation status. 
 * 
 * <p>Java class for DeltaListStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeltaListStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="modification" type="{http://www.naptan.org.uk/}ModificationEnumeration" default="revise" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeltaListStructure")
@XmlSeeAlso({
    StopPointsStructure.class,
    StopAreasStructure.class,
    RegionRefsStructure.class,
    PlusbusZoneRefsStructure.class,
    AdministrativeAreaRefsStructure.class,
    NptgLocalityRefsStructure.class,
    StopAreaRefsStructure.class,
    StopAvailabilityStructure.class,
    StopPointRefsStructure.class,
    AlternativeDescriptorsStructure.class
})
public class DeltaListStructure {

    @XmlAttribute
    protected ModificationEnumeration modification;

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        if (modification == null) {
            return ModificationEnumeration.REVISE;
        } else {
            return modification;
        }
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

}
