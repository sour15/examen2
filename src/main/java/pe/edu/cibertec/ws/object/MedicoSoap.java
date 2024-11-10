package pe.edu.cibertec.ws.object;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "especialidadsoap", propOrder = {
        "idEspecialidad",
        "titulo",
        "funcion",
        "fechGraduacion",
        "idMedico"
})
public class MedicoSoap {

    protected int idEspecialidad;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String funcion;
    @XmlElement(required = true)
    protected String fechGraduacion;
    protected int idMedico;

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int value) {
        this.idEspecialidad = value;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String value) {
        this.titulo = value;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String value) {
        this.funcion = value;
    }

    public String getFechGraduacion() {
        return fechGraduacion;
    }

    public void setFechGraduacion(String value) {
        this.fechGraduacion = value;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int value) {
        this.idMedico = value;
    }
}
