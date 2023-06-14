CREATE DATABASE trembo;
use trembo;

create table Categoria(
	id_categoria bigint primary key auto_increment,
    nome_categoria varchar(30) not null unique,
    sabor boolean default false,
    proteina boolean default false,
    carboidrato boolean default false,
    sodio boolean default false,
    gorduras_totais boolean default false,
    gorduras_saturadas boolean default false,
    gorduras_trans boolean default false,
    cafeina boolean default false,
    creatina boolean default false,
    beta_alanina boolean default false
);

create table Produto(
	id_produto serial primary key auto_increment,
    nome_produto varchar(100) not null,
    quantidade integer not null,
    valor double not null, 
    conteudo varchar(100) not null,
    porcao varchar(50) not null,
    valor_energetico varchar(50) not null,
    sabor varchar(50),
    proteina varchar(50),
    carboidrato varchar(50),
    sodio varchar(50),
    gorduras_totais varchar(50),
    gorduras_saturadas varchar(50),
    gorduras_trans varchar(50),
    cafeina varchar(50),
    creatina varchar(50),
    beta_alanina varchar(50),
    id_categoria bigint not null,
    foreign key (id_categoria) references categoria (id_categoria)
);

create table Usuario(
	id_usuario bigint primary key auto_increment,
    email varchar(100) not null unique,
    senha varchar(100) not null
);

select * from Categoria;
select * from Produto;

insert into Produto (id_produto, nome_produto, quantidade, valor, conteudo, porcao, valor_energetico, id_categoria) values (null, 'produto1', 10, 20.20, 'teste', '120g', '120kg', 1);

drop table Produto;
drop table Categoria;
