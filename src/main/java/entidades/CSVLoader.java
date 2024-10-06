package entidades;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class CSVLoader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String archivo;

    @ManyToOne
    @JoinColumn(name = "programa_id", nullable = false)
    private Programa programa;

    @OneToMany(mappedBy = "csvLoader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dataset> datasets;

    public CSVLoader() {
    }

    public CSVLoader(Integer id, String archivo, Programa programa) {
        this.id = id;
        this.archivo = archivo;
        this.programa = programa;
    }

    public void cargarDatos() {

    }
}