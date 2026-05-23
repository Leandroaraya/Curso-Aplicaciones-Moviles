public class Main {
    public static void main(String[] args) {

        Moneda dolar = new Dolar();
        Moneda euro = new Euro();
        Moneda clp = new CLP();

        double resultado = dolar.convertir(10, euro);
        double resultado2 = dolar.convertir(10, clp);
        double resultado3 = clp.convertir(1000, clp);
        double resultado4 = euro.convertir(10, clp);
        double resultado5 = clp.convertir(1000, dolar);
        double resultado6 = clp.convertir(1000, euro);




        System.out.println("10 USD en EUR: " + resultado);
        System.out.println("10 USD en CLP: " + resultado2);
        System.out.println("1000 CLP en CLP: " + resultado3);
        System.out.println("10 EUR en CLP: " + resultado4);
        System.out.println("1000 CLP en USD: " + resultado5);
        System.out.println("1000 CLP en EUR: " + resultado6);

        System.out.println("------------------------------------");
        //Tipo: Animal - Objeto real: Perro
        BAnimal a = new BPerro();
        BAnimal b = new BGato();
        BAnimal c = new BVaca();

        BAnimal[] animales = {a, b, c};

        for (BAnimal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            animal.moverse();
        }



        System.out.println("------------------------------------");


        CFormaPago pago;

        // Tarjeta
        pago = new CTarjetaCredito();
        pago.procesarPago(1000);

        // PayPal
        pago = new CPayPal();
        pago.procesarPago(500);

        // Efectivo
        pago = new CEfectivo();
        pago.procesarPago(200);


        System.out.println("------------------------------------");






    }
}