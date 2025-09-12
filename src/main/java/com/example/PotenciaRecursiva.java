package com.example;

public class PotenciaRecursiva {
       
    public static int multiplicar(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicar(a, b - 1);
    }

    
    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return multiplicar(base, potencia(base, exponente - 1));
    }
}

