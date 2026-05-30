#1. Empleados del mismo departamento que el empleado con id = 3
SELECT nombre, salario FROM Empleados
WHERE id_departamento = (
    SELECT id_departamento FROM Empleados
    WHERE id_empleado = 3
);

#2. Nombre del departamento y empleado con salario más alto en cada departamento
SELECT D.nombre_departamento, E.nombre, E.salario
FROM Empleados E
JOIN Departamentos D ON E.id_departamento = D.id_departamento
WHERE E.salario = (
    SELECT MAX(salario) FROM Empleados
    WHERE id_departamento = E.id_departamento
);

#3. Nombre del departamento y número de empleados ordenado descendente
SELECT D.nombre_departamento, COUNT(E.id_empleado) AS total_empleados
FROM Departamentos D
JOIN Empleados E ON D.id_departamento = E.id_departamento
GROUP BY D.nombre_departamento
ORDER BY total_empleados DESC;

#4. Departamento con mayor promedio de salarios
SELECT D.nombre_departamento, AVG(E.salario) AS promedio_salario
FROM Departamentos D
JOIN Empleados E ON D.id_departamento = E.id_departamento
GROUP BY D.nombre_departamento
ORDER BY promedio_salario DESC
LIMIT 1;