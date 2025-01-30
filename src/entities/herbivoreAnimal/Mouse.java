package entities.herbivoreAnimal;

import entities.Location;

public class Mouse extends Herbivore {

    public static String icon = "\uD83D\uDC01";
    public String getIcon(){
        return icon;
    }

    public Mouse(Location initialLocation) {
        super(initialLocation);
    }

}
