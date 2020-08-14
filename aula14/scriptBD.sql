create database if not exists projeto;
use projeto;

CREATE TABLE itmn032_usuario (
  id int NOT NULL AUTO_INCREMENT,
  email varchar(100) NOT NULL,
  linkfoto varchar(200) DEFAULT NULL,
  nome varchar(100) NOT NULL,
  racf varchar(7) NOT NULL,
  senha varchar(30) DEFAULT NULL,
  constraint pk_usuario PRIMARY KEY (id),
  constraint UNIQUE KEY UK_email_usuario (email),
  constraint UNIQUE KEY UK_racf_usuario (racf)
);
 
create table itmn032_agencia(
   id integer not null auto_increment,
   nome_agencia varchar(100),
   hora_inicio  integer,
   hora_fim     integer,
   constraint pk_agencia primary key (id)
);

create table itmn032_agendamento(
   num_seq integer not null auto_increment,
   nome_cli  varchar(100),
   email_cli varchar(100),
   celular_cli varchar(20),
   data_agendamento date,
   hora_agendamento time,
   observacao varchar(255),
   id_agencia integer not null,
   constraint pk_agendamento primary key (num_seq),
   constraint fk_agencia foreign key (id_agencia) references itmn032_agencia(id)
);

insert into itmn032_usuario values(
null,
'emerson@paduan.pro.br',
'https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg',
'Emerson Paduan',
'1234567',
'1234'
);

insert into itmn032_agencia values(null, 'Agencia 01', 9, 15);
insert into itmn032_agencia values(null, 'Agencia 02', 10, 16);
insert into itmn032_agencia values(null, 'Agencia 03', 10, 15);
insert into itmn032_agencia values(null, 'Agencia 04', 9, 14);

insert into itmn032_agendamento values(null,'Carlos','carlos@it.com','987655678','2020-08-13','110000','',4);
insert into itmn032_agendamento values(null,'Marcos','marcos@it.com','977771111','2020-08-18','111500','',4);
insert into itmn032_agendamento values(null,'Marilia','marilia@it.com','955552222','2020-08-10','113000','',5);