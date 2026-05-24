public class Main {
    public static void main(String[] args) {

        Poligono cuadrado = new Cuadrado(4);
        Poligono circulo = new Circulo(3);
        Poligono triangulo = new Triangulo(4, 5);       
        AreaService service = new AreaService();
        double suma = service.sumarArea(cuadrado, circulo);
        double suma2= service.sumarArea(cuadrado, triangulo);
        Printer printer = new Printer();
        printer.imprimirResultado(suma);
        printer.imprimirResultado(suma2);

        //Acceder a las areas individuales
        double areaCuadrado = cuadrado.calcularArea();
        double areaCirculo = circulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();
        printer.imprimirResultado(areaCuadrado);
        printer.imprimirResultado(areaCirculo); 
        printer.imprimirResultado(areaTriangulo);
        
    }
}