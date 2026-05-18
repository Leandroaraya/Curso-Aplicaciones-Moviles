import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[7];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextDouble();
        }

        double mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
