public class Main {
    public static void main(String[] args) {

        FiguraGeometrica cuadrado = new Cuadrado(4);
        FiguraGeometrica circulo = new Circulo(1);

        Geometria geo1 = new Geometria(cuadrado);
        Geometria geo2 = new Geometria(circulo);

        System.out.println(geo1.calcularArea());
        System.out.println(geo2.calcularArea());
    }
}