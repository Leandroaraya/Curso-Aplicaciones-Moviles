import java.util.Scanner;

public class CalculadoraFunciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Mostrar menú
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt();

        double resultado;

        // Estructura según (switch)
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = restar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;

            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    // FUNCIONES

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}