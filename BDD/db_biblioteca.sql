create database if not exists db_cadastro
char set utf8mb4 collate utf8mb4_general_ci;

use db_cadastro;

create table if not exists tb_usuario(
	id int auto_increment primary key,
    nome varchar(100),
    email varchar(100),
    telefone varchar(100),
	tipo_usuario varchar(100)
    
)auto_increment=1;

select * from tb_usuario;