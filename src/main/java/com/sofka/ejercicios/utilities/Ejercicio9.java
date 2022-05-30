package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio9 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio9.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fraseInicial = "La sonrisa sera la mejor arma contra la tristeza"; //reemplazar 'a' con 'e'
        String fraseAdicional;

        logger.info("Escriba frase que quiere adicionar: ");
        fraseAdicional = scanner.nextLine();
        logger.log(Level.SEVERE, " {0}", fraseInicial.replace('a', 'e').concat(fraseAdicional));
    }
}
