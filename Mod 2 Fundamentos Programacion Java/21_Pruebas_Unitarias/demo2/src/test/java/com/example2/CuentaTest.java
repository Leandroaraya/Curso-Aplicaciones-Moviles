package com.example2;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

    Cuenta cuenta;

    @BeforeEach
    void setUp() {
        cuenta = new Cuenta("Juan", 1000.0);
    }

    @Test
    void testSaldoInicial() {
        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    void testDepositar() {
        cuenta.depositar(500.0);
        assertEquals(1500.0, cuenta.getSaldo());
    }

    @Test
    void testRetirar() {
        cuenta.retirar(400.0);
        assertEquals(600.0, cuenta.getSaldo());
    }

    @Test
    void testSaldoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cuenta("Ana", -500.0);
        });
    }

    @Test
    void testRetiroMayorAlSaldo() {
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(9999.0);
        });
    }
}