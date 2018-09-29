drop table if exists persona;
create table persona(
idPersona identity primary key,
nombres varchar(30) not null,
apellidos varchar(30) not null,
direccionDomicilio varchar(30) not null
);