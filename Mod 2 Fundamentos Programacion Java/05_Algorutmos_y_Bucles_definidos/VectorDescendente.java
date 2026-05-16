public class VectorDescendente {

    public static void main(String[] args) {

        int[] vector = new int[20];

        // Llenar el vector
        for (int i = 0; i < 20; i++) {
            vector[i] = i + 1;
        }

        // Mostrar en orden descendente
        for (int i = 19; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        System.out.println(vector);

    }
}