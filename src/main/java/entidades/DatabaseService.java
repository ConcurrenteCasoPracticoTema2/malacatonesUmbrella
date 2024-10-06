package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DatabaseService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "programa_id", nullable = false)
    private Programa programa;

    public DatabaseService() {
    }

    public DatabaseService(Integer id, String estado, Programa programa) {
        this.id = id;
        this.estado = estado;
        this.programa = programa;
    }

    public void insertarDatosConcurrentes(Object datos) {
        // Implement the method to insert concurrent data
    }
}