/* comentários */
# comentário

#alter table departamento drop column nomeDepto; - remove a coluna
#alter table departamento add column nomeDep varchar(50); - altera para o valor correto da columa

#removendo uma linha da tabela
#delete from departamento where idDepto=3;
#delete from funcionario where idFunc=3;

#traz os detalhes da tabela funcionário
desc funcionario;

#consulta os dados da tabela departamento
select * from departamento;

select	* from funcionario;

select * from projeto;

select * from projfunc;

#listar todos os funcionarios da empresa
select * from funcionario;
#Listar apenas nome e email dos funcionarios
select nome, email from funcionario;

#procurar o email do funcionário que contenha o nome Pedro
SELECT 
    nome, email
FROM
    funcionario
WHERE
    nome LIKE 'Pedro%';

#listar todos os funcionarios e seus projetos
select funcionario.nome, projeto.titulo
from funcionario inner join projfunc using (idFunc)
	inner join projeto using (idProj);

#Quais os departamentos de cada funcionario
#solução 1
select funcionario.nome, departamento.nomeDep
from funcionario inner join departamento on funcionario.idDepto = departamento.idDepto;
#solução 2

#lista todos os funcionarios e seus projetos, mesmo que o funcionarioa não esteja em projetos
select funcionario.nome, projeto.titulo
from funcionario left join projfunc using (idFunc)
	left join projeto using(idProj) order by funcionario.nome;
    
# em quantos projetos cada func está alocado
select funcionario.nome, count(idProj) NumProjetos
from funcionario left join projfunc using (idFunc)
	left join projeto using (idProj)
    group by idFunc
    order by funcionario.nome;

#mostre a media de salario dos funcs    
 select avg(salario) mediaSalario
 from funcionario;

#quais são os funcionadios que ganham acima da media
select nome, salario
from funcionario
where salario > (
	select avg(salario) mediaSalario
    from funcionario
);


#quem foi contratado no dia 14/01/2020

#solução1
select nome from funcionario where dataAdm = '2020-01-14';
#soluçao2
select nome from funcionario where dataAdm = str_to_date('14/01/2020','%d/%m/%Y');