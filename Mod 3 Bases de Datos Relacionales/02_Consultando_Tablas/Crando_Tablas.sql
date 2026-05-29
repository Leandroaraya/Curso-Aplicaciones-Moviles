USE biblioteca2;

CREATE TABLE Estudiantes (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100),
    Apellido VARCHAR(100),
    CursoID INT
);

CREATE TABLE Cursos (
    ID INT AUTO_INCREMENT PRIMARY KEY,	
    NombreCurso VARCHAR(100),
    Profesor VARCHAR(100)
);

INSERT INTO Cursos (NombreCurso, Profesor) VALUES
('Matemáticas', 'Prof. García'),
('Historia', 'Prof. López'),
('Ciencias', 'Prof. Martínez'),
('Lenguaje', 'Prof. Rodríguez');

INSERT INTO Estudiantes (Nombre, Apellido, CursoID) VALUES
('Juan', 'Pérez', 1),
('Ana', 'González', 2),
('Carlos', 'Martínez', 1),
('María', 'López', 3),
('Pedro', 'Sánchez', 4),
('Laura', 'Díaz', 2);