class Circulo extends Poligono {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}