package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CyclicBarrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer cuenta;

    @ManyToOne
    @JoinColumn(name = "sync_manager_id", nullable = false)
    private SyncManager syncManager;

    public CyclicBarrier() {
    }

    public CyclicBarrier(Integer id, Integer cuenta, SyncManager syncManager) {
        this.id = id;
        this.cuenta = cuenta;
        this.syncManager = syncManager;
    }
}