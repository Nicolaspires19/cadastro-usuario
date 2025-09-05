package com.ads.cadastro_usuario.infrastructure.repository.entitys;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
<<<<<<< HEAD
=======

>>>>>>> 76e5ef0d6b6f8f593f40f74a832ee64fe22d56d4
}
