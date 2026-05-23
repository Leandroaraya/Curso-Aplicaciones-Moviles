/*
INTERFACE
es una especie de plantilla para la construccion de clases.
Define un protocolo de comportamiento que las clases que implementen la interfaz deben seguir.
la interfaz no puede definir atributos, salvo que sean estaticos o constantes.

es similar a una clase abstracta.
“Si usas esto, estás obligado a implementar estos métodos”
abstract->  ✔ algunas cosas ya están hechas 
            ✔ otras son obligatorias
interface-> X nada está implementado (en lo básico)
            ✔ todo es obligatorio
            ✔ interfaz es más estricta

-------------------------------------------------------------
interface Animal {
    String hacerRuido();
}

*solo defines el método.
*luego, cualquier clase que implemente la interfaz, debe proporcionar una implementación concreta de ese método.

class Perro implements Animal {

    @Override
    public String hacerRuido() {
        return "Guau";
    }
}
--------------------------------------------------------------

abstract class Animal {
    public abstract String hacerRuido();
}

abstract class Animal {

    public void dormir() {
        System.out.println("Durmiendo...");
    }

    public abstract String hacerRuido();
}

✔ algunas cosas ya están hechas
✔ otras son obligatorias como los métodos abstractos

class Perro extends Animal  (una clase solo puede heredar de una clase abstracta)

class Perro implements Animal, Mascota, Serializable (una clase puede implementar varias interfaces)


*/