package com.company;


import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * <h1>Supermarket simulator 2011</h1>
 * This is a simple program that simulates specific assets of a real life supermarket.
 *
 *@author  Char-acter
 */

public class Supermarket {

//    private static final Logger logger = LoggerFactory.getLogger(Supermarket.class);


    public static void main(String[] args) {

//        logger.info("I am informative!");
//
//        DairyProduct w = new DairyProduct();
//        w.setTemperature(10);
//        w.setTemperature(29);
//        w.setTemperature(31);
//        w.setTemperature(51);

        /**
         * <h1>The main method</h1>
         * Our main method contains a few instances of the possible products of the supermarket
         * and it also prints them out
         * @param args Unused.
         */


        DairyProduct riska = new DairyProduct("Riska", 10, DairyProduct.Type.COCONUT, LocalDate.of(2017,6,1));
        Shovel lapát = new Shovel("Mega Shovel 5000", 10, Shovel.Size.SMALL, Shovel.Material.STEEL);
        Truck dodge = new Truck("Dodge Viper", 10, (byte) 10);
        Shovel ásó = new Shovel("Mega Shovel 5000", 10, Shovel.Size.LARGE, Shovel.Material.WOOD);
        Truck niva = new Truck((byte) 4);
        DairyProduct aldistej = new DairyProduct();

        System.out.println(lapát.getName() + ", " + lapát.getQuantity() + ", " + lapát.getSize() + ", " + lapát.getMaterial());
        System.out.println(dodge.getName() + ", " + dodge.getQuantity() + ", " + dodge.getNumberOfWheels());
        System.out.println(riska.getName() + ", " + riska.getQuantity() + ", " + riska.getType() + ", " + riska.getExpDate() + ", " + riska.dairyExpired());
        System.out.println(niva.getName() + ", " + niva.getQuantity() + ", " + niva.getNumberOfWheels());
        System.out.println(aldistej.getName() + ", " + aldistej.getQuantity() + ", " + aldistej.getType() + ", " + aldistej.getExpDate() + ", " + aldistej.dairyExpired());

    }

}


