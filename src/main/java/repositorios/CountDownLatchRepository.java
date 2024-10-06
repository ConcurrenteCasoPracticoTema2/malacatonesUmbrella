package repositorios;

import entidades.CountDownLatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountDownLatchRepository extends JpaRepository<CountDownLatch, Integer> {
}
