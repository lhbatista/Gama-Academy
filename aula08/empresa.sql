# criação de uma nova base de dados

create database empresa;

use empresa; #coloca a database empresa  como padrão

#drop table if exists departamento; #apaga a tabela departamento se ela existir

# criar a tabela de departamentos
create table departamento(
	idDepto int not null auto_increment,
    nomeDep varchar(50),
    andar smallint, 
    constraint pk_departamento primary key(idDepto) #constraint é restrição, e a restrição é PK de primary key que é o ID do Depto
);

create table funcionario(
	idFunc int not null auto_increment,
    nome varchar(100) not null,
    email varchar(80),
    sexo enum('M','F') not null,
    dataADM date,
    salario float,
    idDepto int,	
    constraint pk_funcionario primary key(idFunc),
    constraint fk_func_depto foreign key (idDepto) references departamento(idDepto)
);

#drop table projeto;
create table projeto(
	idProj int not null auto_increment,
    titulo varchar(40),
    constraint pk_projeto primary key(idProj)
);

create table projfunc(
	idFunc int not null,
    idProj int not null,
    constraint pk_projfunc primary key(idFunc, idProj),
    constraint fk_func_projfunc foreign key (idFunc) references funcionario(idFunc),
    constraint fk_proj_projfunc foreign key (idProj) references projeto(idProj)
);

#inserindo dados nas tabelas

insert into departamento values (null, 'Engenharia', 15);
insert into departamento values (null, 'TI', 16);
insert into departamento values (null, 'Financeiro', 15);
insert into departamento values (null, 'Compras', 14);

insert into funcionario values(null, 'Carlos Silva', 'carlos@empresa.com','M', '2020-01-14', 5000, 1);
insert into funcionario values(null, 'Ricardo', 'ricardo@empresa.com','M', '2020-02-13', 6000, 8);
insert into funcionario values(null, 'Pedro', 'pedro@empresa.com','M', '2020-03-10', 4500, 1);
insert into funcionario values(null, 'Camila', 'camila@empresa.com','F', '2020-01-09', 7500, 9);
insert into funcionario values(null, 'Armando', 'armando@empresa.com','M', '2020-05-21', 4500, 10);

insert into projeto values (null, 'Nova rodovia BR-876');
insert into projeto values (null, 'Novo viaduto do chá');
insert into projeto values (null, 'Reforma Maracanã');

insert into projfunc values(1, 1);
insert into projfunc values(4, 1);
insert into projfunc values(1, 2);
insert into projfunc values(1, 3);
insert into projfunc values(5, 3);
