
/*

class Poligono {
    public double sumarArea(...) {}
    public void imprimirPoligono() {}
}

👉 💥 ERROR: estás mezclando responsabilidades:

cálculo de áreas ❌
impresión ❌
lógica de negocio ❌

👉 Viola Responsabilidad Única (SRP)
✅ 🧠 ENFOQUE CORRECTO: Separar responsabilidades en distintas clases:



Evaluar si la clase CuentaBancaria sigue el principio de
responsabilidad única, centrándose únicamente en la gestión del
saldo y las transacciones
1. Refactorizar según el principio de responsabilidad única
Veamos un ejemplo parecido


public class CuentaBancaria{

    private List<Coin> coins;

    public void addCoin(Coin coin) {
    }

    public void sendPayment(double amount) {
    }

    public double getBalance() {
    }

    public void refreshPrices() {
    // actualiza precios de mercado de las coins
    }

    public void showPortfolio() {
    // muestra balance total y por coin
    }

    public double calculateTaxes() {
    // calcula impuestos sobre ganancias
    }
}



DISEÑO CORRECTO
🟢 1. CuentaBancaria (SOLO saldo y coins)

class CuentaBancaria {
    private List<Coin> coins;

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    public double getBalance() {
        // lógica de balance
        return 0;
    }
}
🟡 2. PaymentService (pagos)

class PaymentService {
    public void sendPayment(double amount) {
        System.out.println("Pago realizado: " + amount);
    }
}

🔵 3. PriceService (precios de mercado)
class PriceService {
    public void refreshPrices() {
        System.out.println("Actualizando precios...");
    }
}

🟣 4. PortfolioService (mostrar info)
class PortfolioService {
    public void showPortfolio() {
        System.out.println("Mostrando portfolio...");
    }
}

🔴 5. TaxService (impuestos)
class TaxService {
    public double calculateTaxes() {
        return 0;
    }
}


----------------------------------------------------------------------------
Open/Closed (OCP).
¿QUÉ BUSCA RESOLVER OCP?

👉 El problema es este:

Cuando tu sistema crece…

agregas nuevas funcionalidades ❗
agregas nuevos tipos ❗
cambian requisitos ❗

💥 y tienes que modificar código existente

🔴 ¿Por qué eso es malo?

Porque:

puedes romper cosas que ya funcionaban
introduces bugs
tienes que volver a testear todo
el código se vuelve frágil
🧠 PRINCIPIO OPEN/CLOSED

“Abierto para extensión, cerrado para modificación”

👉 Traducción simple:

✅ Puedes agregar cosas nuevas
❌ Pero NO debes modificar lo que ya funciona


💥 PROBLEMA EN TU EJEMPLO
public class Wallet {
    public void payWithCreditCard(double amount){}
    public void payWithDebitCard(double amount){}
    public void payWithPayPal(double amount){}
}
🔴 ¿Qué pasa si quieres agregar otro método?

👉 Ejemplo: Cripto

public void payWithCrypto(double amount){}

💥 Estás modificando la clase Wallet

👉 Cada nuevo método = modificar código existente
👉 Viola OCP ❌

✅ SOLUCIÓN: USAR ABSTRACCIÓN + POLIMORFISMO

👉 Esto conecta DIRECTO con lo que ya viste (interfaces 👀)

🟢 1. Crear interfaz
interface PaymentMethod {
    void pay(double amount);
}
🔵 2. Implementaciones
Por separado:
class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pago con tarjeta de crédito");
    }
}
class PayPal implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pago con PayPal");
    }
}
🟣 3. Wallet (NO cambia nunca más)
class Wallet {
    public void pay(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}

🚀 AGREGAR NUEVO MÉTODO (SIN MODIFICAR WALLET)
class Crypto implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Pago con cripto");
    }
}
Main seria asi:
Wallet wallet = new Wallet();
PaymentMethod metodo = new CreditCard();
wallet.pay(metodo, 100);
*/