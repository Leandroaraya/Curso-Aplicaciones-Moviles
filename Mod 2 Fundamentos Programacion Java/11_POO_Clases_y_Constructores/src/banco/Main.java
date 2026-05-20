package banco;
public class Main {
    public static void main(String[] args) {

        // Crear objeto
        Cuenta billetera1 = new Cuenta();
        CuentaBancaria billetera2 = new CuentaBancaria();

        // Asignar valores a Cuenta
        billetera1.numeroCuenta = 12345;
        billetera1.titular = "Juan Perez";
        billetera1.saldo = 1500.75;

        //Asignar valores a CuentaBancaria
        // ahora como son private no puedo acceder directamente a los atributos, necesito usar métodos para asignar valores o entrar directamente a 
        // CuentaBancaria y cambiar el acceso de los atributos a public, pero eso no es recomendable por buenas prácticas de encapsulamiento.

        //billetera2.numeroCuenta = 98765;
        //billetera2.saldoActual = 2500.75;
        //billetera2.titular = "Maria Lopez";
        billetera2.setNumeroCuenta(98888);
        billetera2.setTitular("Marina Lopeza");
        billetera2.depositar(2500.75);

        // Mostrar datos
        billetera1.mostrarDatos();
        billetera2.mostrarDatos();
    }
} 