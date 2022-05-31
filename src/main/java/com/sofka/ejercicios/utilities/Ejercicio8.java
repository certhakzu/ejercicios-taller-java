package com.sofka.ejercicios.utilities;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Piter Velasquez
 * @version Ejercicio 8
 */
public class Ejercicio8 {

    static final Logger logger = Logger.getLogger(String.valueOf(Ejercicio8.class));
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Boolean flag = true;
        String dia;
        do{
            logger.info("\t\tMENÚ\n\n1. Lunes\n2. Martes\n3. Miércoles\n4. Jueves\n5. Viernes\n6. Sábado\n7. Domingo\n\nDigite Opción: ");
            dia = scanner.nextLine();
            switch (dia){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                    logger.log(Level.INFO, "Es un día Laboral");
                    flag = true;
                    break;
                case "6":
                case "7":
                    logger.log(Level.INFO, "NO Es un día Laboral");
                    flag = true;
                    break;
                default:
                    logger.log(Level.WARNING, "Opcion no Válida");
                    flag = false;
            }
        }while(Boolean.FALSE.equals(flag));
    }
}
