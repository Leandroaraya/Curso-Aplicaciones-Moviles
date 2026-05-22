class Animal {
    protected String nombre;
    protected double peso;

    // Constructor
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void mostrarAnimal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso);
    }
    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

    public String emitirSonido() {
        return "Sonido genérico de animal";
    }




}