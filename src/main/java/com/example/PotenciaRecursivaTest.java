package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PotenciaRecursivaTest {

    @Test
    void testPotencia() {
        assertEquals(8, PotenciaRecursiva.potencia(2, 3));
        assertEquals(1, PotenciaRecursiva.potencia(5, 0));
        assertEquals(15625, PotenciaRecursiva.potencia(5, 6));
        assertEquals(81, PotenciaRecursiva.potencia(6, 4));
        assertEquals(3, PotenciaRecursiva.potencia(3, 3));
    }
}
