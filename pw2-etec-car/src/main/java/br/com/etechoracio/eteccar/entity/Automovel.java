package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TBL_AUTOMOVEL")
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTOMOVEL")
    private Long automovel;

    @Column(name = "NR_ANO_FABRICACAO")
    private int anoFabricacao;

    @Column(name = "NR_ANO_MODELO")
    private int anoModelo;

    @Column(name = "TP_COMBUSTIVEL")
    private String tpCombustao;

    @Column(name = "NR_PRECO", columnDefinition = "numeric")
    private Double nrPreco;

    @Column(name = "NR_KM_ATUAL")
    private int nrKmAtual;

    @Column(name = "ID_MODELO")
    private Long idModelo;

}
