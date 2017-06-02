package com.company;

/**
 * Created by pbarna on 2017.05.31..
 */
public class Shovel extends Product {

    private final Size size;
    private final Material material;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public enum Material{
        WOOD, STEEL, PLASTIC
    }


    public Shovel(String name, int quantity, Size size, Material material) {
        super(name, quantity);
        this.size = size;
        this.material = material;


    }

    public Size getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }


}
