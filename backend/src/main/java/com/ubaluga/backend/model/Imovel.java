package com.ubaluga.backend.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ubaluga.backend.enums.ModalidadeLocacao;
import com.ubaluga.backend.util.ConfigUrl;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(schema = ConfigUrl.SCHEMA_PORTAL_UBALUGA, name = "imovel")
public class Imovel {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "imovel_id_seq")
  @SequenceGenerator(name = "imovel_id_seq", sequenceName = ConfigUrl.SCHEMA_PORTAL_UBALUGA +
    ".imovel_id_seq", allocationSize = 1)
  @EqualsAndHashCode.Include
  private Integer id;

  @Embedded
  @Column(name = "endereco")
  private Endereco endereco;

  @Column(name = "modalidade_locacao")
  private ModalidadeLocacao modalidadeLocacao;

  @CreationTimestamp
  @Column(name = "data_cadastro")
  private LocalDateTime dataCadastro;
}
