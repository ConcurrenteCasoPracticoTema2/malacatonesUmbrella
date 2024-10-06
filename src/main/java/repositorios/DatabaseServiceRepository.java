package repositorios;

import entidades.DatabaseService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseServiceRepository extends JpaRepository<DatabaseService, Integer> {
}
