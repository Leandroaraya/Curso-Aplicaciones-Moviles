#1. Título de películas con el nombre del actor principal
SELECT P.titulo, A.nombre
FROM Peliculas P
JOIN Actores A ON P.id_actor = A.id_actor;

#2. Nombre del actor y número de películas ordenado descendente
SELECT A.nombre, COUNT(P.id_pelicula) AS total_peliculas
FROM Actores A
JOIN Peliculas P ON A.id_actor = P.id_actor
GROUP BY A.nombre
ORDER BY total_peliculas DESC;

#3. Películas donde el género del actor coincide con el género de la película
SELECT P.titulo, A.nombre
FROM Peliculas P
JOIN Actores A ON P.id_actor = A.id_actor
WHERE P.genero = A.genero;