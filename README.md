## Time Manager Project / Version 1.0
 
Projeto realizado para treinar o uso do LocalTime e Duration em Java.

O Banco de Dados é próprio da máquina e não está na rede, por conta disso segue o código do MySql para a criação da database e tabela.

##### Comandos MySql:
    CREATE DATABASE controledetempo;

    CREATE TABLE projeto (
        codigo int auto_increment,
        nomeProjeto varchar(255),
        descricao varchar(1000),
        dataInicial date,
        horarioInicial time,
        dataFinal date,
        horarioFinal time,
        horarioTotal time,
        primary key (codigo)
    );

Obs: o código da tabela a cima foi executado no MySql Workbench 8.0 CE, no qual não foi preciso digitar ao lado das colunas o NULL ou NOT NULL.

##### Como fazer a conexão com o Banco:
    1 - Você deve acessar o arquivo ConnectionDB.java na pasta "conn".
    
    2 - Linha 17 "private static final String URL_MYSQL = "jdbc:mysql://localhost/nbb";" caso você tenha seguido passo a
    passo não precisará fazer qualquer tipo de  modificação, mas caso tenha alterado o
    nome da database, substitua o nome no qual você colocou no lugar de nbb depois de localhost.
    
    3 - Linha 19, você irá colocar o seu usuário do MySql, por padrão é root, porém caso você tenha modificado em algum
    momento, substitua no local pelo usuário no qual o mesmo está utilizando.
    
    4 - Linha 20, você irá colocar a senha deste usuário, mas caso você esteja utilizando o Apache, poderá deixar da
    seguinte forma:
    private static final String PASS = "";
    
    5 - Agora só executar o programa e utilizar.

## Telas Inicial:

<div align="center">
<img src="https://github.com/gustavocarmomendes/Working-day-Project/assets/112448190/324cf194-fad9-45a7-907b-b9c59979d3a4" width="450px" />
</div

## Telas do Controlador:

<div align="center">
<img src="https://github.com/gustavocarmomendes/Working-day-Project/assets/112448190/35884f6d-1a2d-4c28-997f-1dc9fd72ccf0" width="450px" />
</div

## Telas do Visualizador:

<div align="center">
<img src="https://github.com/gustavocarmomendes/Working-day-Project/assets/112448190/a79c84cb-f1b9-4fdc-9702-2f849f4d323a" width="450px" />
</div
