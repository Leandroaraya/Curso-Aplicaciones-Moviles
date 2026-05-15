import java.util.Scanner;

public class Probando_datos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingresa nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingresa nota 3: ");
        double nota3 = scanner.nextDouble();

        // Llamar método
        saludar(nombre);

        // Calcular promedio
        double promedio = calcularPromedio(nota1, nota2, nota3);

        // Mostrar resultado
        System.out.println("Tu promedio es: " + promedio);

        // Condición
        if (promedio >= 4.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Otra condición con edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Ciclo
        System.out.println("Mostrando números del 1 al 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    // Método para saludar
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // Método para calcular promedio
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
