package com.sofka.ejercicio1.utilities;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio1 {

    private static Logger logger = Logger.getLogger(String.valueOf(Ejercicio1.class));
    static int numero1 = 8;
    static int numero2 = 5;

    public static void main(String[] args) {
        if(numero1 > numero2){
            logger.log(Level.INFO,"El mayor es {0}", numero1);
        }else if(numero2 > numero1){
            logger.log(Level.INFO,"El mayor es {0}", numero2);
        }else{
            logger.log(Level.INFO,"Son Iguales");
        }
    }
}
