package banco2;

class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String titular;

    // 🔥 CONSTRUCTOR Vacio : 
    public CuentaBancaria() {
    }
    // este vacio solo sirve para dar flexibilidad a la hora de crear objetos, si queremos crear un objeto sin tener que pasarle datos al constructor, 
    // pero si queremos crear un objeto con datos desde el inicio, entonces usamos el constructor con parámetros(forma vista en banco).

    // 🔥 CONSTRUCTOR
    public CuentaBancaria(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

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