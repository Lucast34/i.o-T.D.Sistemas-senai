create database if not exists db_concessionaria
char set utf8mb4 collate utf8mb4_general_ci;

use db_concessionaria;

CREATE TABLE IF NOT EXISTS tb_carro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(100),
    ano CHAR(4),
    tipo VARCHAR(50),
    portas INT
)  AUTO_INCREMENT=1;

select * from tb_carro;

delete from tb_carro where id = 1;