/*
Iniciando Pruebas Initarias
🧠 📌 RESUMEN CORTO (LO MÁS IMPORTANTE)

👉 Los tests unitarios son:

🔹 Pruebas pequeñas que verifican que un método o clase funcione correctamente

🎯 IDEA CLAVE
Pruebas una sola cosa a la vez
Se ejecutan automáticamente
No dependen de otras cosas (ni DB, ni API, etc.)
🔥 ¿PARA QUÉ SIRVEN?
Detectar errores rápido
Mejorar la calidad del código
Poder cambiar código sin romper todo (refactorizar)
⚖️ RESUMEN ULTRA SIMPLE

✅ Buenos porque:

Encuentran errores temprano
Hacen tu código más seguro

❌ “Malos” porque:

Toman tiempo escribirlos
Hay que mantenerlos
🧠 📝 ACTIVIDAD: PROS Y CONTRAS

Ahora clasificamos 👇

✅ PROS
✔ Detecta errores temprano
✔ Facilitan el refactoring
✔ Aíslan el código bajo prueba
✔ Automatización de las pruebas
✔ Simplicidad y rapidez de ejecución
✔ Independencia entre pruebas
❌ CONTRAS
❌ No prueban la UI ni la DB
❌ Requieren mantenimiento
❌ Aumentan la carga de desarrollo inicial
❌ Sobrecarga si no se administran bien
❌ Requiere aprender frameworks de testing
❌ Complejidad de mockear dependencias
🧠 💡 TIP PARA ENTENDERLO MEJOR

👉 Regla fácil:

Si ayuda al desarrollo → ✅ PRO
Si cuesta tiempo o esfuerzo → ❌ CONTRA
🚀 FRASE FINAL (IMPORTANTE)

“Los tests no evitan errores… los detectan antes de que sea tarde.”


----------------------------------------------------------------
Para aplicar test unitarios, por cada clase que se desee probar se crea una clase paralela llamada convencionalmente 
ClaseTest. Dentro de ella se declara un atributo del mismo tipo de la clase a testear, que se inicializa antes de cada
 prueba usando @BeforeEach. Luego, por cada método de la clase original se construyen uno o más métodos anotados con 
 @Test, cubriendo no solo el comportamiento normal sino también los casos límite y de error. En resumen, la ClaseTest 
 es un espejo de la clase original, donde cada comportamiento posible queda verificado de forma automática y repetible.

class CuentaBancariaTest {

    // 1️⃣ Un atributo del tipo de la clase que vas a testear
    CuentaBancaria cuenta;

    // 2️⃣ Preparas el objeto antes de cada test
    @BeforeEach
    void setUp() {
        cuenta = new CuentaBancaria("Juan", 1000.0);
    }

    // 3️⃣ Un @Test por cada comportamiento que quieras verificar
    @Test
    void testDepositar() { ... }

    @Test
    void testRetirar() { ... }
}

*/