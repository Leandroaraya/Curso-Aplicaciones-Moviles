import java.util.Scanner;

public class Calculadora_basica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir números
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Operaciones básicas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        int resto = num1 % num2;

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto: " + resto);

        // Verificar si num1 es par o impar
        if (num1 % 2 == 0) {
            System.out.println("El número " + num1 + " es PAR");
        } else {
            System.out.println("El número " + num1 + " es IMPAR");
        }

        // Verificar si num2 es par o impar
        if (num2 % 2 == 0) {
            System.out.println("El número " + num2 + " es PAR");
        } else {
            System.out.println("El número " + num2 + " es IMPAR");
        }
    }
} 
