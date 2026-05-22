class Perro extends Animal {

    private String raza;

    // Constructor con super()
    public Perro(String nombre, double peso, String raza) {
        super(nombre, peso); // 🔥 constructor de Animal
        this.raza = raza;
    }

    public void mostrarPerro() {
        mostrarAnimal(); // reutiliza método del padre
        System.out.println("Raza: " + raza);
    }


    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public String emitirSonido() {
        return "Guau";
    }







}