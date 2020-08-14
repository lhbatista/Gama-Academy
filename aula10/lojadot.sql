#create database lojadot;

use lojadot;
insert into usuario values(null,'123456','luis@teste.com','Luis','1234');
insert into usuario values(null,'654321','taina@teste.com','Taina','4321');
insert into usuario values(null,'321654','marta@teste.com','Marta','2341');

select * from usuario;


insert into pedido values(null, '2020-03-10', 'P', 1);
insert into pedido values(null, '2020-03-15', 'A', 1);
insert into pedido values(null, '2020-03-21', 'P', 2);
insert into pedido values(null, '2020-03-25', 'E', 3);

select * from pedido;
#delete from pedido where num_pedido=1;