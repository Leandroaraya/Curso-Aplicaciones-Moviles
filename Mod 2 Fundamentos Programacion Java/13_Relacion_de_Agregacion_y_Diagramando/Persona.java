class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String rut;
    private Perro perro; // puede ser null

    // 🔥 Constructor SIN perro (más flexible)
    public Persona(String nombre, String apellido, int edad, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.perro = null;
    }

    // 🔥 Constructor CON perro
    public Persona(String nombre, String apellido, int edad, String rut, Perro perro) {
        this(nombre, apellido, edad, rut);
        this.perro = perro;
    }

    // 🔥 Método de adopción (más realista)
    public void adoptarPerro(Perro perro) {
        if (this.perro == null) {
            this.perro = perro;
            System.out.println(nombre + " adoptó a " + perro.getNombre());
        } else {
            System.out.println(nombre + " ya tiene un perro.");
        }
    }

    // 🔥 Método para mostrar todo
    public void mostrarDatos() {
        System.out.println("👤 " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("RUT: " + rut);

        System.out.println("---- Mascota ----");
        if (perro != null) {
            perro.mostrarDatos();
        } else {
            System.out.println("No tiene perro adoptado");
        }
    }
}