package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio10 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio6.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String frase;

        logger.info("Ingrese Frase: ");
        frase = scanner.nextLine();

        String frase2 = frase.replace(" ", "");
        logger.info(frase2);
    }
}
