class Gato extends Animal {

    private String raza;

    // Constructor con super()
    public Gato(String nombre, double peso, String raza) {
        super(nombre, peso); // 🔥 constructor de Animal
        this.raza = raza;
    }

    public void mostrarGato() {
        mostrarAnimal(); // reutiliza método del padre
        System.out.println("Raza: " + raza);
    }

    @Override    //se deja esto para que comer () y dormir() se comporten igual que en la clase padre, pero se puede modificar si se desea un comportamiento diferente para los gatos.
    public void comer() {
        super.comer();
        System.out.println("Comiendo miau miau");
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public String emitirSonido() {
        return "Miau";
    }
}