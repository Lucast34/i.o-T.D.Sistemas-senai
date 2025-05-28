create database if not exists db_biblioteca21 
CHARACTER SET = utf8mb4
COLLATE = utf8mb4_general_ci;

drop database db_biblioteca21;

show databases;

use db_biblioteca21;

create table if not exists tb_usuario(
	id int primary key auto_increment,
	nome varchar(250) not null,
	email varchar(250) not null,
	telefone varchar(250),
	tipo_usuario varchar(250)not null
	
)auto_increment = 1;

select * from tb_usuario;
