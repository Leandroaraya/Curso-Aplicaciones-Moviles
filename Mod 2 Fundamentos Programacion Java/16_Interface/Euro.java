class Euro implements Moneda {

    @Override
    public String getSimbolo() {
        return "EUR";
    }

    @Override
    public double getFactorConversion() {
        return 1100; // 1 EUR = 1100 CLP
    }

    @Override
    public double convertir(double monto, Moneda otraMoneda) {

        double enCLP = monto * this.getFactorConversion();
        return enCLP / otraMoneda.getFactorConversion();
    }
}