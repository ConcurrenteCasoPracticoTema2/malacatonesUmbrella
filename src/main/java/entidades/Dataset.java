package entidades;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Dataset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rank;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private Integer IQ;

    @Column(nullable = false)
    private Float education_expenditure;

    @Column(nullable = false)
    private Float avg_income;

    @Column(nullable = false)
    private Float avg_temp;

    public Dataset() {
    }

    public Dataset(Integer rank, String country, Integer IQ, Float education_expenditure, Float avg_income, Float avg_temp) {
        this.rank = rank;
        this.country = country;
        this.IQ = IQ;
        this.education_expenditure = education_expenditure;
        this.avg_income = avg_income;
        this.avg_temp = avg_temp;
    }
}