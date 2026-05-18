import java.util.Scanner;

public class DoWhileSuma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un límite positivo: ");
        int limite = scanner.nextInt();

        int suma = 0;

        do {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            suma += num;

            System.out.println("Suma actual: " + suma);

        } while (suma <= limite);

        System.out.println("Se superó el límite.");
        scanner.close();
    }
}
