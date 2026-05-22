class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    // 🔥 Constructor usando super()
    public CuentaCorriente(int numeroCuenta, double saldo, String titular, double limiteSobregiro) {
        super(numeroCuenta, saldo, titular); // 👈 reutiliza constructor padre
        this.limiteSobregiro = limiteSobregiro;
    }

    public void mostrarCuentaCorriente() {
        mostrarDatos(); // método heredado
        System.out.println("Límite sobregiro: " + limiteSobregiro);
    }
}