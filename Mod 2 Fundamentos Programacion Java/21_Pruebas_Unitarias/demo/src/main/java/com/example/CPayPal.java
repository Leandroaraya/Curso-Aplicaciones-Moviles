package com.example;
class CPayPal implements CFormaPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal");
    }
}