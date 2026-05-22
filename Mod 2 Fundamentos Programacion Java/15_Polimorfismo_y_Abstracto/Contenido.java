/*
Polimorfismo y Abstracto

1. ¿QUÉ ES UNA CLASE ABSTRACTA?

👉 Es una clase que:

✔ NO se puede instanciar
✔ sirve como “base obligatoria” para otras clases
✔ puede tener métodos normales y métodos sin implementar (métodos abstractos)

Animal a = new Animal(); // ❌ ERROR si Animal es abstracta

¿PARA QUÉ SIRVE? -> “todas las clases hijas DEBEN implementar este comportamiento”
ejemplo: si tenemos una clase abstracta “Animal” con un método abstracto “hacerRuido()”, todas las clases que hereden
de “Animal” (como “Perro” o “Gato”) deberán implementar su propia versión de “hacerRuido()”.

abstract class Animal {

    public void dormir() {
        System.out.println("Durmiendo...");
    }

    // método abstracto (sin cuerpo)
    public abstract String hacerRuido();
}
Si una clase tiene al menos un método abstracto → la clase DEBE ser abstracta

class Perro extends Animal {

    @Override
    public String hacerRuido() {
        return "Guau";
    }
}

class Gato extends Animal {

    @Override
    public String hacerRuido() {
        return "Miau";
    }
}

¿QUÉ CAMBIÓ?

Antes:

✔ Animal tenía implementación ("Hola")

Ahora:

❌ Animal ya NO define el sonido
✔ obliga a las hijas a hacerlo

IDEA CLAVE: -> La clase abstracta es como un contrato:
“Si heredas de mí, TIENES que implementar esto”
la clase y metodos pueden ser abstractos o no, pero si hay un metodo abstracto, la clase DEBE ser abstracta.
La clase abstracta evita que se creen objetos “incompletos” y define una base común para otras clases.


class Animal {

    public String hacerRuido() {
        return "???";
    }
}
Animal a = new Animal(); // Esto es posible, pero no tiene sentido real, porque no sabemos qué tipo de animal es ni 
                         // qué ruido hace

❗ Problema:¿qué es ese Animal? no es perro, no es gato, no tiene sentido real
¿QUÉ SE GANA?
✅ 1. Evitar objetos sin sentido

abstract class Animal {

    public abstract String hacerRuido();
}
Animal a = new Animal(); ❌ ERROR no se puede crear un objeto de una clase abstracta,✔ ya no puedes crear algo “incompleto”
👉 no puedes crear cosas genéricas

2. Forzar estructura
Todas las hijas deben tener:
hacerRuido()
*/