class Dolar implements Moneda {

    @Override
    public String getSimbolo() {
        return "USD";
    }

    @Override
    public double getFactorConversion() {
        return 1000; // 1 USD = 1000 CLP
    }

    @Override
    public double convertir(double monto, Moneda otraMoneda) {

        // paso 1: pasar a CLP
        double enCLP = monto * this.getFactorConversion();

        // paso 2: pasar a la otra moneda
        return enCLP / otraMoneda.getFactorConversion();
    }
}