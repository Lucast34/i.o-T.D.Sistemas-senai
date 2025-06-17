create database if not exists db_padaria
char set collate utf8mb4_general_ci; 

use db_padaria;

create table if not exists tb_funcionario(
    id int primary key auto_increment,
    nome varchar(200) not null,
    cpf char(11) unique not null,
    telefone varchar(12) not null,
    idade smallint,
    sexo char(1)
)auto_increment=1;

create table if not exists tb_fornecedor(
    id int primary key auto_increment,
    nome varchar(200) not null,
    cnpj char(14)not null,
    produto varchar(200)
)auto_increment=1;

create table if not exists tb_padaria(
    id int primary key auto_increment,
    endereco varchar(200) not null, 
    telefone varchar(100) not null,
    email varchar(200) not null,
    id_gerenete int not null,
    id_fucionario int not null,
    id_produto int not null,

    constraint FK_gerente_tb_funcionario foreign key(id_gerente) references tb_gerente(id),
    contraint FK_funcionario_tb_funcionario foreign key(id_funcionario) references tb_funcionario(id),
    constraint FK_produto_tb_produto foreign key (id_produto) references tb_produto(id)
)auto_increment=1;

create table if not exists tb_gerente(
    id int primary key auto_increment,
    nome varchar(200),
    cpf char(11),
    telefone varchar(12)

)auto_increment = 1;

create if not exists tb_produto(
    id int primary key auto_increment,
    nome varchar(256),
    estoque int,
    # preco por quantidade
    preco_qt float(5,2)
)auto_increment = 1;
