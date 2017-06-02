package com.company;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by pbarna on 2017.05.31..
 */
public class DairyProduct extends Product {

    private Type type;
    private LocalDate expDate;

    public enum Type{
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
        if (LocalDate.now().isAfter(expDate)){
            return true;

        }
        System.out.println("Your product is steel good");
        return false;
    }
}
