package com.fiap.brinquedos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cp5_brinq_brinquedos")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private Double preco;
}
