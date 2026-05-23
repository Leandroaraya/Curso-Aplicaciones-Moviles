class CEfectivo implements CFormaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " en efectivo");
    }
}