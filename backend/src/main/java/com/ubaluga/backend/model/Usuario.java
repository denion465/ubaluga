package com.ubaluga.backend.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ubaluga.backend.enums.Sexo;
import com.ubaluga.backend.util.ConfigUrl;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(schema = ConfigUrl.SCHEMA_PORTAL_UBALUGA, name = "pessoa")
public class Usuario {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_id_seq")
  @SequenceGenerator(name = "pessoa_id_seq", sequenceName = ConfigUrl.SCHEMA_PORTAL_UBALUGA +
    ".pessoa_id_seq", allocationSize = 1)
  @EqualsAndHashCode.Include
  private Integer id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "cpf")
  private String cpf;

  @Column(name = "rg")
  private String rg;

  @Enumerated(EnumType.STRING)
  @Column(name = "sexo")
  private Sexo sexo;

  @JsonIgnore
  @Embedded
  @Column(name = "endereco")
  private Endereco endereco;

  @Column(name = "data_nascimento")
  private Date dataNascimento;

  @Column(name = "email")
  private String email;

  @Column(name = "telefone")
  private String telefone;

  @CreationTimestamp
  @Column(name = "data_cadastro", columnDefinition = "dateTime")
  private LocalDateTime dataCadastro;
}
