package ws_soap_basedatos.model.bd;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;

    @Column(name = "nomMedico", nullable = false, length = 50)
    private String nomMedico;

    @Column(name = "apeMedico", nullable = false, length = 50)
    private String apeMedico;

    @Column(name = "fechNacMedico", nullable = false)
    private java.sql.Date fechNacMedico;
}
