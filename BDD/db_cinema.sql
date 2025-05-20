create database if not exists db_cinema
char set utf8mb4 collate utf8mb4_general_ci;

use db_cinema;

create table if not exists tb_filme(
	id int primary key auto_increment,
    titulo varchar(250),
    genero varchar(250),
    ano char(4)

)auto_increment = 1;