package com.ads.cadastro_usuario.controller;

import com.ads.cadastro_usuario.business.UsuarioService;
import com.ads.cadastro_usuario.infrastructure.repository.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
     }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPoremail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPoremail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPoremail(@RequestParam String email) {
        usuarioService.deletarUsuarioPoremail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id, @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}