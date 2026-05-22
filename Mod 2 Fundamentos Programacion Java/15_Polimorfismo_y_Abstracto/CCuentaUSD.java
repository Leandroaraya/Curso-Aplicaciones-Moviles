class CCuentaUSD extends CCuentaDigital {

    private double tasaCambio = 1000;

    public CCuentaUSD(double saldo) {
        super(saldo);
    }

    @Override
    public boolean verificarFondos(double montoUSD) {
        double montoCLP = montoUSD * tasaCambio;
        return saldo >= montoCLP;
    }
}