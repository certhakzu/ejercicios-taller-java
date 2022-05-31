package com.sofka.ejercicios.utilities;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio13 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio12.class));

    public static void main(String[] args) {
        String message = "(" + LocalDateTime.now().toLocalDate() + ")" + "(" + LocalDateTime.now().toLocalTime() + ")";

        logger.log(Level.INFO, message);
    }
}
