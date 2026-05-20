/*
POO:programacion orientada a objetos
La Programación Orientada a Objetos (POO) es una forma de programar donde organizamos el código usando objetos, que representan cosas del mundo real.

En lugar de pensar en funciones sueltas, pensamos en:

cosas (objetos): ejemplo un auto rojo marca toyota

sus características (atributos): son los datos del objeto:color rojo, marca toyota,modelo corolla,velocidad 0

lo que pueden hacer (métodos): lo qeu el objeto puede hacer como arrancar(),acelerar(),frenar(),apagar()

##creando objetos en java:
Definimos la clase: es como un molde o plantilla para crear objetos, define los atributos y métodos que los objetos de esa clase tendrán.

class Auto {
    String marca;
    String color;
    int velocidad;

    void acelerar() {
        velocidad += 10;
    }

    void frenar() {
        velocidad -= 5;
    }
}

pero esa seria la plantilla no mas para crear el objeto seria asi:
## crear objetos a partir de la clase,Crear el objeto (instancia)

Auto miAuto = new Auto();

miAuto.marca = "Toyota";
miAuto.color = "Rojo";
miAuto.velocidad = 0;
miAuto.acelerar();

resumen:
Clase → plantilla (Auto)
Objeto → instancia (miAuto)
Atributos → datos (marca, color)
Métodos → acciones (acelerar, frenar)


EN ECLIPSE:

Cuando se crea un proyecto se crea una carpeta src y aparece otra carpeta con las librerias, dentro de esa carpeta src se crean paquetes (carpetas) para organizar el código, por ejemplo un paquete llamado banco,
dentro de ese paquete se crean las clases Cuenta, CuentaBancaria y Main.
quedando asi:(modelo del curso hasta la clase 11)


Nombre del proyecto(Banco)
    JRE System Library
    src
        package(default package)/banco
            Main.java
        package clases
            Cuenta.java
            CuentaBancaria.java


*/