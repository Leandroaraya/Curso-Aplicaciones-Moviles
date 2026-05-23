class CTarjetaCredito implements CFormaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con Tarjeta de Crédito");
    }
}