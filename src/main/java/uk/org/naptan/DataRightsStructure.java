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
 * Type for recording the data rights of an element.
 * 
 * <p>Java class for DataRightsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRightsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.naptan.org.uk/}DataRight" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRightsStructure", propOrder = {
    "dataRight"
})
public class DataRightsStructure {

    @XmlElement(name = "DataRight", required = true)
    protected List<DataRight> dataRight;

    /**
     * Data right description. (TXC v2.4)
     * @id,
     * @CreationDateTime,
     * @ModificationDateTime,
     * @Modification,
     * @RevisionNumber.Gets the value of the dataRight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRight }
     * 
     * 
     */
    public List<DataRight> getDataRight() {
        if (dataRight == null) {
            dataRight = new ArrayList<DataRight>();
        }
        return this.dataRight;
    }

}
