package com.example2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MonedaTest {

    // Como Moneda es una interfaz, creamos una implementación simple para testear
    Moneda dolar = new Moneda() {
        @Override
        public String getSimbolo() { return "USD"; }

        @Override
        public double getFactorConversion() { return 1000.0; }
    };

    @Test
    void testSimbolo() {
        assertEquals("USD", dolar.getSimbolo());
    }

    @Test
    void testFactorConversion() {
        assertEquals(1000.0, dolar.getFactorConversion());
    }
}