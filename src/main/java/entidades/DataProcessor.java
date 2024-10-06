package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DataProcessor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "executor_service_manager_id", nullable = false)
    private ExecutorServiceManager executorServiceManager;

    public DataProcessor() {
    }

    public DataProcessor(Integer id, String estado, ExecutorServiceManager executorServiceManager) {
        this.id = id;
        this.estado = estado;
        this.executorServiceManager = executorServiceManager;
    }
}