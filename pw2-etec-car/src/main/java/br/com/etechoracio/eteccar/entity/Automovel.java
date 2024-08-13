package br.com.etechoracio.eteccar.entity;

import br.com.etechoracio.eteccar.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "TBL_AUTOMOVEL")
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTOMOVEL")
    private Long id;

    @Column(name = "NR_ANO_FABRICACAO")
    private int anoFabricacao;

    @Column(name = "NR_ANO_MODELO")
    private int anoModelo;

    @Column(name = "TP_COMBUSTIVEL")
    @Enumerated(EnumType.STRING)
    private TipoCombustivelEnum tipoCombustao;

    @Column(name = "NR_PRECO", columnDefinition = "numeric")
    private Double nrPreco;

    @Column(name = "NR_KM_ATUAL")
    private int nrKmAtual;

    @JoinColumn(name = "ID_MODELO")
    @ManyToOne
    private Modelo idModelo;

    @Transient
    private List<Acessorio> acessorios;

}
