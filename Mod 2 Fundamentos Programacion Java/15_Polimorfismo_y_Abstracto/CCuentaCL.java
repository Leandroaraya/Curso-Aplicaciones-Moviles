class CCuentaCL extends CCuentaDigital {

    public CCuentaCL(double saldo) {
        super(saldo);
    }

    @Override
    public boolean verificarFondos(double monto) {
        return saldo >= monto;
    }
}