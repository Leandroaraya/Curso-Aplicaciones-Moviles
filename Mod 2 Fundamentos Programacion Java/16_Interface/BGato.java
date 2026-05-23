class BGato implements BAnimal {

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El gato camina sigilosamente");
    }
}