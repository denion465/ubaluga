package com.ubaluga.backend.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Endereco {

  @Column(name = "endereco_logradouro")
  private String logradouro;

  @Column(name = "endereco_numero")
  private String numero;

  @Column(name = "endereco_sem_numero")
  private Boolean semNumero;

  @Column(name = "endereco_complemento")
  private String complemento;

  @Column(name = "endereco_bairro")
  private String bairro;

  @Column(name = "endereco_cep")
  private String cep;
}
