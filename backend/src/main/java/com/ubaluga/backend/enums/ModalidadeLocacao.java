package com.ubaluga.backend.enums;

import lombok.Getter;

@Getter
public enum ModalidadeLocacao {

  ALUGAR("ALUGAR", "Alugar"),
  VENDER("VENDER", "VENDER");

  private final String nome;
  private final String codigo;

  ModalidadeLocacao(String codigo, String nome) {
    this.codigo = codigo;
		this.nome = nome;
  }
}
