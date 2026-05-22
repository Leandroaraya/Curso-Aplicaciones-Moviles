class Clienteee extends Persona {
    private String tipo; // titular o adjunto

    public Clienteee(String nombre, String rut, String tipo) {
        super(nombre, rut);
        this.tipo = tipo;
    }

    public void mostrarCliente() {
        mostrarPersona();
        System.out.println("Tipo: " + tipo);
    }
}