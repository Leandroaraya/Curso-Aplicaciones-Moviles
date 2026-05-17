import java.util.Scanner;

public class CondicionalesCompletos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // 1. EDAD (IF - ELSE IF - ELSE)
        // =========================

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad > 18) {
            System.out.println("Es mayor de edad. Edad: " + edad);
        } else if (edad == 18) {
            System.out.println("Tiene 18 actualmente.");
        } else {
            System.out.println("Es menor de edad.");
        }


        // =========================
        // 2. NÚMERO POSITIVO / NEGATIVO / CERO
        // =========================

        System.out.print("\nIngrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }


        // =========================
        // 3. PAR O IMPAR (con %)
        // =========================

        System.out.print("\nIngrese otro número: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("El número es cero.");
        } else if (num % 2 == 0) {
            System.out.println("El número es PAR.");
        } else {
            System.out.println("El número es IMPAR.");
        }


        // =========================
        // 4. SWITCH MES + ESTACIÓN
        // =========================

        System.out.print("\nIngrese un número de mes (1-12): ");
        int mes = scanner.nextInt();

        switch (mes) {

            case 12:
            case 1:
            case 2:
                System.out.println("Verano ☀️");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Otoño 🍂");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Invierno ❄️");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Primavera 🌸");
                break;

            default:
                System.out.println("Mes inválido.");
        }

        scanner.close();
    }
}