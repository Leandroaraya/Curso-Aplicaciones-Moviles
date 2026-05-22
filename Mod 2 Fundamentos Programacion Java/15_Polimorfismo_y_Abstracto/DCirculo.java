class DCirculo extends DFigura {

    private double radio;

    public DCirculo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}