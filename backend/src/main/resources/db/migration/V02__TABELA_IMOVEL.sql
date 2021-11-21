CREATE SEQUENCE portal_ubaluga.imovel_id_seq;

CREATE TABLE portal_ubaluga.imovel
(
  id INTEGER NOT NULL DEFAULT nextval('portal_ubaluga.imovel_id_seq'::regclass),
  endereco_logradouro VARCHAR(30) NOT NULL,
  endereco_numero VARCHAR(30) NOT NULL,
  endereco_sem_numero BOOLEAN NOT NULL,
  endereco_complemento VARCHAR(30) NOT NULL,
  endereco_bairro VARCHAR(30) NOT NULL,
  endereco_cep VARCHAR(30) NOT NULL,
  modalidade_locacao VARCHAR(10) NOT NULL,
  data_cadastro TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  CONSTRAINT pk_imovel PRIMARY KEY (id)
);
