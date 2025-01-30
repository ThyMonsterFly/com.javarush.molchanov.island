package entities.herbivoreAnimal;

import entities.Location;

public class Buffalo extends Herbivore {

    public static String icon = "\uD83D\uDC03";
    public String getIcon(){
        return icon;
    }

    public Buffalo(Location initialLocation) {
        super(initialLocation);
    }

}
