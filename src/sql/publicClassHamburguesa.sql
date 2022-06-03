DROP DATABASE IF EXISTS publicClassHamburguesa;

CREATE DATABASE publicClassHamburguesa;

USE publicClassHamburguesa;

CREATE TABLE empleado(
	id INT auto_increment,
    nombre VARCHAR(256),
    edad INT,
    PRIMARY KEY (id)
);
    
CREATE TABLE cliente(
	id INT auto_increment,
    usuario VARCHAR(256),
    contraseña VARCHAR(256),
    email VARCHAR(256),
    edad INT,
    PRIMARY KEY (id)
);

CREATE TABLE clientesBaja(
	id INT auto_increment,
    email VARCHAR(256),
    edad INT,
    PRIMARY KEY (id)
);

CREATE TABLE producto(
	id INT auto_increment,
    nombre VARCHAR(256),
    precio FLOAT,
    stock INT,
    popularidad INT,
    PRIMARY KEY (id)
);

CREATE TABLE comanda(
	id INT auto_increment,
    precio FLOAT,
    idEmpleado INT,
    idCliente INT,
    PRIMARY KEY (id, idEmpleado, idCliente),
    FOREIGN KEY (idEmpleado) REFERENCES empleado(id),
    FOREIGN KEY (idCliente) REFERENCES cliente(id)
);

CREATE TABLE lineaComanda(
	id INT auto_increment,
    precio INT,
    cantidad INT,
    idComanda INT,
    idProducto INT,
    PRIMARY KEY(id, idComanda, idProducto),
    FOREIGN KEY(idComanda) REFERENCES comanda(id),
    FOREIGN KEY(idProducto) REFERENCES producto(id)
);

/*Hi ha d’haver-hi un trigger per a insercions, un per a modificacions i un per a eliminacions amb una funcionalitat definida dins l’aplicació. 
Ha de comptar amb al manco un procediment emmagatzemat què s’empri a l’aplicació.*/
DELIMITER //
CREATE TRIGGER reducirStock BEFORE INSERT ON lineaComanda
       FOR EACH ROW
       BEGIN
		UPDATE producto
		SET stock = stock - NEW.cantidad
		WHERE id = NEW.idProducto; 
       END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER aumentarPopularidad BEFORE UPDATE ON producto
       FOR EACH ROW
       BEGIN
		UPDATE producto
		SET popularidad = popularidad + 1
		WHERE id = OLD.id; 
       END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER clienteBaja BEFORE DELETE ON cliente
       FOR EACH ROW
       BEGIN
		INSERT INTO clientesBaja (id, email, edad)
		VALUES (OLD.id, OLD.email, OLD.edad);
       END //
DELIMITER ;


DELIMITER //
CREATE PROCEDURE GetAllProducts()
BEGIN
	SELECT * FROM producto;
END; //
DELIMITER ;

CALL GetAllProducts();



INSERT INTO producto (nombre, precio, stock, popularidad)
VALUES ("Toni Pepperoni", 13, 100, 0);

INSERT INTO producto (nombre, precio, stock, popularidad)
VALUES ("Jorge's Wrap", 11.5, 100, 0);

INSERT INTO producto (nombre, precio, stock, popularidad)
VALUES ("Daniel Ocean", 14.5, 100, 0);
