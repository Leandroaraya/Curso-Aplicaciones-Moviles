public class TiposDeDatos {

    public static void main(String[] args) {

        // =========================
        // 1. VARIABLES BÁSICAS
        // =========================

        int edad = 20;
        System.out.println("Edad: " + edad);

        String nombre = "Juan";
        System.out.println("Nombre: " + nombre);

        char caracter = 'A';
        System.out.println("Caracter: " + caracter);


        // =========================
        // 2. TIPOS ENTEROS
        // =========================

        byte numeroByte = 10;
        short numeroShort = 200;
        int numeroInt = 1000;
        long numeroLong = 100000L; // IMPORTANTE: usar L

        System.out.println("\n--- Tipos Enteros ---");
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);


        // =========================
        // 3. TIPOS DECIMALES
        // =========================

        float numeroFloat = 3.14f; // IMPORTANTE: usar f
        double numeroDouble = 3.141592;

        System.out.println("\n--- Tipos Decimales ---");
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);


        // =========================
        // 4. CHAR Y STRING
        // =========================

        // char: guarda UN SOLO caracter
        char letra = 'Z';

        // String: guarda texto (varios caracteres)
        String texto = "Hola mundo";

        System.out.println("\n--- Char y String ---");
        System.out.println("Char (una letra): " + letra);
        System.out.println("String (texto): " + texto);


        // =========================
        // 5. EJERCICIO PERSONAL
        // =========================

        char identificador = 'K'; // ejemplo RUT
        System.out.println("\nIdentificador: " + identificador);

        boolean estudiante = true;
        System.out.println("¿Es estudiante?: " + estudiante);

        String apellido = "Pérez";
        System.out.println("Nombre completo: " + nombre + " " + apellido);


        // =========================
        // 6. RESUMEN FINAL
        // =========================

        System.out.println("\n--- RESUMEN ---");
        System.out.println("int -> números enteros");
        System.out.println("double -> decimales más precisos");
        System.out.println("float -> decimales (menos precisión)");
        System.out.println("char -> un solo caracter");
        System.out.println("String -> texto");
        System.out.println("boolean -> true o false");
    }
}