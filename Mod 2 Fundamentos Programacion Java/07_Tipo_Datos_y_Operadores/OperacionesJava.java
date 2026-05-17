import java.util.Scanner;

public class OperacionesJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // 1. OPERACIONES ARITMÉTICAS
        // =========================

        int a = 10;
        int b = 5;

        System.out.println("--- Operaciones Aritméticas ---");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));


        // =========================
        // 2. INCREMENTO
        // =========================

        int numero = 7;
        numero++; // incremento

        System.out.println("\n--- Incremento ---");
        System.out.println("Número incrementado: " + numero);


        // =========================
        // 3. OPERACIONES LÓGICAS
        // =========================

        boolean condicion1 = true;
        boolean condicion2 = false;

        System.out.println("\n--- Operaciones Lógicas ---");
        System.out.println("AND (&&): " + (condicion1 && condicion2));
        System.out.println("OR (||): " + (condicion1 || condicion2));


        // =========================
        // 4. SUMA CON USUARIO
        // =========================

        System.out.print("\nIngrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + (num1 + num2));


        // =========================
        // 5. CUADRADO DE UN NÚMERO
        // =========================

        System.out.print("\nIngrese un número para elevar al cuadrado: ");
        int num = scanner.nextInt();

        int cuadrado = num * num;
        System.out.println("Cuadrado: " + cuadrado);


        // =========================
        // 6. CONCATENAR PALABRAS
        // =========================
//“Después de un nextInt() o nextDouble(), siempre hago un nextLine() de limpieza” no ocurre viseversa
        scanner.nextLine(); // limpiar buffer

        System.out.print("\nIngrese una palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingrese otra palabra: ");
        String palabra2 = scanner.nextLine();

        String frase = palabra1 + " " + palabra2;
        System.out.println("Frase: " + frase);


        // =========================
        // 7. COMPARAR NÚMEROS
        // =========================

        System.out.print("\nIngrese un número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int n2 = scanner.nextInt();

        boolean iguales = (n1 == n2);
        System.out.println("¿Son iguales?: " + iguales);


        scanner.close();
    }
}