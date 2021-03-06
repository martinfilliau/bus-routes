//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.05 at 02:49:41 PM AST 
//


package uk.org.naptan;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="England"/>
 *     &lt;enumeration value="Scotland"/>
 *     &lt;enumeration value="Wales"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="NorthernIreland"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="Eire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryEnumeration")
@XmlEnum
public enum CountryEnumeration {

    @XmlEnumValue("England")
    ENGLAND("England"),
    @XmlEnumValue("Scotland")
    SCOTLAND("Scotland"),
    @XmlEnumValue("Wales")
    WALES("Wales"),

    /**
     * Mainland Great Britain, excluding Northern Ireland
     * 
     */
    GB("GB"),
    @XmlEnumValue("NorthernIreland")
    NORTHERN_IRELAND("NorthernIreland"),

    /**
     * United Kindom, including Scotland, Wales, England and Northern Irelan
     * 
     */
    UK("UK"),
    @XmlEnumValue("Eire")
    EIRE("Eire");
    private final String value;

    CountryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryEnumeration fromValue(String v) {
        for (CountryEnumeration c: CountryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
