package com.company;


import java.time.LocalDate;

/**
 * Created by pbarna on 2017.05.31..
 */
public class Supermarket {



    public static void main(String[] args) {


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


