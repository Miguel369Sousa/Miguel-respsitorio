CREATE TABLE enderecos
(
    id integer NOT NULL,
    cep varchar(8),
    logradouro varchar(50) ,
    numero varchar(10) ,
    complemento varchar(100) ,
    idpessoa integer,
    CONSTRAINT endereco_pkey PRIMARY KEY (id)
);


CREATE TABLE pessoa
(
    id integer NOT NULL,
    nome varchar(200) ,
    sobrenome varchar(200) ,
    rg varchar(7) ,
    cpf varchar(11) ,
    CONSTRAINT pessoa_pkey PRIMARY KEY (id)
);