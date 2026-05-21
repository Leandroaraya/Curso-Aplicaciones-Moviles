import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    CuentaBancaria cuenta1 = new CuentaBancaria(123, 1000, "Juan");

    cuenta1.mostrarDatos();

    // 💰 ingresar dinero
    cuenta1.depositar(500);
     System.out.println("-----------------------------");   
    // 📄 mostrar nuevamente
    cuenta1.mostrarDatos();
    System.out.println("-----------------------------");   

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese numero de cuenta: ");
    int numero = sc.nextInt();

    System.out.print("Ingrese saldo inicial: ");
    double saldo = sc.nextDouble();
    sc.nextLine(); // limpiar buffer

    System.out.print("Ingrese titular: ");
    String titular = sc.nextLine();

    // 👉 crear objeto con datos del usuario
    CuentaBancaria cuenta2 = new CuentaBancaria(numero, saldo, titular);

    cuenta2.mostrarDatos();
    System.out.println("-----------------------------");
    System.out.println("Titular actual: " + cuenta2.getTitular());

    cuenta2.setTitular("lleeaann");

    System.out.println("Titular modificado: " + cuenta2.getTitular());

    //cuenta1.saldo = 500; // Error: saldo tiene acceso privado, no se puede acceder directamente desde fuera de la clase. PUBLIC ARROJARA EL SALDO
                        // Si es protected, se puede acceder desde el mismo paquete, pero no desde otro paquete, a menos que sea una clase hija.


    Cafetera cafetera = new Cafetera(1000, 500);

    cafetera.llenarCafetera();

    cafetera.servirTaza(200);

    cafetera.servirTaza(900); // caso donde no alcanza

    cafetera.agregarCafe(300);

    cafetera.vaciarCafetera();


    }
} 