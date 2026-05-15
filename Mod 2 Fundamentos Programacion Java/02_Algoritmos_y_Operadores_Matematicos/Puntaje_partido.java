import java.util.Scanner;

public class Puntaje_partido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese partidos ganados: ");
        int pg = scanner.nextInt();

        System.out.print("Ingrese partidos empatados: ");
        int pe = scanner.nextInt();

        System.out.print("Ingrese partidos perdidos: ");
        int pp = scanner.nextInt();

        // Procesamiento
        int ppg = pg * 3;
        int ppe = pe * 1;
        int ptotal = ppg + ppe;

        // Salida
        System.out.println("Puntaje total: " + ptotal);


        if (ptotal > 20) {
            System.out.println("Buen rendimiento");
        } else {
            System.out.println("Puede mejorar");
        }


        // Evaluación de expresiones lógicas

        boolean resultado1 = (15 % 2 == 1);
        boolean resultado2 = (10 * 10) <= Math.pow(10, 2);

        // Mostrar resultados
        System.out.println("15 % 2 == 1 -> " + resultado1);
        System.out.println("(10 * 10) <= (10^2) -> " + resultado2);


    }
}