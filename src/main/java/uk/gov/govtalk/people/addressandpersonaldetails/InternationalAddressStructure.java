//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.gov.govtalk.people.addressandpersonaldetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalAddressStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalAddressStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntAddressLine" type="{http://www.govtalk.gov.uk/people/AddressAndPersonalDetails}AddressLineType" maxOccurs="5" minOccurs="2"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Country" type="{http://www.govtalk.gov.uk/people/AddressAndPersonalDetails}AddressLineType"/>
 *             &lt;element name="InternationalPostCode" type="{http://www.govtalk.gov.uk/people/AddressAndPersonalDetails}InternationalPostCodeType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="InternationalPostCode" type="{http://www.govtalk.gov.uk/people/AddressAndPersonalDetails}InternationalPostCodeType"/>
 *             &lt;element name="Country" type="{http://www.govtalk.gov.uk/people/AddressAndPersonalDetails}AddressLineType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalAddressStructure", propOrder = {
    "content"
})
public class InternationalAddressStructure {

    @XmlElementRefs({
        @XmlElementRef(name = "Country", namespace = "http://www.govtalk.gov.uk/people/AddressAndPersonalDetails", type = JAXBElement.class),
        @XmlElementRef(name = "InternationalPostCode", namespace = "http://www.govtalk.gov.uk/people/AddressAndPersonalDetails", type = JAXBElement.class),
        @XmlElementRef(name = "IntAddressLine", namespace = "http://www.govtalk.gov.uk/people/AddressAndPersonalDetails", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "InternationalPostCode" is used by two different parts of a schema. See: 
     * line 149 of file:/Users/martinfilliau/Downloads/NaPTAN_schemas_2.4/apd/AddressTypes-v1-3.xsd
     * line 143 of file:/Users/martinfilliau/Downloads/NaPTAN_schemas_2.4/apd/AddressTypes-v1-3.xsd
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<String>>();
        }
        return this.content;
    }

}