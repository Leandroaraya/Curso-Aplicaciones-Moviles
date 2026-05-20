package banco;
class Cuenta {
    int numeroCuenta;
    String titular;
    double saldo;

    void mostrarDatos() {
    System.out.println("Numero: " + numeroCuenta);
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: " + saldo);
    }
}

