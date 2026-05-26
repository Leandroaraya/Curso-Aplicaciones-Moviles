package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CEfectivoTest {

    CEfectivo efectivo;

    @BeforeEach
    void setUp() {
        efectivo = new CEfectivo();
    }

    @Test
    void testProcesarPago() {
        efectivo.procesarPago(500.0);
        assertEquals(500.0, efectivo.getUltimoPago());
    }

    @Test
    void testProcesarPagoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            efectivo.procesarPago(-100.0);
        });
    }
}