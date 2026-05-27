CREATE DATABASE tienda;

USE tienda;

CREATE TABLE Clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE Productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    precio DOUBLE
);

CREATE TABLE Ordenes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    cliente_id INT,
    producto_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Clientes(id),
    FOREIGN KEY (producto_id) REFERENCES Productos(id)
);