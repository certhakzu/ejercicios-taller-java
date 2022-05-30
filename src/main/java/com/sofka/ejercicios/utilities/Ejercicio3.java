package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio3 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio3.class));
    static double radio;
    static double areaCirculo;

    public static void main(String[] args) {
        logger.info("Digite Radio: ");
        radio = Double.parseDouble((scanner.nextLine()));
        areaCirculo = Math.pow(Math.PI, radio);
        logger.log(Level.INFO, "Área de Cirulo = {0}", areaCirculo);
    }
}
