/*

importaciones necesarias para usar JUnit 5
import static org.junit.jupiter.api.Assertions.*; // Importa todas las aserciones de JUnit 5
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

Anotaciones más usadas en JUnit 5
@Test → Marca un método como test. Es la anotación principal, sin ella el método no se ejecuta como prueba.
@Before → Se ejecuta antes de cada test. Se usa para preparar el objeto que vas a testear. En JUnit 5 se llama @BeforeEach.
@After → Se ejecuta después de cada test. Se usa para limpiar recursos. En JUnit 5 se llama @AfterEach.
@BeforeClass → Se ejecuta una sola vez antes de todos los tests de la clase. Útil para configuraciones costosas que no necesitan repetirse. 
                En JUnit 5 se llama @BeforeAll.
@AfterClass → Se ejecuta una sola vez después de todos los tests de la clase. Útil para cerrar conexiones o liberar recursos. 
                En JUnit 5 se llama @AfterAll.
@Ignore → Omite un test, no lo ejecuta. Se usa cuando un test está en construcción o temporalmente desactivado. En JUnit 5 se 
                llama @Disabled.


---------------------------------------------------------------------------------------------
Assertions más usados en JUnit 5
Método                                                  ¿Qué verifica?
assertEquals(esperado, obtenido)                 Que dos valores sean iguales
assertNotEquals(esperado, obtenido)              Que dos valores sean distintos
assertTrue(condicion)                            Que una condición sea verdadera
assertFalse(condicion)                           Que una condición sea falsa
assertNull(objeto)                               Que un objeto sea null
assertNotNull(objeto)                            Que un objeto no sea null
assertThrows(excepcion, codigo)                  Que se lance una excepción

*/