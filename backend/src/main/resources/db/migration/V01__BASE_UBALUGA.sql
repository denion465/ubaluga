CREATE SCHEMA IF NOT EXISTS portal_ubaluga;

CREATE SEQUENCE portal_ubaluga.usuario_id_seq;

CREATE TABLE portal_ubaluga.usuario
(
  id INTEGER NOT NULL DEFAULT nextval('portal_ubaluga.usuario_id_seq'::regclass),
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(30) NOT NULL,
  rg VARCHAR(30) NOT NULL,
  sexo VARCHAR(30) NOT NULL,
  endereco_logradouro VARCHAR(30) NOT NULL,
  endereco_numero VARCHAR(30) NOT NULL,
  endereco_sem_numero BOOLEAN NOT NULL,
  endereco_complemento VARCHAR(30) NOT NULL,
  endereco_bairro VARCHAR(30) NOT NULL,
  endereco_cep VARCHAR(30) NOT NULL,
  data_nascimento TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  email VARCHAR(20) NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  data_cadastro TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  permissao VARCHAR(20) NOT NULL,
  CONSTRAINT pk_usuario PRIMARY KEY (id)
);
