import java.util.Scanner;

public class CadenasString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra: ");
        String texto = scanner.nextLine();

        // 1. Validar longitud
        if (texto.length() == 8) {
            System.out.println("CORRECTO");
            System.out.println("En mayúsculas: " + texto.toUpperCase());
        } else {
            System.out.println("INCORRECTO");
            System.out.println("INCORRECTO".concat("---").concat(" ").concat(texto.toUpperCase()));

            System.out.println("En minúsculas: " + texto.toLowerCase());
        }

        // 2. Extraer cuarta y quinta letra
        if (texto.length() >= 5) {
            String sub = texto.substring(3, 5);
            System.out.println("Cuarta y quinta letra: " + sub);
        } else {
            System.out.println("No tiene suficientes caracteres para substring.");
        }

        // 3. Contar vocales
        int contadorVocales = 0;
        String textoMinuscula = texto.toLowerCase();
/*
        for (int i = 0; i < textoMinuscula.length(); i++) {
            char c = textoMinuscula.charAt(i); // charAt() devuelve el carácter en la posición especificada para tomar cada letra

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
 

        }
*/        // Otra forma de contar vocales usando for mejorado ojo con el for no recorre cadena texto,por eso se pasa a arreglo
        for (char c : textoMinuscula.toLowerCase().toCharArray()) { // toCharArray() convierte la cadena en un array de caracteres para recorrer cada letra
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Cantidad de vocales: " + contadorVocales);

        scanner.close();
    }
}