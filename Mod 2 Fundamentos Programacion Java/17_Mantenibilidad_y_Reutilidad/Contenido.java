/*/
🧠 Polimorfismo y Principios de Diseño (Resumen)
📌 ¿Qué son los principios de diseño en POO?

Son buenas prácticas que ayudan a escribir código:

✔ Más organizado
✔ Fácil de entender
✔ Fácil de modificar
✔ Reutilizable
🟡 Mantenibilidad

Es la capacidad del software de poder:

Corregirse
Mejorarse
Adaptarse
🔑 Claves:
Código ordenado y claro
Clases con responsabilidades específicas
Poco acoplamiento (clases independientes)
Evitar duplicación de código
💡 Importancia:

Permite hacer cambios sin romper todo el sistema.

🔁 Reutilizabilidad

Es la capacidad de usar código ya hecho en otros contextos.

🔑 Claves:
No repetir código
Usar herencia e interfaces
Crear clases generales (más abstractas)
💡 Importancia:
Ahorra tiempo
Reduce errores
Hace el código más simple
🧱 Conceptos clave aplicados
✔ Abstracción

Crear clases más generales
Ejemplo: CuentaBancaria en lugar de CuentaCLP

✔ Herencia

Permite reutilizar código común

✔ Interfaces

Definen reglas que las clases deben cumplir

✔ Polimorfismo

Permite usar una misma referencia para distintos objetos

interface FormaPago {
    void pagar();
}

Agregar un nuevo método de pago
class PagoCripto implements FormaPago {
    public void pagar() {
        System.out.println("Pagando con Cripto");
    }
}

👉 🔥 NO necesitas modificar el código existente
👉 Solo agregas una nueva clase (implements, no extends en este caso)

IMPORTANTE
implements → se usa con interfaces
extends → se usa con clases (normales o abstractas)
🎯 Beneficio real

✔ Sistema escalable
✔ Código limpio
✔ Fácil de mantener
✔ Fácil de extender sin romper nada

🚀 Idea principal

No se trata solo de que el código funcione,
sino de que sea fácil de mantener y crecer en el tiempo.

*/