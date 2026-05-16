import java.util.Scanner;

public class ConversionMoneda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir datos
        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();

        scanner.nextLine(); // limpiar buffer

        System.out.print("Ingrese la moneda (libras/dolares/yenes): ");
        String moneda = scanner.nextLine();

        // Llamar al método
        double resultado = convertirMoneda(euros, moneda);

        // Mostrar resultado
        if (resultado != -1) {
            System.out.println("Resultado: " + resultado + " " + moneda);
        }

        scanner.close();
    }

    // Método (función)
    public static double convertirMoneda(double euros, String moneda) {

        double resultado;

        if (moneda.equalsIgnoreCase("libras")) {
            resultado = euros * 0.86;

        } else if (moneda.equalsIgnoreCase("dolares")) {
            resultado = euros * 1.28611;

        } else if (moneda.equalsIgnoreCase("yenes")) {
            resultado = euros * 129.852;

        } else {
            System.out.println("Moneda no válida");
            return -1;
        }

        return resultado;
    }
}