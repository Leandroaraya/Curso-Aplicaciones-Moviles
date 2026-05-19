import java.util.Scanner;

public class FuncionesMath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===============================
        // 1. INGRESO DE DATOS
        // ===============================
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        // ===============================
        // 2. CÁLCULO DEL VOLUMEN
        // Fórmula: V = (4/3) * PI * r^3
        // ===============================
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("\nVolumen de la esfera: " + volumen);

        // ===============================
        // 3. CEIL, FLOOR, ROUND
        // ===============================
        System.out.println("\n--- Redondeos ---");
        System.out.println("Ceil (redondea hacia arriba): " + Math.ceil(volumen));
        System.out.println("Floor (redondea hacia abajo): " + Math.floor(volumen));
        System.out.println("Round (redondeo normal): " + Math.round(volumen));

        // ===============================
        // 4. POW, SQRT, CBRT
        // ===============================
        System.out.println("\n--- Potencias y raíces ---");
        System.out.println("Radio al cuadrado: " + Math.pow(radio, 2));
        System.out.println("Raíz cuadrada del radio: " + Math.sqrt(radio));
        System.out.println("Raíz cúbica del radio: " + Math.cbrt(radio));

        // ===============================
        // 5. RANDOM
        // Genera número entre 0 y 9
        // ===============================
        int aleatorio = (int) (Math.random() * 10);
        System.out.println("\nNúmero aleatorio (0-9): " + aleatorio);
      // Genera número entre 0 y 1
        // ===============================
        double aleatorioDecimal = Math.random();
        System.out.println("Número aleatorio decimal (0.0-1.0): " + aleatorioDecimal);
        // ===============================
        // 6. MIN, MAX, ABS
        // ===============================
        System.out.println("\n--- Comparaciones ---");

        System.out.print("Ingrese otro número para comparar: ");
        double num2 = scanner.nextDouble();

        System.out.println("Número menor: " + Math.min(radio, num2));
        System.out.println("Número mayor: " + Math.max(radio, num2));
        System.out.println("Valor absoluto de la diferencia: " + Math.abs(radio - num2));

        scanner.close();
    }
}