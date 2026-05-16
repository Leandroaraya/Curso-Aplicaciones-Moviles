import java.util.Scanner;

public class SumaVector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        // 1. Pedir tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();

        // 2. Crear vector
        int[] vector = new int[N];

        // 3. Llenar vector y sumar
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            vector[i] = scanner.nextInt();

            suma += vector[i]; // acumulamos
        }

        // 4. Mostrar resultado
        System.out.println("La suma total de sus elementos es: " + suma);

        scanner.close();
    }
}