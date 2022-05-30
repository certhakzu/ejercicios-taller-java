package com.sofka.ejercicios.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio5 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio1.class));
    static int i = 1;

    public static void main(String[] args) {
        logger.log(Level.SEVERE,"NÚMEROS IMPARES ENTRE [1 Y 100]: ");
        while(i <= 100){
            logger.log(Level.SEVERE, "Número {0}", i);
            i += 2;
        }

        logger.log(Level.SEVERE,"NÚMEROS PARES ENTRE [1 Y 100]: ");
        i = 2;
        while(i <= 100){
            logger.log(Level.SEVERE, "Número {0}", i);
            i += 2;
        }
    }
}
