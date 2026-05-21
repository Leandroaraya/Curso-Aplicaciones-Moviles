class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    // 🔹 1. Constructor vacío
    public Cafetera() {
    }

    // 🔹 2. Constructor con parámetros
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    // 🔹 3. Getters y Setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // 🔹 4. llenarCafetera()
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera fue llenada.");
    }

    // 🔹 5. servirTaza(int tamaño)
    public void servirTaza(int tamanioTaza) {

        if (cantidadActual >= tamanioTaza) {
            cantidadActual -= tamanioTaza;
            System.out.println("La taza se llenó completamente.");
        } else {
            System.out.println("No alcanzó para llenar la taza.");
            System.out.println("Se sirvieron " + cantidadActual + " ml.");
            cantidadActual = 0;
        }
    }

    // 🔹 6. vaciarCafetera()
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera se vació.");
    }

    // 🔹 7. agregarCafe(int)
    public void agregarCafe(int cantidad) {

        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println("Se llenó al máximo la cafetera.");
        } else {
            cantidadActual += cantidad;
            System.out.println("Se agregó café.");
        }
    }
}