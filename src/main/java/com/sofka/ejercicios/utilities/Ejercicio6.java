package com.sofka.ejercicios.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio6 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio6.class));


    public static void main(String[] args) {
        logger.log(Level.SEVERE,"NÚMEROS IMPARES ENTRE [1 Y 100]: ");
        for (int i = 1; i <=100; i += 2){
            logger.log(Level.SEVERE, "Número {0}", i);
        }

        logger.log(Level.SEVERE,"NÚMEROS PARES ENTRE [1 Y 100]: ");
        for (int i = 2; i <=100; i += 2){
            logger.log(Level.SEVERE, "Número {0}", i);
        }
    }
}
