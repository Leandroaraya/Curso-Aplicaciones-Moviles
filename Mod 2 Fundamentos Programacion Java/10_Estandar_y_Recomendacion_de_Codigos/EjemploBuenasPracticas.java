import java.util.Scanner;

/*
 * Clase: EjemploBuenasPracticas
 * Descripción: Programa que solicita nombre y edad al usuario
 * y luego muestra los datos por pantalla.
 */
public class EjemploBuenasPracticas {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables (camelCase)
        String nombreUsuario;
        int edadUsuario;

        // Solicitar datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        edadUsuario = scanner.nextInt();

        // Mostrar datos por pantalla
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Edad: " + edadUsuario);

        // Cerrar scanner
        scanner.close();
    }
}