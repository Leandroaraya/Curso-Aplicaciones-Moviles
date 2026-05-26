package com.example;
class CEfectivo implements CFormaPago {

    private double ultimoPago; // atributo que guarda el monto

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero");
        }
        this.ultimoPago = monto;
    }

    public double getUltimoPago() {
        return ultimoPago;
    }
}