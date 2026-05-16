import java.util.Scanner;

public class Precio_Entrada {

	public static void main(String[] args) {
        
        
          // PRECIO ENTRADA POR EDAD    
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();  // La edad se almacena en la variable 'edad'
        
        // Calcular el precio según la edad del cliente
        if (edad < 4) {
            System.out.println("La entrada es gratis.");
        } else if (edad >= 4 && edad <= 18) {
            System.out.println("El precio de la entrada es 5 euros.");
        } else {
            System.out.println("El precio de la entrada es 10 euros.");
        }
        
        // Cerrar el scanner
        scanner.close();
	}

}
