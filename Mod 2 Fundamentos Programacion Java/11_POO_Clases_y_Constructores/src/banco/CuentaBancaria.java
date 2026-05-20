package banco;

class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String titular;

    void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }

    void mostrarDatos() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public void setNumeroCuenta(int numero) {
    numeroCuenta = numero;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTitular(String t) {
        titular = t;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}