package repositorios;

import entidades.Graph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraphRepository extends JpaRepository<Graph, Integer> {
}
