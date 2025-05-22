create database if not exists db_cadastroAluno 
char set utf8mb4 collate utf8mb4_general_ci;

use db_cadastroAluno;

create table if not exists tb_aluno(
	id  int primary key auto_increment,
    nome varchar(250),
    endereco varchar(250),
    sexo varchar(250),
    cpf char(11),
    matricula varchar(250),
    curso varchar(250)
    
)auto_increment=1;

select * from tb_aluno;



