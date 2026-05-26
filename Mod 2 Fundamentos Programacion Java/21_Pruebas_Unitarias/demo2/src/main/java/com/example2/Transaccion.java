package com.example2;


public class Transaccion {
    private double monto;
    private String tipo; // "deposito" o "retiro"

    public Transaccion(double monto, String tipo) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero");
        }
        this.monto = monto;
        this.tipo = tipo;
    }

    public double getMonto() { return monto; }
    public String getTipo() { return tipo; }
}