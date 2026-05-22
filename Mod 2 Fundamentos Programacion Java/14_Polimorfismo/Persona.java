class Persona {
    //protected significa:✔ accesible dentro de la clase y ✔ accesible en clases hijas (Empleado, Cliente)
    protected String nombre;
    protected String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
    }
}