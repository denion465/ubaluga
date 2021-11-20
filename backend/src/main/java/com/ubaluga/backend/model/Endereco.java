package com.ubaluga.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ubaluga.backend.util.ConfigUrl;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = ConfigUrl.SCHEMA_PORTAL_UBALUGA, name = "endereco")
public class Endereco {

  @Id
  @Column(name = "endereco_id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_id_seq")
  @SequenceGenerator(name = "endereco_id_seq", sequenceName = ConfigUrl.SCHEMA_PORTAL_UBALUGA + ".endereco_id_seq", allocationSize = 1)
  private Integer id;

  @Column(name = "logradouro")
  private String logradouro;

  @Column(name = "numero_casa")
  private Number numeroCasa;
  
  @Column(name = "sem_numero")
  private Boolean semNumero;

  @Column(name = "complemento")
  private String complemento;

  @Column(name = "bairro")
  private String bairro;

  @Column(name = "cep")
  private String cep;
}
