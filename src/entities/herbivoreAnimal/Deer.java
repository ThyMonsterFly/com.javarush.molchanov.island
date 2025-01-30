package entities.herbivoreAnimal;

import entities.Location;

public class Deer extends Herbivore {

    public static String icon = "\uD83E\uDD8C";
    public String getIcon(){
        return icon;
    }

    public Deer(Location initialLocation) {
        super(initialLocation);
    }

}
