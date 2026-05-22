class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String rut, String cargo) {
        super(nombre, rut); // 🔥 llama al constructor de Persona
        this.cargo = cargo;
    }

    public void mostrarEmpleado() {
        mostrarPersona();
        System.out.println("Cargo: " + cargo);
    }
}