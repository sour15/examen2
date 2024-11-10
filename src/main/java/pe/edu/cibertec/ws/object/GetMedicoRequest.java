package pe.edu.cibertec.ws.object;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para anonymous complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdMedico" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "idMedico"
})
@XmlRootElement(name = "getMedicoRequest")
public class GetMedicoRequest {

    @XmlElement(name = "IdMedico", required = true)
    protected int idMedico;

    /**
     * Obtiene el valor de la propiedad idMedico.
     *
     */
    public int getIdMedico() {
        return idMedico;
    }

    /**
     * Define el valor de la propiedad idMedico.
     *
     */
    public void setIdMedico(int value) {
        this.idMedico = value;
    }
}
