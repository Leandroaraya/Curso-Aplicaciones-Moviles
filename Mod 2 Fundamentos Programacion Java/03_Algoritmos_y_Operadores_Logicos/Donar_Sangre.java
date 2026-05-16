import java.util.Scanner;

public class Donar_Sangre {

        // Donar sangre por edad y peso
		public static void main(String[] args) {
		  // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese su edad y peso
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();
        
        // Evaluar si puede donar sangre usando condiciones anidadas
        if (edad >= 18 && edad <= 65) {
            // Si está en el rango de edad, se verifica el peso
            if (peso >= 50) {
                System.out.println("Puedes donar sangre.");
            } else {
                System.out.println("No puedes donar sangre porque pesas menos de 50kg.");
            }
        } else {
            System.out.println("No puedes donar sangre porque tu edad no está en el rango permitido (18-65 años).");
        }
        
        // Cerrar el scanner
        scanner.close();

	}

}
