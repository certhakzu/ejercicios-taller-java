package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio4 {

    public static final double IVA = 0.19;//% IVA
    public static double precio;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio1.class));

    public static void main(String[] args) {
        logger.info("Digite precio del producto: ");
        precio = Double.parseDouble(scanner.nextLine());
        logger.log(Level.INFO, "El precio final (con IVA) es {0}", (precio + (precio * IVA)));
    }
}
