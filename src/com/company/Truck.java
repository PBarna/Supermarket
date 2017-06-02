package com.company;

/**
 * <h1>The Truck class</h1>
 * The truck is a bit an out of place product in our case
 * but this Supermarket only exists on a theoretical level, so just accept it's existense
 * The Truck class has one parameter: number of wheels
 * It's built upon the Product class
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
