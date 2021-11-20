CREATE SCHEMA IF NOT EXISTS portal_ubaluga;

CREATE TABLE portal_ubaluga.pessoa
(
  id INTEGER NOT NULL,
  nome VARCHAR(100),
  cpf VARCHAR(30),
  rg VARCHAR(30),
  sexo VARCHAR(30),
  data_nascimento TIMESTAMP WITHOUT TIME ZONE,
  email VARCHAR(20),
  telefone VARCHAR(20),
  CONSTRAINT pk_pessoa PRIMARY KEY (id)
);

CREATE TABLE portal_ubaluga.endereco
(
  id INTEGER NOT NULL,
  logradouro VARCHAR(30),
  numero INTEGER,
  sem_numero BOOLEAN,
  complemento VARCHAR(100),
  bairro VARCHAR(100),
  cep VARCHAR(15),
  CONSTRAINT pk_endereco PRIMARY KEY (id),
  FOREIGN KEY (pessoa.id),
    REFERENCES pessoa (pessoa_id)
);