package entities.herbivoreAnimal;

import entities.Location;

public class Caterpillar extends Herbivore {

    public static String icon = "\uD83D\uDC1B";
    public String getIcon(){
        return icon;
    }

    public Caterpillar(Location initialLocation) {
        super(initialLocation);
    }

}
