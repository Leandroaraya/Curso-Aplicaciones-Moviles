#1. Empleados que trabajan en "Ventas"
SELECT nombre, apellido FROM Empleados
WHERE id_departamento = (
    SELECT id_departamento FROM Departamentos
    WHERE nombre_departamento = 'Ventas'
);

#2. Empleados que trabajan en el mismo departamento que el empleado con id = 2
SELECT nombre, salario FROM Empleados
WHERE id_departamento = (
    SELECT id_departamento FROM Empleados
    WHERE id_empleado = 2
);

#3. Empleado cuya ubicación sea Chile
SELECT nombre FROM Empleados
WHERE id_departamento IN (
    SELECT id_departamento FROM Departamentos
    WHERE ubicacion = 'Chile'
);

#4. Empleados con id_departamento igual a 1
SELECT nombre FROM Empleados
WHERE id_departamento = 1;