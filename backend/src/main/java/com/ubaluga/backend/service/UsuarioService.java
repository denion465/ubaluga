package com.ubaluga.backend.service;

import com.ubaluga.backend.model.Usuario;
import com.ubaluga.backend.repository.UsuarioRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {

  private final UsuarioRepository usuarioRepository;

  public ResponseEntity<Void> salvar (Usuario usuario) {
    usuarioRepository.save(usuario);

    return ResponseEntity.ok().build();
  }

}
