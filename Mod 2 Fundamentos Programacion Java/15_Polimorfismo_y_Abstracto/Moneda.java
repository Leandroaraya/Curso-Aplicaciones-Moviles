class Moneda extends FormaDePago {

    private String tipoMoneda;

    public Moneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago en moneda: " + tipoMoneda);
    }
}