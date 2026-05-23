class BVaca implements BAnimal {

    @Override
    public void hacerRuido() {
        System.out.println("Muuu");
    }

    @Override
    public void comer() {
        System.out.println("La vaca está comiendo");
    }

    @Override
    public void moverse() {
        System.out.println("La vaca camina leeentamente");
    }
}