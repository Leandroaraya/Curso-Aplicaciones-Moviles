class Geometria {
    private FiguraGeometrica figura;

    public Geometria(FiguraGeometrica figura) {
        this.figura = figura;
    }

    public double calcularArea() {
        return figura.calcularArea();
    }
}