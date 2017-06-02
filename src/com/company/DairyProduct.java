package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.time.LocalDate;

/**
 * <h1>The DairyProduct class</h1>
 * Dairy products are probably the most essential parts of the fridge
 * (for most people at least). Since dairy products has an expiration date, our simulated ones
 * also have one, as well as a type. The class is built upon the Product class.
 *
 */
public class DairyProduct extends Product {
//    private static final Logger logger = LoggerFactory.getLogger(DairyProduct.class);
//    private int temperature;


    private Type type;
    private LocalDate expDate;

    public enum Type{
        /**
         * The Dairy product's Type enum contais specific types of milks which decides the expiration date.
         */
        COW, SOY, COCONUT, HAZELNUT,
    }
    public DairyProduct(){
        this("Budget Milk", 1, Type.COW, LocalDate.of(2017,05,30));
    }

    public DairyProduct(String name, int quantity, Type type, LocalDate expDate) {
        super(name, quantity);
        this.type = type;
        this.expDate = expDate;
    }


    public Type getType() {
        return type;
    }

    public LocalDate getExpDate() {
        return expDate;
    }


    public boolean dairyExpired(){
        /**
         * The dairyExpired method below decides whether our dairy product's expiration date is ok.
         *
         */
        if (LocalDate.now().isAfter(expDate)){
            return true;

        }
        System.out.println("Your product is steel good");
        return false;
    }


//    public void setTemperature(int temperature) {
//        int oldTemp = this.temperature;
//        this.temperature = temperature;
//        logger.debug("Temperature set to {}. Old temperature was {}.", this.temperature, oldTemp);
//
//        if(this.temperature > 50) {
//            logger.warn("Temperature has risen above 50 degrees.");
//        }else if(this.temperature > 30) {
//            logger.info("Temperature has risen above 30 degrees.");
//        }
//    }
}
