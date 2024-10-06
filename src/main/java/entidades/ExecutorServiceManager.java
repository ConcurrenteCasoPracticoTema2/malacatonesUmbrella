package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class ExecutorServiceManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "programa_id", nullable = false)
    private Programa programa;

    @OneToMany(mappedBy = "executorServiceManager", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DataProcessor> dataProcessors;

    public ExecutorServiceManager() {
    }

    public ExecutorServiceManager(Integer id, String estado, Programa programa) {
        this.id = id;
        this.estado = estado;
        this.programa = programa;
    }

    public void ejecutarConcurrencia() {
        // Implement the method to execute concurrency
    }
}