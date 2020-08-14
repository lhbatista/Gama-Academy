insert into itmn032_usuario values(
null,
'luiis_henrique@hotmail.com',
'https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg',
'Luis Henrique',
'1234567',
'1234'
);

select * from itmn032_usuario;

use projeto;
insert into itmn032_agencia values(null,'Agência 01', 9, 15);
insert into itmn032_agencia values(null,'Agência 02', 10, 16);
insert into itmn032_agencia values(null,'Agência 03', 10, 15);
insert into itmn032_agencia values(null,'Agência 04', 9, 14);

select * from itmn032_agencia;
delete from itmn032_agencia where id=1;