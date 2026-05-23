interface Moneda {
    //INTERFAZ Moneda: define el “contrato”
    String getSimbolo();
    double getFactorConversion();

    double convertir(double monto, Moneda otraMoneda);
}
/*
IDEA CLAVE

cada moneda sabe:  *su símbolo ($, €, etc.)
                   *cuánto vale respecto a una base (ej: CLP)
                   *cómo convertirse a otra moneda
*/