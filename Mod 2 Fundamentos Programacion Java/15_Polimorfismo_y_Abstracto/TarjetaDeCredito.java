class TarjetaDeCredito extends FormaDePago {

    private int cuotas;

    public TarjetaDeCredito(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con tarjeta en " + cuotas + " cuotas");
    }
}