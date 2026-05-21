public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = Cliente.crearCliente();

        cliente1.consultarDatos();

        // Depositar
        cliente1.getCuenta().depositar(500);

        // Retirar
        cliente1.getCuenta().retirar(200);

        System.out.println("Después de operaciones:");
        cliente1.consultarDatos();


        System.out.println("----------------------");
        System.out.println("----------------------");


        // Crear perros
        Perro perro1 = new Perro("Firulais", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Max", "Poodle", 2, "Pequeño");

        // Crear personas (sin perro)
        Persona persona1 = new Persona("Juan", "Perez", 25, "12345678-9");
        Persona persona2 = new Persona("Ana", "Gomez", 30, "98765432-1", perro2); // Ana ya tiene un perro al crear su persona
        System.out.println("\n--- DATOS Antes ---");

        persona1.mostrarDatos();
        System.out.println("----------------------");
        persona2.mostrarDatos();
        System.out.println("----------------------");


        // Adoptar perros
        persona1.adoptarPerro(perro1);
        //persona2.adoptarPerro(perro2); Ana ya tiene un perro, no puede adoptar otro

        System.out.println("\n--- DATOS Despues ---");

        persona1.mostrarDatos();
        System.out.println("----------------------");
        persona2.mostrarDatos();
        System.out.println("----------------------");
    }
}