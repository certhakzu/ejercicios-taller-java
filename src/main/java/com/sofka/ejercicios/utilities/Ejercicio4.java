package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 4
 */
public class Ejercicio4 {

    public static final double IVA = 0.19;//% IVA
    static double precio;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio4.class));

    public static void main(String[] args) {
        logger.info("Digite precio del producto: ");
        precio = Double.parseDouble(scanner.nextLine());
        logger.log(Level.INFO, "El precio final (con IVA) es {0}", (precio + (precio * IVA)));
    }
}
