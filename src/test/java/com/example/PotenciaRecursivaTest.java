package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PotenciaRecursivaTest {

    @Test
    void testPotenciaPositiva() {
        assertEquals(8, PotenciaRecursiva.potencia(2, 3));
    }

    @Test
    void testPotenciaExponenteCero() {
        assertEquals(1, PotenciaRecursiva.potencia(5, 0));
    }

    @Test
    void testPotenciaGrande() {
        assertEquals(15625, PotenciaRecursiva.potencia(5, 6));
    }

   // @Test
   // void testPotenciaCuatro() {
       // assertEquals(81, PotenciaRecursiva.potencia(6, 4));
    }

    @Test
    void testPotenciaNegativaBase() {
        assertEquals(-27, PotenciaRecursiva.potencia(-3, 3));
    }

   // @Test
   // void testPotenciaExponenteNegativo() {
       // assertEquals(0.03703, PotenciaRecursiva.potencia(3, -3), 0.0001); 
       //tolerancia
    //}
}


