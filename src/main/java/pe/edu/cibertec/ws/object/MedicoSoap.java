package pe.edu.cibertec.ws.object;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicosoap", propOrder = {
        "idMedico",
        "NomMedico",
        "apeMedico",
        "fechamedico"
})
public class MedicoSoap {
    protected int idMedico
    @XmlElement(required = true)
    protected String NomMedico;
    protected int apeMedico;
    @XmlElement(required = true)
    protected String fechamedico;
}
