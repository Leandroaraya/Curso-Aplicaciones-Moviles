import java.util.Scanner;

public class Precio_Frutas {

        
		public static void main(String[] args) {
		  // Crear un objeto Scanner para leer la entrada del usuario
      // PRECIO DE LAS FRUTAS
		
		  // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre de la fruta
        System.out.print("Ingresa el nombre de la fruta: ");
        String fruta = scanner.nextLine().toLowerCase(); // Convertimos la entrada a minúsculas para evitar errores de comparación

        // Determinar el precio según la fruta seleccionada
        switch (fruta) {
            case "platano":
                System.out.println("El precio del kg de plátano es 2.5 euros.");
                break;
            case "naranja":
                System.out.println("El precio del kg de naranja es 3 euros.");
                break;
            case "papaya":
                System.out.println("El precio del kg de papaya es 4 euros.");
                break;
            case "frutilla":
                System.out.println("El precio del kg de frutilla es 5 euros.");
                break;
            case "manzana":
                System.out.println("El precio del kg de manzana es 3.5 euros.");
                break;
            default:
                System.out.println("Fruta no disponible en la lista.");
        }

        // Cerrar el scanner
        scanner.close();


	}

}