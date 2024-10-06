package repositorios;

import entidades.Autenticacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutenticacionRepository extends JpaRepository<Autenticacion, Integer> {
}
