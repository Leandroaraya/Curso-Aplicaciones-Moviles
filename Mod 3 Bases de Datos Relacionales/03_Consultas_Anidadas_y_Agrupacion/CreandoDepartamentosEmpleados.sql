USE biblioteca2;

CREATE TABLE Departamentos (
    id_departamento INT AUTO_INCREMENT PRIMARY KEY,
    nombre_departamento VARCHAR(100),
    ubicacion VARCHAR(100)
);

CREATE TABLE Empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    salario DOUBLE,
    id_departamento INT,
    FOREIGN KEY (id_departamento) REFERENCES Departamentos(id_departamento)
);

INSERT INTO Departamentos (nombre_departamento, ubicacion) VALUES
('Ventas', 'Chile'),
('Marketing', 'Argentina'),
('Tecnología', 'Chile'),
('Recursos Humanos', 'Colombia');

INSERT INTO Empleados (nombre, apellido, salario, id_departamento) VALUES
('Juan', 'Pérez', 1500000, 1),
('Ana', 'González', 2000000, 2),
('Carlos', 'Martínez', 1800000, 1),
('María', 'López', 2200000, 3),
('Pedro', 'Sánchez', 1600000, 4),
('Laura', 'Díaz', 1900000, 3),
('Diego', 'Ramírez', 1700000, 1);