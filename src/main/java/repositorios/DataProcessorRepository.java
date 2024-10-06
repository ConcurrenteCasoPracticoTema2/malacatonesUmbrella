package repositorios;

import entidades.DataProcessor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataProcessorRepository extends JpaRepository<DataProcessor, Integer> {
}
