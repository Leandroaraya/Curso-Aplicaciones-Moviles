CREATE DATABASE biblioteca2; 
USE biblioteca2;

CREATE TABLE Libros (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(200),
    Autor VARCHAR(100),
    AñoPublicacion INT,
    Genero VARCHAR(100)
);

INSERT INTO Libros (Titulo, Autor, AñoPublicacion, Genero) VALUES
('Harry Potter y la piedra filosofal', 'J.K. Rowling', 1997, 'Fantasía'),
('Harry Potter y la cámara secreta', 'J.K. Rowling', 1998, 'Fantasía'),
('El señor de los anillos', 'J.R.R. Tolkien', 1954, 'Fantasía'),
('1984', 'George Orwell', 1949, 'Ciencia ficción'),
('Dune', 'Frank Herbert', 1965, 'Ciencia ficción'),
('El marciano', 'Andy Weir', 2011, 'Ciencia ficción'),
('Cien años de soledad', 'Gabriel García Márquez', 1967, 'Realismo mágico'),
('Don Quijote', 'Miguel de Cervantes', 1605, 'Novela'),
('El código Da Vinci', 'Dan Brown', 2003, 'Thriller'),
('Harry Potter y el prisionero de Azkaban', 'J.K. Rowling', 1999, 'Fantasía');