create table carro (
  id_carro serial primary key,
  placa varchar(10),
  marca varchar(20),
  modelo varchar(20),
  ano varchar(4),
  valor_diaria numeric(8,2),
  tipo varchar(20),
  quilometragem int,
  status boolean
);
create table cliente (
  id_cliente serial primary key,
  nome varchar(40),
  email varchar(30),
  telefone varchar(12),
  endereco varchar(40),
  cnh varchar(12),
  cartao_credito varchar(20),
  cpf varchar(15)
);
create table aluguel (
  id_aluguel serial primary key,
  dia_inicial date,
  dia_final date,
  valor_total numeric(8,2),
  quilometragem_inicial int,
  quilometragem_final int,
  status_aluguel boolean,
  id_cliente int,
  id_carro int,
  Foreign key (id_cliente) references cliente(id_cliente),
  Foreign key (id_carro) references carro(id_carro)
);

