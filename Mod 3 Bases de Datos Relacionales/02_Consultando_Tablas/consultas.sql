#0 Tablas
SELECT * FROM Estudiantes;
Select * FROM Cursos;

#1. Nombre y apellido de todos los estudiantes
SELECT Nombre, Apellido FROM Estudiantes;

#2. Nombres de estudiantes y el ID del curso en que están inscritos
SELECT Nombre, CursoID FROM Estudiantes;

#3. Nombre del profesor de un curso específico
SELECT Profesor FROM Cursos
WHERE NombreCurso = 'Matemáticas';