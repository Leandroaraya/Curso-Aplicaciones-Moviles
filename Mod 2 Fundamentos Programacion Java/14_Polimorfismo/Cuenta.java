class Cuenta {

    protected int numeroCuenta;
    protected double saldo;
    protected String titular;
    
    private double tasaCambioUSD = 1000;
    // Constructor vacío
    public Cuenta() {
    }

    // Constructor principal
    public Cuenta(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // 🔥 MÉTODOS LISTOS PARA OVERRIDE
    public void depositarCLP(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }
    public void depositarUSD(double montoUSD) {
        if (montoUSD > 0) {
            saldo += montoUSD * tasaCambioUSD;
        }
    }

    public void retirarCLP(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }
    public void retirarUSD(double montoUSD) {
    if (montoUSD > 0 && saldo >= montoUSD * tasaCambioUSD) {
        saldo -= montoUSD * tasaCambioUSD;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void mostrarDatos() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    // getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}