package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Graph {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String tipo_grafico;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    @OneToMany(mappedBy = "graph", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Data> data;

    public Graph() {
    }

    public Graph(Integer id, String tipo_grafico, Menu menu) {
        this.id = id;
        this.tipo_grafico = tipo_grafico;
        this.menu = menu;
    }

   /* public void aplicarFiltro(TipoFiltro filtro) {
        // Implement the method to apply filter
    }
    */

}