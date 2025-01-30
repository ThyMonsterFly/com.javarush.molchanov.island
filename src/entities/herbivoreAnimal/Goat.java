package entities.herbivoreAnimal;

import entities.Location;

public class Goat extends Herbivore {

    public static String icon = "\uD83D\uDC10";
    public String getIcon(){
        return icon;
    }

    public Goat(Location initialLocation) {
        super(initialLocation);
    }

}
