create database if not exists db_javabank
char set utf8mb4 collate utf8mb4_general_ci;

use db_javabank;

create table if not exists tb_pessoa(
	id int primary key auto_increment,
    nome varchar(256) not null,
    cpf char(11) unique not null,
    idade smallint,
    sexo char(1)
)auto_increment=1;

create table if not exists tb_usuario(
	id int auto_increment primary key,
    nome varchar(100),
    email varchar(100),
    telefone varchar(20),
    tipo_usuario varchar(50)
    

)auto_increment=1;

select * from tb_usuario;
