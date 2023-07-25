SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS new_table;
DROP TABLE IF EXISTS pedidos;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS empleados;
DROP TABLE IF EXISTS OFICINAS;
DROP TABLE IF EXISTS productos;




/* Create Tables */

CREATE TABLE cliente
(
	CODEMPPLE int(11) NOT NULL,
	NOMBRE varchar(20) NOT NULL,
	DIRECC varbinary(30) NOT NULL,
	EMAIL varchar(20) NOT NULL,
	CODEMPPLE int(11) NOT NULL,
	PRIMARY KEY (CODEMPPLE)
);


CREATE TABLE empleados
(
	CODEMPPLE int(11) NOT NULL,
	Nombre varchar(20) NOT NULL,
	DIRECC varbinary(30) NOT NULL,
	TLF varchar(10) NOT NULL,
	TIPO varchar(1) NOT NULL,
	ESPECIALIDAD varchar(30) NOT NULL,
	TITULACION varchar(30) NOT NULL,
	PRIMA float NOT NULL,
	CODEMPPLE int(11) NOT NULL,
	CODEMPPLE int(11) NOT NULL,
	PRIMARY KEY (CODEMPPLE)
);


CREATE TABLE new_table
(
	CODEMPPLE int(11) NOT NULL,
	CODEMPPLE int(11) NOT NULL
);


CREATE TABLE OFICINAS
(
	CODEMPPLE int(11) NOT NULL,
	NOMBRE varchar(20) NOT NULL,
	CIUDAD varchar(15) NOT NULL,
	PRIMARY KEY (CODEMPPLE)
);


CREATE TABLE pedidos
(
	CODEMPPLE int(11) NOT NULL,
	NOMBRE varchar(20),
	CODEMPPLE int(11) NOT NULL,
	FECHA date,
	PRIMARY KEY (CODEMPPLE)
);


CREATE TABLE productos
(
	CODEMPPLE int(11) NOT NULL,
	NOMBRE varchar(20) NOT NULL,
	STOCK int(20) NOT NULL,
	PRIMARY KEY (CODEMPPLE)
);



/* Create Foreign Keys */

ALTER TABLE pedidos
	ADD FOREIGN KEY (CODEMPPLE)
	REFERENCES cliente (CODEMPPLE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cliente
	ADD FOREIGN KEY (CODEMPPLE)
	REFERENCES empleados (CODEMPPLE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE empleados
	ADD FOREIGN KEY (CODEMPPLE)
	REFERENCES empleados (CODEMPPLE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE empleados
	ADD FOREIGN KEY (CODEMPPLE)
	REFERENCES OFICINAS (CODEMPPLE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE new_table
	ADD FOREIGN KEY (CODEMPPLE)
	REFERENCES pedidos (CODEMPPLE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE new_table
	ADD FOREIGN KEY (CODEMPPLE)
	REFERENCES productos (CODEMPPLE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



