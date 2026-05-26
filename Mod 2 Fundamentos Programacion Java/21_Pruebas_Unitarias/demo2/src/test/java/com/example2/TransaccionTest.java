package com.example2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class TransaccionTest {

    @Test
    void testTransaccionDeposito() {
        Transaccion t = new Transaccion(500.0, "deposito");
        assertEquals(500.0, t.getMonto());
        assertEquals("deposito", t.getTipo());
    }

    @Test
    void testTransaccionRetiro() {
        Transaccion t = new Transaccion(200.0, "retiro");
        assertEquals(200.0, t.getMonto());
        assertEquals("retiro", t.getTipo());
    }

    @Test
    void testMontoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Transaccion(-100.0, "deposito");
        });
    }
}