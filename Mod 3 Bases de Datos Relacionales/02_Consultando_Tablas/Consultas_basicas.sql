#1. Recuperar todos los registros
SELECT * FROM Libros;

#2. Títulos y autores publicados después del año 2000
SELECT Titulo, Autor, AñoPublicacion FROM Libros
WHERE AñoPublicacion > 2000;

#3. Títulos y géneros de J.K. Rowling
SELECT Titulo, Genero FROM Libros
WHERE Autor = 'J.K. Rowling';

#4. El libro más antiguo
SELECT Titulo FROM Libros
ORDER BY AñoPublicacion ASC
LIMIT 1;

#5. Total de libros
SELECT COUNT(*) FROM Libros;

#6. Ciencia ficción ordenado por año descendente
SELECT Titulo, AñoPublicacion FROM Libros
WHERE Genero = 'Ciencia ficción'
ORDER BY AñoPublicacion DESC;