Create database IPet;

use Ipet;

create table tbl_animal(
	IDAnimal int primary key auto_increment, 
    nome varchar(50), 
    raca varchar(45), 
    peso double);


create table tbl_cliente(
	IDCliente int primary key auto_increment not null, 
	nome varchar(50) not null ,
	cpf BIGINT not null,
    telefone int not null,
	data_nascimento date not null

) engine = InnoDB; 



create table tbl_funcionario(
	IDFuncionario int primary key auto_increment, 
	nome varchar(50),
	cpf BIGINT,
	data_nascimento date,
	tipo char(1));


create table tbl_produto(
	IDProduto int primary key auto_increment,
	nome varchar(50),
	valor decimal(10,2),
	descricao TEXT) engine = InnoDB;


create table tbl_servico(IDServico int primary key auto_increment, 
nome varchar(50), 
valor double, 
descricao TEXT) engine = InnoDB;


create table tbl_item_pedido(ID_ItemPedido int not null primary key auto_increment) engine= InnoDB;


create table tbl_pedido(IDPedido int not null primary key auto_increment) engine = InnoDB;


create table tbl_endereco(IDEndereco int not null primary key auto_increment, 
rua varchar(30), cidade varchar(30), numero int) engine= InnoDB ;


alter table tbl_cliente
add IDEndereco int not null,
add constraint fk_IDEndereco
foreign key(IDEndereco)
references tbl_endereco(IDEndereco);



alter table tbl_pedido
add IDFuncionario int not null,
add constraint fk_IDFuncionario
foreign key(IDFuncionario)
references tbl_funcionario(IDFuncionario);


alter table tbl_item_pedido
add IDPedido int not null,
add constraint fk_IDPedido
foreign key(IDPedido)
references tbl_pedido(IDPedido);


select * from tbl_cliente;
select * from tbl_item_pedido;
select * from tbl_produto;
select * from tbl_animal;
select * from tbl_funcionario;
select * from tbl_pedido;
select * from tbl_servico;


#TABELA DE CLIENTES
delimiter $
create procedure addCliente (in nome varchar(50), in cpf bigint, in data_nascimento date,in telefone int, in cod_pet int)

	begin
    
		insert into tbl_cliente(nome, cpf, data_nascimento,telefone,cod_pet) values (nome, cpf, data_nascimento, telefone, cod_pet);
    
    end $
    

#TABELA DE PRODUTOS    
delimiter $
create procedure addProduto (in nome_produto varchar(50), in valor_produto decimal(10,2), in descricao_produto text)

	begin
    
		insert into tbl_produto(nome, valor, descricao) values (nome_produto, valor_produto, descricao_produto);
    
    end $
    
#TABELA DE SERVIÇOS
delimiter $
create procedure addServico (in nome_servico varchar(50), in valor_servico double, in descricao_servico text) 
	
    begin
    
		insert into tbl_servico(nome,valor,descricao) values (nome_servico,valor_servico, descricao_servico); 
        
    end $
    
    
    delimiter $
create procedure addAnimal (in nome_animal varchar(50), in raca_animal varchar(40), in peso decimal(10,2))

	begin
    
		insert into tbl_animal(nome,raca , peso_animal,cod_pet) values (nome_animal, raca_animal, peso_animal);
    
    end $
    