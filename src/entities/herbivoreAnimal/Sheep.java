package entities.herbivoreAnimal;

import entities.Location;

public class Sheep extends Herbivore {

    public static String icon = "\uD83D\uDC11";
    public String getIcon(){
        return icon;
    }

    public Sheep(Location initialLocation) {
        super(initialLocation);
    }

}
