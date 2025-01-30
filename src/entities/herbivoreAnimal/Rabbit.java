package entities.herbivoreAnimal;

import entities.Location;

public class Rabbit extends Herbivore {

    public static String icon = "\uD83D\uDC07";
    public String getIcon(){
        return icon;
    }

    public Rabbit(Location initialLocation) {
        super(initialLocation);
    }

}
