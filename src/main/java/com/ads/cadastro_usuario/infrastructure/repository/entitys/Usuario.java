package com.ads.cadastro_usuario.infrastructure.repository.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
<<<<<<< HEAD
=======

>>>>>>> 76e5ef0d6b6f8f593f40f74a832ee64fe22d56d4
}
