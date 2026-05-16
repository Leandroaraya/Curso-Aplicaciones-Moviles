import java.util.Scanner;

public class MaxMinPromedio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidad;
        double num, suma = 0, promedio;
        double minimo = 0, maximo = 0;
        // Para guardar los números ingresados

        String numerosIngresados = "";

        // Pedir cantidad
        System.out.print("¿Cuántos números desea ingresar?: ");
        cantidad = scanner.nextInt();

        // Validar que sea mayor a 0
        if (cantidad > 0) {

            for (int i = 1; i <= cantidad; i++) {

                System.out.print("Ingrese número " + i + ": ");
                num = scanner.nextDouble();

                // Guardar número
                numerosIngresados += num + " ";

                // Primera vez: inicializar min y max
                if (i == 1) {
                    minimo = num;
                    maximo = num;
                }

                // Comparar para mínimo
                if (num < minimo) {
                    minimo = num;
                }

                // Comparar para máximo
                if (num > maximo) {
                    maximo = num;
                }

                // Sumar
                suma += num;
            }

            // Calcular promedio
            promedio = suma / cantidad;

            // Mostrar resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Números ingresados: " + numerosIngresados);

            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Promedio: " + promedio);

        } else {
            System.out.println("La cantidad debe ser mayor a 0 ❌");
        }

        scanner.close();
    }
}