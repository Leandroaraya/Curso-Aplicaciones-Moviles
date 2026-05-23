/*
Problemas en el código actual
🔹 Cohesión baja
Student:
Debería solo manejar información del estudiante (nombre, edad, GPA).
Pero también gestiona profesor y cursos → mezcla responsabilidades.
Teacher:
Debería solo manejar información del profesor.
Pero también gestiona enseñanza y feedback → mezcla responsabilidades.
🔹 Acoplamiento alto
Student depende directamente de Teacher para inscribirse en cursos y recibir enseñanza.
Teacher podría depender de Student para dar feedback.
Esto hace que cambios en una clase afecten la otra, difícil de mantener.
2️⃣ Solución: separar responsabilidades
🔹 Crear una nueva clase Course
Se encargará de gestionar inscripción, lista de estudiantes y profesores.
Student y Teacher ya no interactúan directamente entre sí para cursos.

🔹 Modificar Student
Ahora Student solo maneja datos personales.
Para inscribirse en cursos, se comunica con Course, no directamente con Teacher.

🔹 Modificar Teacher
Teacher solo maneja información personal y métodos de enseñanza.
Ya no maneja directamente a los estudiantes.

3️⃣ Beneficios de esta refactorización
Concepto	Antes	Después
Cohesión	Baja: Student y Teacher hacen muchas cosas	Alta: cada clase tiene una sola responsabilidad
Acoplamiento	Alto: Student y Teacher dependen directamente	Bajo: interactúan mediante Course
Mantenibilidad	Difícil de cambiar	Fácil de extender y modificar
Reutilización	Limitada	Más fácil de reutilizar Course, Student, Teacher

✅ Ahora todo tiene alta cohesión y bajo acoplamiento.


En este ejercicio aprendí a aplicar los conceptos de cohesión y acoplamiento para mejorar el diseño del código. 
Identifiqué que las clases Student y Teacher tenían múltiples responsabilidades (baja cohesión) y dependían 
fuertemente entre sí (alto acoplamiento). Para solucionarlo, separé las responsabilidades creando una nueva 
clase Course, que se encarga de gestionar las inscripciones y la interacción entre estudiantes y profesores. 
De esta forma, cada clase cumple una única función clara (alta cohesión) y se reduce la dependencia directa entre ellas
(bajo acoplamiento), logrando un código más limpio, mantenible y fácil de extender.
*/