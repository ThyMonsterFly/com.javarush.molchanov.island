package entities.carnivoreAnimal;

import entities.Location;

public class Wolf extends Carnivore {

    public static String icon = "\uD83D\uDC3A";
    public String getIcon(){
        return icon;
    }

    public Wolf(Location initialLocation) {
        super(initialLocation);
    }

}
