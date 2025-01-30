package entities.herbivoreAnimal;

import entities.Location;

public class Horse extends Herbivore {

    public static String icon = "\uD83D\uDC0E";
    public String getIcon(){
        return icon;
    }

    public Horse(Location initialLocation) {
        super(initialLocation);
    }

}
