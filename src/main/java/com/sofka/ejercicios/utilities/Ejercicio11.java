package com.sofka.ejercicios.utilities;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio11 {
    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio11.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        logger.info("Escriba frase: ");
        String frase = scanner.nextLine();

        logger.log(Level.INFO,"La frase tiene una longitud de : {0}", frase.length());
        logger.log(Level.INFO,"Tiene {0} A´s ", countChar(frase, 'a'));
        logger.log(Level.INFO,"Tiene {0} E´s ", countChar(frase, 'e'));
        logger.log(Level.INFO,"Tiene {0} I´s ", countChar(frase, 'i'));
        logger.log(Level.INFO,"Tiene {0} O´s ", countChar(frase, 'o'));
        logger.log(Level.INFO,"Tiene {0} U´s ", countChar(frase, 'u'));
    }

    public static int countChar(@NotNull String str, char caracter){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == caracter){
                count++;
            }
        }
        return count;
    }
}
