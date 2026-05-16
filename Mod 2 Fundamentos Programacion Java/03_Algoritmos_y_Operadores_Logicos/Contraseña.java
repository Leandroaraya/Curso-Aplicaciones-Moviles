import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {
        
        
        // CONTRASEÑA
		
		// Almacenar la contraseña en una variable
        String contraseña = "contra";  // La contraseña predefinida (puedes cambiarla por otra)

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la contraseña
        System.out.print("Ingresa la contraseña: ");
        String entradaUsuario = scanner.nextLine();
        
    // Comparar las dos cadenas importando mayúsculas y minúsculas
        if (contraseña.equals(entradaUsuario)) {
        
        // Comparar las dos cadenas sin importar mayúsculas y minúsculas
       // if (contraseña.equalsIgnoreCase(entradaUsuario)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
        
        // Cerrar el scanner
        scanner.close();
	}

}
