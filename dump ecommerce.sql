drop database Ecommerce;
create database Ecommerce;
use Ecommerce;

CREATE TABLE cliente
(	id SERIAL,
	nome VARCHAR(20),
	cognome VARCHAR(50),
    email VARCHAR(256),
    eta INT
);

CREATE TABLE amministratore
(	id SERIAL,
	nome VARCHAR(20),
	cognome VARCHAR(50),
	email VARCHAR(256),
    eta INT
);

CREATE TABLE magazzino
(	cod_prodotto SERIAL,
	nome VARCHAR(20),
	quantita INT
);

CREATE TABLE prodotto
(	id SERIAL,
	cod_prodotto BIGINT UNSIGNED,
    prezzo DECIMAL(5,2),
    descrizione VARCHAR(256),
    FOREIGN KEY(cod_prodotto) REFERENCES magazzino(cod_prodotto)
);

CREATE TABLE ordine
(	id_ordine BIGINT UNSIGNED,
	cod_prodotto BIGINT UNSIGNED,
	quantita INT,
    acquirente BIGINT UNSIGNED,
    FOREIGN KEY(cod_prodotto) REFERENCES prodotto(cod_prodotto),
	FOREIGN KEY(acquirente) REFERENCES cliente(id)
);

INSERT INTO cliente(nome,cognome,email,eta) VALUES('matteo','parrotta','matteoparrott@outlook.it',21);
INSERT INTO cliente(nome,cognome,email,eta) VALUES('giuseppe','parrotta','giuseppe@outlook.it',25);
INSERT INTO cliente(nome,cognome,email,eta) VALUES('franco','cansio','bidellotrieste@outlook.it',78);

INSERT INTO amministratore(nome,cognome,email,eta) VALUES('Demetrio','Amilcari','bankd@outlook.it',41);

INSERT INTO magazzino(nome,quantita) VALUES('Tv',41);
INSERT INTO magazzino(nome,quantita) VALUES('Smartphone',0);
INSERT INTO magazzino(nome,quantita) VALUES('sedia',6);
INSERT INTO magazzino(nome,quantita) VALUES('cuffie',14);

INSERT INTO prodotto(cod_prodotto,prezzo,descrizione) VALUES(1,400,"bella tv");
INSERT INTO prodotto(cod_prodotto,prezzo,descrizione) VALUES(2,600,"bellissimo smartphone");
INSERT INTO prodotto(cod_prodotto,prezzo,descrizione) VALUES(3,12,"bella sedia");
INSERT INTO prodotto(cod_prodotto,prezzo,descrizione) VALUES(4,40,"belle cuffie");

INSERT INTO ordine(id_ordine,cod_prodotto,quantita,acquirente) VALUES(1,1,2,1);
INSERT INTO ordine(id_ordine,cod_prodotto,quantita,acquirente) VALUES(1,3,3,1);
INSERT INTO ordine(id_ordine,cod_prodotto,quantita,acquirente) VALUES(2,3,2,2);

SELECT c.id id_utente,c.nome,o.id_ordine,o.cod_prodotto,m.nome,o.quantita
FROM ordine AS o,cliente AS c,magazzino AS m
WHERE o.acquirente = c.id AND o.cod_prodotto = m.cod_prodotto

