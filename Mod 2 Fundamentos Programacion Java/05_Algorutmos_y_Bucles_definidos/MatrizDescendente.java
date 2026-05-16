public class MatrizDescendente {

    public static void main(String[] args) {

        int[][] matriz = new int[4][5];

        int valor = 1;

        // Llenar la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Mostrar en orden descendente
        for (int i = 3; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}