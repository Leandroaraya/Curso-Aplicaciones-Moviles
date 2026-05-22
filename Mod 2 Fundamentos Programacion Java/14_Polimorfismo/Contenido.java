/*
DIAGRAMA DE CLASES
- Es una representación gráfica de las clases, sus atributos, métodos y las relaciones entre ellas.





POLIMORFISMO-> “Muchas formas”
IDEA SIMPLE

El polimorfismo permite que:

👉 un mismo método o acción
👉 se comporte de distintas formas

ejemplo:
Animal a = new Perro();
Animal b = new Gato();
Y ambos tienen:
a.hacerSonido();
b.hacerSonido();
PERO CADA UNO HACE ALGO DISTINTO
Perro → “Guau”
Gato → “Miau”

👉 mismo método
👉 distinto comportamiento

TIPOS PRINCIPALES
1. 🟢 Polimorfismo por herencia (el más importante)
Animal a = new Perro(); 👉 la referencia es Animal y el objeto real es Perro

2. 🟡 Sobrecarga de métodos (overloading): 👉 mismo método, diferentes parámetros
suma(int a, int b)
suma(double a, double b)

3. 🔴 Sobreescritura (overriding): 👉 clase hija cambia comportamiento del padre
class Animal {
    void sonido() {
        System.out.println("sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("Guau");
    }
}

El polimorfismo es la capacidad de un objeto de tomar múltiples formas, permitiendo que un mismo método tenga distintos comportamientos 
según el objeto que lo implemente.



---------------------------------------------------------------
public class Subclase extends Superclase {
    // Atributos y métodos específicos de la Subclase
}

---------------------------------------------------------------
Sobreescritura: @Override

*/