package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "graph_id", nullable = false)
    private Graph graph;

    public Data() {
    }

    public Data(Integer id, String contenido, Graph graph) {
        this.id = id;
        this.contenido = contenido;
        this.graph = graph;
    }
}