package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio2.class));
    static double numero1;
    static double numero2;

    public static void main(String[] args) {
        logger.info("Digite Número 1: ");
        numero1 = Double.parseDouble(scanner.nextLine());
        logger.info("Digite Número 2: ");
        numero2 = Double.parseDouble(scanner.nextLine());

        if(numero1 > numero2){
            logger.log(Level.INFO,"El mayor es {0}", numero1);
        }else if(numero2 > numero1){
            logger.log(Level.INFO,"El mayor es {0}", numero2);
        }else{
            logger.log(Level.INFO,"Son Iguales");
        }
    }
}
