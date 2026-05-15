import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        // 1. Definir variables
        double nota1, nota2, nota3, promedio;

        // 2. Leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        nota3 = scanner.nextDouble();

        // 3. Procesamiento
        promedio = (nota1 + nota2 + nota3) / 3;

        // 4. Mostrar resultado
        System.out.println("El promedio es: " + promedio);

        // Extra (condición)
        if (promedio >= 4.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}