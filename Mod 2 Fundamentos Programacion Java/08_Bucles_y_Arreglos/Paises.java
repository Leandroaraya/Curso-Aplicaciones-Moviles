import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] paises = new String[5];

        for (int i = 0; i < paises.length; i++) {
            System.out.print("Ingrese un país: ");
            paises[i] = scanner.nextLine();
          
        }
        // for each para leer el arreglo
        for (String pais : paises) {
            System.out.print(pais + " ");
        }
        System.out.println("----------------");   
        for (int i = 0; i < paises.length; i++) {
            System.out.print(paises[i] + " ");
        }
        System.out.println("----------------");

        System.out.println("\nPaíses ingresados:");
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }

        scanner.close();
    }
}