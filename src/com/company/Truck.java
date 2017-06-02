package com.company;

/**
 * Created by pbarna on 2017.05.31..
 */
public class Truck extends Product {

    private byte numberOfWheels;



    public Truck(String name, int quantity, byte numberOfWheels) {
        super(name, quantity);
        this.numberOfWheels = numberOfWheels;
    }

    public byte getNumberOfWheels() {
        return numberOfWheels;
    }


    public Truck(byte numberOfWheels){
        this("Pickup", 1, numberOfWheels);
    }
}
