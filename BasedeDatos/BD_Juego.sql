create database tablasj;
use tablasj;

create table usuarios(
	Id int not null primary key auto_increment, 
    UserName varchar(100) not null
) engine InnoDB;
describe usuarios;


create table Level1(
	Num int not null primary key auto_increment,
	Pregunta varchar(150) not null,
    Opt1 varchar(60) not null,
    Opt2 varchar(60) not null,
    Opt3 varchar(60) not null,
    Res varchar(60) not null
);

insert into Level1(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿De que region es la salsa choque?","Region Caribe","Region Andina", "Region Insular", "Region Pacifica");

insert into Level1(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Quien canta bohemian rhapsody?","The doors","Nirvana", "Los 50 de Joselito ", "Queen");

insert into Level1(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Cual de estos musicos fue considerado uno de los mas grandes del vallenato?","Joe arroyo","Karol G", "Aries vigoth", "Rafael Escalona");

insert into Level1(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿A quien se conoce como ronca de oro?","Rosario Tijeras","Rocio Durcal", "Chavela Vargas", "Helenita Vargas");

insert into Level1(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Quien canta el siguiente fragmento de cancion “mande mi cadillacal al mecanico hace dias hace tanto tiempo que en verdad lo merecia,”?","Elkin Ramirez","Ricardo Montaner", "Julio Iglesias", "Roberto Carlos");



create table Level2(
	Num int not null primary key auto_increment,
	Pregunta varchar(150) not null,
    Opt1 varchar(60) not null,
    Opt2 varchar(60) not null,
    Opt3 varchar(60) not null,
    Res varchar(60) not null
);

insert into Level2(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Cual fue la primera transformacion de Goku?","Super saiyajin Blue","Ultra Institno", "Kaio – Ken", "Super saiyajin");

insert into Level2(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Como se llama el mejor amigo de Carlitos en Aventuras en Pañales?","Angelica","Kimi", "Susie", "Tommy");

insert into Level2(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Cual es la mascota de Bart Simpson?","Mordelon","Seymour Diera", "Bola de nieve III", "Ayudante de santa");

insert into Level2(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿A que famosa serie pertenecia Aurelio Cheveroni?","Play zone","Bichos", "Dia a Dia", "Club 10");

insert into Level2(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿De que planeta venia Alf?","Saturno","Jupiter", "Marte", "Melmac");


create table Level3(
	Num int not null primary key auto_increment,
	Pregunta varchar(150) not null,
    Opt1 varchar(60) not null,
    Opt2 varchar(60) not null,
    Opt3 varchar(60) not null,
    Res varchar(60) not null
);

insert into Level3(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Que fue primero?","La crisis del 2008","La guerra de los 1000 dias", "Batalla de Boyaca", "Grito de Independencia");

insert into Level3(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Cuantas estrofas tiene el himno nacional de Colombia?","16","7", "4", "11");

insert into Level3(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Quien tradujo e imprimio la Declaracion de los derechos del hombre?","Simon Bolivar","Fernando VII", "Antonio Jose Amar", "Antonio Nariño");

insert into Level3(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿En donde murio Simon Bolivar?","Caracas","Bogota", "Cartagena", "Santa Marta");

insert into Level3(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Que politico liberal murio en 1948?","Ernesto Samper","Cesar Gaviria", "Julio Cesar Turbay", "Jorge Eliecer Gaitan");


create table Level4(
	Num int not null primary key auto_increment,
	Pregunta varchar(150) not null,
    Opt1 varchar(60) not null,
    Opt2 varchar(60) not null,
    Opt3 varchar(60) not null,
    Res varchar(60) not null
);

insert into Level4(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Cual es la madre de todas las ciencias?","La Alquimia","La Astrologia", "La matematica", "La filosofia");

insert into Level4(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿De quien es la teoria evolucionista?","Sigmund Freud","Isaac Newton", "Wilhelm Wundt", "Charles Darwin");

insert into Level4(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Quien invento la bombilla?","Gustav Fechner","Schuyler Skaats Wheeler", "Nicolas Tesla", "Thomas Edison");

insert into Level4(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿De quien es la teoria en gato en la caja?","anyos Jedlik","Frank Julian Sprague", "Robert Anderson", "Erwin Schrödinger");

insert into Level4(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Sobre que trata la teoria de la Relatividad General?","Origen cuantico de las cuatro interacciones fundamentales","La expansion del Universo", "Explicar el origen del universo", "Trata de campos gravitatorios");


create table Level5(
	Num int not null primary key auto_increment,
	Pregunta varchar(150) not null,
    Opt1 varchar(60) not null,
    Opt2 varchar(60) not null,
    Opt3 varchar(60) not null,
    Res varchar(60) not null
);

insert into Level5(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Quien fue el autor de historia de dos ciudades?","Stephen King","Dorian Gray", "Charles Xavier", "Charles Dickens");

insert into Level5(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿Quien es el Amor de Florentino Ariza (Amor en los tiempos del colera)?","Clary Fairchild","Lydia Bennet", "Transito Ariza", "Fermina Daza");

insert into Level5(Pregunta, Opt1, Opt2, Opt3, Res)
values("Uno de estos libros no fue escrito por Julio Verne ¿Sabes cual?","Viaje al centro de la Tierra","Hector Servadac", "La isla misteriosa", "El escarabajo de oro");

insert into Level5(Pregunta, Opt1, Opt2, Opt3, Res)
values("¿A que libro pertenece esta famosa frase?: Lo esencial para el corazon es invisible a los ojos","Alicia en el pais de las maravillas","La isla del tesoro", "El mago de Oz", "El Principito");

insert into Level5(Pregunta, Opt1, Opt2, Opt3, Res)
values("Cuando la pobreza entra por la puerta, el amor se va por la ventana. ¿A que famoso libro pertenece esta frase?","Orgullo y prejuicio","Las uvas de la ira", "Madame Bovary", "El retrato de Dorian Grey");

select * from Level1;
select * from Level2;
select * from Level3;
select * from Level4;
select * from Level5;