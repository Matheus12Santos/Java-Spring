package br.com.etechoracio.eteccar.entity;

import br.com.etechoracio.eteccar.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_AUTOMOVEL")
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

    @ManyToMany
    @JoinTable(name = "TBL_REL_AUTOMOVEL_ACESSORIO",
        joinColumns = @JoinColumn(name = "ID_AUTOMOVEL"),
        inverseJoinColumns = @JoinColumn(name = "ID_ACESSORIO")
    )
    private List<Acessorio> acessorios;

}
