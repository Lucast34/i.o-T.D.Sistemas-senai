create database if not exists db_concessionaria
char set utf8mb4 collate utf8mb4_general_ci;

use db_concessionaria;

create table if not exists tb_carro(
	id int primary key auto_increment,
    marca varchar(100),
    ano varchar(100),
    tipo varchar(50),
    portas int

)auto_increment=1;

select * from tb_carro;
