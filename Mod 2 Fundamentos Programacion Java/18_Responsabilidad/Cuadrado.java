class Cuadrado extends Poligono {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}