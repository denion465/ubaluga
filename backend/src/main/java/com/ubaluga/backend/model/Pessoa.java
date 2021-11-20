package com.ubaluga.backend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ubaluga.backend.enums.Sexo;
import com.ubaluga.backend.util.ConfigUrl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = ConfigUrl.SCHEMA_PORTAL_UBALUGA, name = "pessoa")
public class Pessoa {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_id_seq")
  @SequenceGenerator(name = "pessoa_id_seq", sequenceName = ConfigUrl.SCHEMA_PORTAL_UBALUGA + ".pessoa_id_seq", allocationSize = 1)
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

  @OneToMany
  private List<Endereco> endereco;

  @Column(name = "data_nascimento")
  private Date dataNascimento;

  @Column(name = "email")
  private String email;

  @Column(name = "telefone")
  private String telefone;
}
