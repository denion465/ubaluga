package com.ubaluga.backend.enums;

import lombok.Getter;

@Getter
public enum Sexo {

	MASCULINO("MASCULINO", "Masculino"),
	FEMININO("FEMININO", "Feminino"),
	OUTROS("OUTROS", "Outros");

  private final String codigo;
  private final String nome;

  Sexo(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
}
