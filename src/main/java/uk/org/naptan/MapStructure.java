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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Either a rendered map or a sequence of points that can be rendered by the client.
 * 
 * <p>Java class for MapStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Mapping" type="{http://www.naptan.org.uk/}LineStringStructure"/>
 *         &lt;element name="RenderedMap" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapStructure", propOrder = {
    "mapping",
    "renderedMap"
})
public class MapStructure {

    @XmlElement(name = "Mapping")
    protected LineStringStructure mapping;
    @XmlElement(name = "RenderedMap")
    @XmlSchemaType(name = "anyURI")
    protected String renderedMap;

    /**
     * Gets the value of the mapping property.
     * 
     * @return
     *     possible object is
     *     {@link LineStringStructure }
     *     
     */
    public LineStringStructure getMapping() {
        return mapping;
    }

    /**
     * Sets the value of the mapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringStructure }
     *     
     */
    public void setMapping(LineStringStructure value) {
        this.mapping = value;
    }

    /**
     * Gets the value of the renderedMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderedMap() {
        return renderedMap;
    }

    /**
     * Sets the value of the renderedMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderedMap(String value) {
        this.renderedMap = value;
    }

}
