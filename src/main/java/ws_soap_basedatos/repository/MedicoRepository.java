package ws_soap_basedatos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ws_soap_basedatos.model.bd.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer>{
}
