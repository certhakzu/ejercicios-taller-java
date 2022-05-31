package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 14
 */
public class Ejercicio14 {
    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio14.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        logger.info("Digite Número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero < 1000){
            for (int i = numero; i <= 1000; i = i + 2){
                logger.log(Level.INFO, " {0}", String.valueOf(i));
            }
        }else if (numero > 1000){
            for (int i = numero; i >= 1000; i = i - 2){
                logger.log(Level.INFO, " {0}", String.valueOf(i));
            }
        }else{
            logger.info("NO ELIJAS EL MISMO NÚMERO 1000");
        }
    }
}
