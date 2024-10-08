package br.com.etechoracio.eteccar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ACESSORIO")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACESSORIO")
    private Long acessorio;

    @Column(name = "TX_DESCRICAO")
    private String descricao;
}
