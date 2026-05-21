import java.util.Scanner;

class Cliente {
    private long id;
    private String nombre;
    private CuentaBancaria cuenta;

    // 🔹 Constructor
    public Cliente(long id, String nombre, CuentaBancaria cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    // 🔹 Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    // 🔹 Crear cliente pidiendo datos
    public static Cliente crearCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese ID: ");
        long id = sc.nextLong();
        sc.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese número de cuenta: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese titular de la cuenta: ");
        String titular = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numero, saldo, titular);

        return new Cliente(id, nombre, cuenta);
    }

    // 🔹 Mostrar datos del cliente y cuenta
    public void consultarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        cuenta.mostrarDatos(); // reutilizamos método
    }
}