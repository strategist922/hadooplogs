//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.16 at 05:40:33 PM CET 
//


package load.hadoop.conf.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}subparses" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="delim" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subparses"
})
@XmlRootElement(name = "parse")
public class Parse {

    protected Subparses subparses;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String delim;
    @XmlAttribute
    protected BigInteger index;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Gets the value of the subparses property.
     * 
     * @return
     *     possible object is
     *     {@link Subparses }
     *     
     */
    public Subparses getSubparses() {
        return subparses;
    }

    /**
     * Sets the value of the subparses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subparses }
     *     
     */
    public void setSubparses(Subparses value) {
        this.subparses = value;
    }

    /**
     * Gets the value of the delim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelim() {
        return delim;
    }

    /**
     * Sets the value of the delim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelim(String value) {
        this.delim = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
