USE biblioteca2;

CREATE TABLE Actores (
    id_actor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    genero VARCHAR(50)
);

CREATE TABLE Peliculas (
    id_pelicula INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200),
    genero VARCHAR(50),
    id_actor INT,
    FOREIGN KEY (id_actor) REFERENCES Actores(id_actor)
);

INSERT INTO Actores (nombre, genero) VALUES
('Tom Hanks', 'Drama'),
('Scarlett Johansson', 'Acción'),
('Leonardo DiCaprio', 'Drama'),
('Chris Evans', 'Acción'),
('Meryl Streep', 'Drama'),
('Chris Pratt', 'Comedia');

INSERT INTO Peliculas (titulo, genero, id_actor) VALUES
('Forrest Gump', 'Drama', 1),
('Black Widow', 'Acción', 2),
('El Origen', 'Drama', 3),
('Avengers', 'Acción', 4),
('El Diablo viste a la moda', 'Drama', 5),
('Guardianes de la Galaxia', 'Comedia', 6),
('Cast Away', 'Drama', 1),
('Marriage Story', 'Drama', 3);