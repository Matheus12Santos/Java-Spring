package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MARCA")
public class Marca {
    // Long maiusculo comeca Nulo, minusculo comeca 0.
    @Id // Pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MARCA")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;


}
