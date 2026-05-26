/*
public void procesarPago(double monto) {
    System.out.println("Pagando $" + monto + " en efectivo");
}

El método solo imprime, no retorna ningún valor. Entonces no hay nada que verificar con un assertEquals porque 
no hay resultado que comparar.

¿Qué se testea y qué no?
Situación                     ¿Se testea?
Método retorna un valor           ✅Sí
Método modifica un atributo       ✅ Sí
Método lanza una excepción        ✅ Sí
Método solo imprime               ⚠️ No tiene mucho sentido

entonces lo que voy entendiendo:

crear el archivo con el nombredelaclaseTest.java
crear una variable propia del test( CEfectivo efectivo;)
@BeforeEach void setUp() { efectivo = new CEfectivo(); } incluir ese comando
agregar @test al metodo que se va a evaluar y evaluar todas las opciones posibles como ingresar un pago positivo y 
uno negativo.

mismo pero otra forma:

Los 4 pasos para crear un Test Unitario:
1️⃣ Crear el archivo NombreClaseTest.java
2️⃣ Declarar un atributo del tipo de la clase a testear
javaCEfectivo efectivo;
3️⃣ Inicializar con @BeforeEach para que cada test arranque limpio
java@BeforeEach
void setUp() {
    efectivo = new CEfectivo();
}
4️⃣ Crear un @Test por cada comportamiento posible del método, cubriendo casos normales y casos de error
java@Test
void testPagoPositivo() { ... }

@Test
void testPagoNegativo() { ... }

-------------------------------------------------------------------------------------------------------
¿Para qué sirve assertEquals?

Se usa para verificar que el valor esperado coincida con el valor obtenido. Por ejemplo:
javaassertEquals(1000.0, cuenta.getSaldo());
//            ↑               ↑
//         esperado         obtenido
Si no coinciden, el test falla y te avisa exactamente qué valor recibió versus qué esperabas. 
Es la herramienta principal para comprobar que tu código retorna los resultados correctos.
*/