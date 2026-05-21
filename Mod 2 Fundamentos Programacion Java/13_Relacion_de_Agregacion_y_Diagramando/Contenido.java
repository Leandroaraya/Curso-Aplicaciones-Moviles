/*
Agregacion y Composicion


PREGUNTA CLAVE

“¿El objeto externo puede existir sin el principal?”

✔ Sí → Agregación
❌ No → Composición

“Si el objeto puede vivir solo → agregación”

AGREGACIÓN (tu caso original correcto)
Cliente c = new Cliente(id, nombre, cuentaExistente); // Cliente tiene una cuenta, pero la cuenta puede existir sin el cliente

COMPOSICIÓN 
class Cliente {

    private CuentaBancaria cuenta;

    public Cliente() {
        this.cuenta = new CuentaBancaria();
    }
};                                                  // y dentro de Cliente se esta creando la cuenta con: this.cuenta = new CuentaBancaria();

*/