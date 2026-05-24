/*
🧠 🔵 1. LISKOV SUBSTITUTION PRINCIPLE (LSP)
📌 ¿Qué dice?

“Los objetos de una clase hija deben poder reemplazar a los de su clase padre sin romper el programa”

🧠 💡 TRADUCCIÓN SIMPLE

👉 Si usas Poligono, debería funcionar igual con:

Cuadrado ✔
Circulo ✔
Triangulo ✔

👉 sin que el programa falle o cambie su comportamiento esperado

✅ EJEMPLO CORRECTO (como el tuyo)
Poligono p = new Cuadrado(4);
System.out.println(p.calcularArea());

👉 luego cambias:

Poligono p = new Triangulo(5, 2);

👉 🔥 y TODO sigue funcionando igual

✔ Eso cumple LSP

❌ EJEMPLO CLÁSICO QUE ROMPE LSP
class Rectangulo {
    protected int ancho;
    protected int alto;

    public void setAncho(int ancho) { this.ancho = ancho; }
    public void setAlto(int alto) { this.alto = alto; }

    public int getArea() {
        return ancho * alto;
    }
}
class Cuadrado extends Rectangulo {
    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho;
    }

    @Override
    public void setAlto(int alto) {
        this.alto = alto;
        this.ancho = alto;
    }
}

👉 💥 Problema:

Rectangulo r = new Cuadrado();
r.setAncho(5);
r.setAlto(10);

System.out.println(r.getArea()); // ¿50 o 100?

👉 Resultado inesperado 😵

❌ rompe LSP

🎯 IDEA CLAVE

👉 Si una clase hija cambia el comportamiento esperado del padre → ❌ MAL

🧠 🟣 2. INTERFACE SEGREGATION PRINCIPLE (ISP)
📌 ¿Qué dice?

“No obligues a una clase a implementar métodos que no necesita”

🧠 💡 TRADUCCIÓN SIMPLE

👉 Mejor muchas interfaces pequeñas
👉 que una interfaz gigante

❌ MAL DISEÑO
interface Worker {
    void trabajar();
    void comer();
}
class Robot implements Worker {
    public void trabajar() {
        System.out.println("Trabajando");
    }

    public void comer() {
        // 🤖 no tiene sentido
    }
}

👉 💥 Robot está obligado a implementar algo que no usa

✅ BUEN DISEÑO
interface Trabajador {
    void trabajar();
}
interface Comedor {
    void comer();
}
class Humano implements Trabajador, Comedor {
    public void trabajar() {}
    public void comer() {}
}
class Robot implements Trabajador {
    public void trabajar() {}
}

👉 🔥 Cada clase implementa SOLO lo que necesita

🎯 DIFERENCIA CLAVE ENTRE AMBOS
Principio	Idea
LSP	Las clases hijas deben comportarse correctamente
ISP	No obligar a implementar métodos innecesarios
🔥 RESUMEN MENTAL (IMPORTANTE)

👉 LSP:

“Si uso el padre, cualquier hijo debe funcionar igual”

👉 ISP:

“No hagas interfaces gigantes que obliguen a implementar cosas inútiles”

*/