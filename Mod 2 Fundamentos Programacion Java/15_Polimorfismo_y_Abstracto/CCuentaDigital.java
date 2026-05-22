abstract class CCuentaDigital {

    protected double saldo;

    public CCuentaDigital(double saldo) {
        this.saldo = saldo;
    }
    //un método abstracto OBLIGA a las clases hijas a implementarlo.
    public abstract boolean verificarFondos(double monto);
    //“cualquier clase que herede de mí DEBE tener este método”
}   