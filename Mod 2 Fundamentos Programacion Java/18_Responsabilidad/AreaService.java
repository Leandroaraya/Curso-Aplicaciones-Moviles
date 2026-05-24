class AreaService {
    public double sumarArea(Poligono p1, Poligono p2) {
        return p1.calcularArea() + p2.calcularArea();
    }

    public double multiplicarArea(Poligono p1, Poligono p2) {
        return p1.calcularArea() * p2.calcularArea();
    }
}