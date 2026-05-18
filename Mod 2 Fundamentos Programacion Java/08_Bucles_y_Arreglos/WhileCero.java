import java.util.Scanner;

public class WhileCero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero != 0) {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}