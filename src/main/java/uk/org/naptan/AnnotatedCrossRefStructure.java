//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Abstract Collation with  industry reference systems
 * 
 * <p>Java class for AnnotatedCrossRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedCrossRefStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.naptan.org.uk/}VersionedChildStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedCrossRefStructure")
@XmlSeeAlso({
    AnnotatedMetroRefStructure.class,
    AnnotatedFerryRefStructure.class,
    AnnotatedAirRefStructure.class,
    AnnotatedRailRefStructure.class,
    AnnotatedCoachRefStructure.class
})
public abstract class AnnotatedCrossRefStructure
    extends VersionedChildStructure
{


}