//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.gov.govtalk.people.bs7666;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BSaddressStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BSaddressStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SAON" type="{http://www.govtalk.gov.uk/people/bs7666}SAONtype" minOccurs="0"/>
 *         &lt;element name="PAON" type="{http://www.govtalk.gov.uk/people/bs7666}PAONtype"/>
 *         &lt;sequence>
 *           &lt;element name="StreetDescription" type="{http://www.govtalk.gov.uk/people/bs7666}StreetDescriptorType"/>
 *           &lt;element name="UniqueStreetReferenceNumber" type="{http://www.govtalk.gov.uk/people/bs7666}USRNtype" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}Locality"/>
 *             &lt;choice minOccurs="0">
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}Town"/>
 *                 &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}AdministrativeArea" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}AdministrativeArea"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}Town"/>
 *             &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}AdministrativeArea" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.govtalk.gov.uk/people/bs7666}AdministrativeArea"/>
 *         &lt;/choice>
 *         &lt;element name="PostTown" type="{http://www.govtalk.gov.uk/people/bs7666}PostTownType" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.govtalk.gov.uk/people/bs7666}PostCodeType" minOccurs="0"/>
 *         &lt;element name="UniquePropertyReferenceNumber" type="{http://www.govtalk.gov.uk/people/bs7666}UPRNtype" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSaddressStructure", propOrder = {
    "content"
})
public class BSaddressStructure {

    @XmlElementRefs({
        @XmlElementRef(name = "SAON", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "UniquePropertyReferenceNumber", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "PAON", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "PostTown", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "Locality", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "UniqueStreetReferenceNumber", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "Town", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "StreetDescription", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "PostCode", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class),
        @XmlElementRef(name = "AdministrativeArea", namespace = "http://www.govtalk.gov.uk/people/bs7666", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "AdministrativeArea" is used by two different parts of a schema. See: 
     * line 97 of file:/Users/martinfilliau/Downloads/NaPTAN_schemas_2.4/apd/BS7666-v1-3.xsd
     * line 95 of file:/Users/martinfilliau/Downloads/NaPTAN_schemas_2.4/apd/BS7666-v1-3.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}
