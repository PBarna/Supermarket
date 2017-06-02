package com.company;

/**
 * <h1>The Shovel class</h1>
 * It's a shovel, you dig with it, it's also a pretty dope home defense
 * tool. In our case it's built upon the Product class and has two enums as parameters:
 * size and material
 */
public class Shovel extends Product {

    private final Size size;
    private final Material material;

    public enum Size {
        /**
         * The Shovel's Size enum shows the type of sizes of the Shovels
         */
        SMALL, MEDIUM, LARGE
    }

    public enum Material{
        /**
         * The Shovel's Material enum shows the type of materials of the Shovels
         */
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
