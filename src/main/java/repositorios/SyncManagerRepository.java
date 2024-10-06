package repositorios;

import entidades.SyncManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyncManagerRepository extends JpaRepository<SyncManager, Integer> {
}
