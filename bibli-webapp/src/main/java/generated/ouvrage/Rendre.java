
package generated.ouvrage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rendre complex type.
 * 
 * <p>Le fragment de schma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rendre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rendre", propOrder = {
    "arg0",
    "arg1"
})
public class Rendre {

    protected int arg0;
    protected int arg1;

    /**
     * Obtient la valeur de la proprit arg0.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Dfinit la valeur de la proprit arg0.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la proprit arg1.
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Dfinit la valeur de la proprit arg1.
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

}