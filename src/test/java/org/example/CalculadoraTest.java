package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveDividirDoisNumerosCorretamente() {
        assertEquals(5, calculadora.divide(10, 2));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divide(10, 0));
    }
}