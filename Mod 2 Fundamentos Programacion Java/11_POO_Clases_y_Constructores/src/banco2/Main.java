package banco2;

public class Main {
    public static void main(String[] args) {

        // 🔥 INSTANCIAR usando el constructor
        CuentaBancaria cuenta1 = new CuentaBancaria(144444, 1000.0, "Juano");

        // 🔥 MOSTRAR DATOS
        cuenta1.mostrarDatos();

           // 📄 Estado inicial
        System.out.println("=== ESTADO INICIAL ===");
        cuenta1.mostrarDatos();

        // 💰 Depositar
        cuenta1.depositar(500);

        // 💸 Retirar
        cuenta1.retirar(300);

        // 📄 Estado final
        System.out.println("=== ESTADO FINAL ===");
        cuenta1.mostrarDatos();

        System.out.println("=== " + cuenta1.getTitular() + " tiene un saldo de: " + cuenta1.getSaldo() + " ===");

        
    }
}