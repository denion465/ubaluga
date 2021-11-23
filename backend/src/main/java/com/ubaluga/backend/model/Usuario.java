package com.ubaluga.backend.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ubaluga.backend.enums.Perfis;
import com.ubaluga.backend.enums.Sexo;
import com.ubaluga.backend.util.ConfigUrl;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(schema = ConfigUrl.SCHEMA_PORTAL_UBALUGA, name = "usuario")
public class Usuario {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
  @SequenceGenerator(name = "usuario_id_seq", sequenceName = ConfigUrl.SCHEMA_PORTAL_UBALUGA +
    ".usuario_id_seq", allocationSize = 1)
  @EqualsAndHashCode.Include
  private Integer id;

  @Column(name = "nome", nullable = false)
  private String nome;

  @Column(name = "cpf", nullable = false)
  private String cpf;

  @Column(name = "rg", nullable = false)
  private String rg;

  @Enumerated(EnumType.STRING)
  @Column(name = "sexo", nullable = false)
  private Sexo sexo;

  @JsonIgnore
  @Embedded
  @Column(name = "endereco", nullable = false)
  private Endereco endereco;

  @Column(name = "data_nascimento", columnDefinition = "dateTime", nullable = false)
  private LocalDateTime dataNascimento;

  @Column(name = "email")
  private String email;

  @Column(name = "telefone", nullable = false)
  private String telefone;

  @CreationTimestamp
  @Column(name = "data_cadastro", columnDefinition = "dateTime", nullable = false)
  private LocalDateTime dataCadastro;

  @Enumerated(EnumType.STRING)
  @Column(name = "permissao", nullable = false)
  private Perfis permissao;

  @OneToMany
  @Column(name = "imoveis", nullable = false)
  private List<Imovel> imoveis = new ArrayList<>();
}
