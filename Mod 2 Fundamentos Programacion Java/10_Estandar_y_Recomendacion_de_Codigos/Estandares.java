/*
Escritura en CamelCase para: Clases, Interfaces, Métodos, Variables, Paquetes
- Clases e Interfaces: La primera letra de cada palabra en mayúscula (Ejemplo: MiClase, InterfazEjemplo) nunca en plural
- Métodos y Variables: La primera letra de la primera palabra en minúscula, y la primera letra de cada palabra subsiguiente en mayúscula (Ejemplo: miMetodo, variableEjemplo)
- Paquetes: Todas las letras en minúscula, con palabras separadas por puntos (Ejemplo: com.ejemplo.paquete)
- Constantes: Todas las letras en mayúscula, con palabras separadas por guiones bajos (Ejemplo: MI_CONSTANTE)

solo aplicar import a las clases necesarias, no usar import * para evitar conflictos de nombres y mejorar la legibilidad del código.

Compilar: ejecutar en terminal el comando: asi se traduce el código fuente a bytecode que la máquina virtual de Java puede ejecutar
se obtendra un archivo .class con el mismo nombre que la clase principal (Ejemplo: EjemploBuenasPracticas.class)

-> javac EjemploBuenasPracticas.java

Para luego crear archivo.jar: para crear un archivo ejecutable
-> jar cfe EjemploBuenasPracticas.jar EjemploBuenasPracticas EjemploBuenasPracticas.class
(jar es como un .zip)
c → create → crear el archivo
f → file → indicar el nombre del archivo
e → entry point → definir la clase principal (donde está el main)


ya con el archivo .jar creado, se puede ejecutar con el comando:
-> java -jar EjemploBuenasPracticas.jar

o de del escritorio abriendo la terminal y ejecutar comando + ruta
->java -jar "C:\Curso Apps moviles\Curso-Aplicaciones-Moviles\Mod 2 Fundamentos Programacion Java\10_Estandar_y_Recomendacion_de_Codigos\EjemploBuenasPracticas.jar"
*/