package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 12
 */
public class Ejercicio12 {
    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio12.class));
    static final Scanner scanner = new Scanner(System.in);
    static String palabra1;
    static String palabra2;
    static int mayorLongitud;
    static final String CON = "con";

    public static void main(String[] args) {

        logger.info("Escriba Primera Palabra: ");
        palabra1 = scanner.nextLine();
        logger.info("Escriba Segunda Palabra: ");
        palabra2 = scanner.nextLine();
        equalsWhere();
    }

    private static void equalsWhere() {

        if (palabra1.equalsIgnoreCase(palabra2)){
            logger.info("Son Iguales");
        }else {
            logger.info("SON DIFERENTES EN: ");
            if (palabra1.length() == palabra2.length()) {
                showDiferentsLength();///////////////
            } else {
                logger.info("Las Palabras no tienen la misma longitud");
                if (palabra1.length() >= palabra2.length()) {
                    showIfFirstWordIsMajor();/////////////
                } else {
                    showIfSecondWordIsMajor();
                }
            }
        }
    }

    private static void showIfSecondWordIsMajor() {
        String message;
        mayorLongitud = palabra2.length();
        for (int i = 0; i < mayorLongitud; i++) {
            if (i < palabra1.length()) {
                message = (palabra1.charAt(i)) + CON + (palabra2.charAt(i));
                logger.info(message);
            } else {
                message = "La segunda palabra se excede en: " + palabra2.substring(i);
                logger.info(message);
                break;
            }
        }
    }

    private static void showIfFirstWordIsMajor() {
        mayorLongitud = palabra1.length();
        String message;
        for (int i = 0; i < mayorLongitud; i++) {
            if (i < palabra2.length()) {
                message = (palabra1.charAt(i)) + CON + (palabra2.charAt(i));
                logger.info(message);
            } else {
                message = "La primera palabra se excede en: " + palabra1.substring(i);
                logger.info(message);
                break;
            }
        }
    }

    private static void showDiferentsLength() {
        for (int i = 0; i < palabra1.length(); i++) {
            if (palabra1.charAt(i) != palabra2.charAt(i)) {
                String message = (palabra1.charAt(i)) + CON + (palabra2.charAt(i));
                logger.info(message);
            }
        }
    }
}