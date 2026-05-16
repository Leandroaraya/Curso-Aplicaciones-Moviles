import java.util.Scanner;

public class CalculadoraVersion2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {

            // Mostrar menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción (indicar numero): ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                // Pedir números cada vez
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {

                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir por 0 ❌");
                        }
                        break;
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida ❌");
            }
        }

        scanner.close();
    }
}