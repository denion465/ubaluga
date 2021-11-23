package com.ubaluga.backend.controller;

import java.util.List;

import javax.transaction.Transactional;

import com.ubaluga.backend.model.Usuario;
import com.ubaluga.backend.repository.UsuarioRepository;
import com.ubaluga.backend.service.UsuarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

  private final UsuarioService usuarioService;
  private final UsuarioRepository usuarioRepository;

  @GetMapping
  public List<Usuario> listar() {

    return usuarioRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  @Transactional
  public ResponseEntity<Void> adicionar(@RequestBody Usuario usuario) {

    return usuarioService.salvar(usuario);
  }

}
