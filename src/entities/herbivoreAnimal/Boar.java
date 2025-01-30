package entities.herbivoreAnimal;

import entities.Location;

public class Boar extends Herbivore {

    public static String icon = "\uD83D\uDC17";
    public String getIcon(){
        return icon;
    }

    public Boar(Location initialLocation) {
        super(initialLocation);
    }

}
