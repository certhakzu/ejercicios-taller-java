package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 10
 */
public class Ejercicio10 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio10.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String frase;

        logger.info("Ingrese Frase: ");
        frase = scanner.nextLine();

        String frase2 = frase.replace(" ", "");
        logger.info(frase2);
    }
}
