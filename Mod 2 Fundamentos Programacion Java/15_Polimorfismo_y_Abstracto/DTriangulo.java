class DTriangulo extends DFigura {

    private double base;
    private double altura;

    public DTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
