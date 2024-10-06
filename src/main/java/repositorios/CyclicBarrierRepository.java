package repositorios;

import entidades.CyclicBarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CyclicBarrierRepository extends JpaRepository<CyclicBarrier, Integer> {
}
