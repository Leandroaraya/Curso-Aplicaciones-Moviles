public class Main {
    public static void main(String[] args) {
        /*
        Empleado emp = new Empleado("Juan", "12345678-9", "Electricista");
        Clienteee cli = new Clienteee("Ana", "98765432-1", "Titular");
        Persona p1 = emp; // Polimorfismo por herencia
        Persona p2 = cli; // Polimorfismo por herencia

        System.out.println("=== EMPLEADO ===");
        emp.mostrarEmpleado();

        System.out.println("\n=== CLIENTE ===");
        cli.mostrarCliente();

        System.out.println("\n=== POLIMORFISMO Personas ===");
        p1.mostrarPersona(); // Llama al método de Persona, pero muestra datos de Empleado
        p2.mostrarPersona(); // Llama al método de Persona, pero muestra datos de Cliente
         */

        CuentaCorriente cc = new CuentaCorriente(123, 1000, "Juan Pérez", 500);

        cc.depositarCLP(200);
        cc.retirarCLP(100);

        cc.mostrarCuentaCorriente();


        System.out.println("\n===ANIMAL y PERRO ===");
        Perro perro1 = new Perro("Firulais", 12.5, "Labrador");

        perro1.mostrarPerro();

        System.out.println("\n==================================");

        Cuenta cuenta = new Cuenta(111111,100000,"Leandro");
        
        System.out.println("=== ===");
        cuenta.mostrarSaldo();
        cuenta.depositarCLP(5000);   // CLP directo
        System.out.println("=== ===");
        cuenta.mostrarSaldo();
        cuenta.retirarCLP(2000);
        System.out.println("=== ===");
        cuenta.mostrarSaldo();
        cuenta.depositarUSD(50);     // 5 USD → CLP
        System.out.println("=== ===");
        cuenta.mostrarSaldo();
        cuenta.retirarUSD(20);       // 2 USD → CLP

        System.out.println("=== ===");
        cuenta.mostrarSaldo();


        System.out.println("\n==================================");

        Animal a1 = new Perro("gino", 10, "Beagle");
        Animal a2 = new Gato("Mishi", 5, "Siamés");

        System.out.println("=== ANIMAL 1 ===");
        a1.comer();
        a1.dormir();
        System.out.println(a1.emitirSonido());

        System.out.println("\n=== ANIMAL 2 ===");
        a2.comer();
        a2.dormir();
        System.out.println(a2.emitirSonido());

    }
}   