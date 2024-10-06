package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class SyncManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "data_processor_id", nullable = false)
    private DataProcessor dataProcessor;

    public SyncManager() {
    }

    public SyncManager(Integer id, String estado, DataProcessor dataProcessor) {
        this.id = id;
        this.estado = estado;
        this.dataProcessor = dataProcessor;
    }
}