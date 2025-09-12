package com.example;

import java.util.Scanner;

import org.junit.platform.console.ConsoleLauncher;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        int resultado = PotenciaRecursiva.potencia(base, exponente);
        System.out.println("Resultado: " + base + "^" + exponente + " = " + resultado);

        System.out.print("¿Desea ejecutar los tests? (s/n): ");
        String opcion = sc.next();

        if (opcion.equalsIgnoreCase("s")) {
            
           ConsoleLauncher.execute(System.out, System.err,
                    "--classpath", "out",       
                    "--scan-class-path"
                    );       
            
        }

        sc.close();
    }
}
