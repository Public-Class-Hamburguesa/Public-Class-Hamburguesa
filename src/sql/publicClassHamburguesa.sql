DROP DATABASE IF EXISTS publicClassHamburguesa;

CREATE DATABASE publicClassHamburguesa;

USE publicClassHamburguesa;

CREATE TABLE empleado(
	id VARCHAR(10),
    nombre VARCHAR(256),
    edad INT,
    PRIMARY KEY (id)
);
    

CREATE TABLE cliente(
	id VARCHAR(10),
    usuario VARCHAR(256),
    contraseña VARCHAR(256),
    email VARCHAR(256),
    edad INT,
    PRIMARY KEY (id)
);

CREATE TABLE producto(
	id VARCHAR(12),
    nombre VARCHAR(256),
    precio INT,
    stock INT,
    PRIMARY KEY (id)
);

CREATE TABLE comanda(
	id VARCHAR(10),
    precio FLOAT,
    idEmpleado VARCHAR(10),
    idCliente VARCHAR(10),
    PRIMARY KEY (id, idEmpleado, idCliente),
    FOREIGN KEY (idEmpleado) REFERENCES empleado(id),
    FOREIGN KEY (idCliente) REFERENCES cliente(id)
);

CREATE TABLE lineaComanda(
	id VARCHAR(10),
    precio INT,
    cantidad INT,
    idComanda VARCHAR(10),
    idProducto VARCHAR(12),
    PRIMARY KEY(id, idComanda, idProducto),
    FOREIGN KEY(idComanda) REFERENCES comanda(id),
    FOREIGN KEY(idProducto) REFERENCES producto(id)
);