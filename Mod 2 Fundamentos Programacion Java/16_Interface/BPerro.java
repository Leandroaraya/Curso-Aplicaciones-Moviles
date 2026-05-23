class BPerro implements BAnimal {

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre");
    }
}