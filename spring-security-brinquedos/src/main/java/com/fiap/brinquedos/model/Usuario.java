package com.fiap.brinquedos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cp5_usuarios_brinquedos")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String role;
}
