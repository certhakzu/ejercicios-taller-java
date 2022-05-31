package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 7
 */
public class Ejercicio7 {
    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio7.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double numero;
        do {
            logger.info("Digite número: ");
            numero = Double.parseDouble(scanner.nextLine());
        }while (numero < 0.0);
        logger.log(Level.SEVERE, "{0}", numero);
    }
}
