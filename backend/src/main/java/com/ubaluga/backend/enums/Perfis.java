package com.ubaluga.backend.enums;

import lombok.Getter;

@Getter
public enum Perfis {

  LOCADOR("LOCADOR", "Locador"),
  COMPRADOR("COMPRADOR", "Comprador");

  private final String nome;
  private final String codigo;

  Perfis(String nome, String codigo) {
    this.nome = nome;
    this.codigo = codigo;
  }
}
