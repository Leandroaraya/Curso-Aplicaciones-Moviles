import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Billetera billetera = new Billetera();//crea el objeto billetera

        // Pago con tarjeta
        // Asigna una nueva instancia/objeto de TarjetaDeCredito a metodoPago que es un atributo de tipo FormaDePago,
        //  esto es posible gracias al polimorfismo, ya que TarjetaDeCredito es una subclase de FormaDePago
        billetera.metodoPago = new TarjetaDeCredito(3);

        // Llama al método pagar() de la clase Billetera, que a su vez llama al método realizarPago()
        //  de la clase TarjetaDeCredito
        billetera.pagar();

        // Pago con moneda
        billetera.metodoPago = new Moneda("USD");
        billetera.pagar();

        System.out.println("----- Polimorfismo con animales -----");

        Animal y = new Animal();


        ArrayList<Animal> lista = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        Animal[] arregloAnimales= {a,b,c};//“crea un arreglo y mete dentro el objeto y”

        lista.add(a);
        lista.add(b);
        lista.add(c);

        for (Animal animal : lista) {
            System.out.println(animal.hacerRuido());
        }
        System.out.println("----------------");
       
        for (Animal animal : arregloAnimales) {
            System.out.println(animal.hacerRuido());
        }
        System.out.println("----------------");


        System.out.println(a.hacerRuido());
        System.out.println(b.hacerRuido());
        System.out.println(c.hacerRuido());


        System.out.println("----------------");
        System.out.println("----------------");


        CCuentaDigital cuenta1 = new CCuentaCL(10000);
        CCuentaDigital cuenta2 = new CCuentaUSD(10000);

        System.out.println(cuenta1.verificarFondos(5000)); // true
        System.out.println(cuenta2.verificarFondos(5));    // true (5 USD → 5000 CLP)
        
        System.out.println("----------------");
        System.out.println("----------------");


        DFigura f1 = new DRectangulo(5, 4);
        DFigura f2 = new DTriangulo(6, 3);
        DFigura f3 = new DCirculo(2);

        System.out.println("Rectángulo: " + f1.calcularArea());
        System.out.println("Triángulo: " + f2.calcularArea());
        System.out.println("Círculo: " + f3.calcularArea());

    }
}