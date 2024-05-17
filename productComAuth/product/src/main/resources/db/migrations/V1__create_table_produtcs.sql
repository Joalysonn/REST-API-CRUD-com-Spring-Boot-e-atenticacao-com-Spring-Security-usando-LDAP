create table products (

    id bigint not null auto_increment,
    nome varchar(100) not null,
    quantidade varchar(100) not null unique,
	localEstoque varchar(20) not null,
	preco varchar(20) not null,

    primary key(id)

);