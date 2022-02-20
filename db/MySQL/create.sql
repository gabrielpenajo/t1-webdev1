DROP
database IF EXISTS Planado;

CREATE
database Planado;

USE Planado;

CREATE TABLE client(
    name VARCHAR(256) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(256) NOT NULL UNIQUE,
    password VARCHAR(256) NOT NULL,
    profile VARCHAR(256) NOT NULL,
    gender VARCHAR(256) NOT NULL,
    phone VARCHAR(9) NOT NULL,
    birth DATE NOT NULL,
    PRIMARY KEY(cpf)
);

CREATE TABLE professional(    
    name VARCHAR(256) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(256) NOT NULL UNIQUE,
    password VARCHAR(256) NOT NULL,
    profile VARCHAR(256) NOT NULL,
    workField VARCHAR(256) NOT NULL,
    expertise VARCHAR(256) NOT NULL,
    resume BLOB NOT NULL,
    PRIMARY KEY(cpf)
);

CREATE TABLE administrator(
    name VARCHAR(256) NOT NULL,
    email VARCHAR(256) NOT NULL UNIQUE,
    password VARCHAR(256) NOT NULL,
    profile VARCHAR(256) NOT NULL,
);

CREATE TABLE appointment(
    clientcpf VARCHAR(256) NOT NULL,
    professionalcpf VARCHAR(256) NOT NULL,
    date TIMESTAMP NOT NULL,
);

INSERT INTO administrator(name, email, password, profile) values ("ADM", "adm@email.com", "adminadmin", "ADMIN");