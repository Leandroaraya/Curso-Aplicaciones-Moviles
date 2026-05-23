class CLP implements Moneda {

    @Override
    public String getSimbolo() {
        return "CLP";
    }

    @Override
    public double getFactorConversion() {
        return 1;
    }

    @Override
    public double convertir(double monto, Moneda otraMoneda) {
        double enCLP = monto * getFactorConversion();
        return enCLP / otraMoneda.getFactorConversion();
    }
}