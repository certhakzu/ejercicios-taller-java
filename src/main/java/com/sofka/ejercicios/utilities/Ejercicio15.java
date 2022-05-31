package com.sofka.ejercicios.utilities;


import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 15
 */
public class Ejercicio15 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio15.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        do{
            logger.info("****** GESTION CINEMATOGRÁFICA ********\n\n1- NUEVO ACTOR\n2- BUSCAR ACTOR\n3- ELIMINAR ACTOR\n" +
                    "4- MODIFICAR ACTOR\n5- VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n" +
                    "7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8- SALIR");
            option = scanner.nextLine();
            switch (option){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                    break;
                default:
                    logger.warning("OPCIÓN INCORRECTA");
            }
        }while (!option.equals("8"));
    }
}
