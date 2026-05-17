import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {

        // 1. Definir el arreglo
        String[] dias = new String[7];

        // 7. Invocar el procedimiento
        cargarDias(dias);
    }

    // 2. Definir el procedimiento
    public static void cargarDias(String[] dias) {

        Scanner scanner = new Scanner(System.in);

        // 3. Recorrer para cargar los días
        for (int i = 0; i < dias.length; i++) {
            System.out.print("Ingrese un día de la semana: ");
            dias[i] = scanner.nextLine(); // 4. Leer dato
        }

        // 5. Mostrar los días
        System.out.println("\nDías ingresados:");

        // 6. Recorrer e imprimir
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        scanner.close();
    }
}