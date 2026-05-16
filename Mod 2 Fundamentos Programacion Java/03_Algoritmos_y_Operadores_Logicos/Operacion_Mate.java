import java.util.Scanner;

public class Operacion_Mate {

        
		public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

	        // Pedir los dos números enteros positivos
	        System.out.print("Ingresa el primer número entero positivo: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Ingresa el segundo número entero positivo: ");
	        int num2 = scanner.nextInt();

	        // Mostrar el menú de opciones
	        System.out.println("\nSelecciona una operación:");
	        System.out.println("1.- Sumar");
	        System.out.println("2.- Restar");
	        System.out.println("3.- Multiplicar");
	        System.out.println("4.- Dividir");

	        // Leer la opción del usuario
	        System.out.print("Opción: ");
	        int opcion = scanner.nextInt();

	        // Evaluar la opción con switch-case
	        switch (opcion) {
	            case 1:
	                System.out.println("Resultado de la suma: " + (num1 + num2));
	                break;
	            case 2:
	                System.out.println("Resultado de la resta: " + (num1 - num2));
	                break;
	            case 3:
	                System.out.println("Resultado de la multiplicación: " + (num1 * num2));
	                break;
	            case 4:
	                if (num2 != 0) {
	                    System.out.println("Resultado de la división: " + (num1 / num2));
	                } else {
	                    System.out.println("Error: No se puede dividir por cero.");
	                }
	                break;
	            default:
	                System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
	        }

	        // Cerrar el scanner
	        scanner.close();



	}

}