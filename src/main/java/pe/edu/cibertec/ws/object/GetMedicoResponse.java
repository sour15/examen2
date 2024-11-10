package pe.edu.cibertec.ws.object;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "medico"
})
@XmlRootElement(name = "getMedicoResponse")
public class GetMedicoResponse {

    @XmlElement(required = true)
    protected MedicoSoap medico;

    /**
     * Obtiene el valor de la propiedad medico.
     *
     * @return
     *     possible object is
     *     {@link MedicoSoap }
     *
     */
    public MedicoSoap getMedico() {
        return medico;
    }

/**
 * Define el valor de la propiedad medico.
 *
 * @param value
 *     allowed object is
 *     {@link
