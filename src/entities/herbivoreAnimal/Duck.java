package entities.herbivoreAnimal;

import entities.Location;

public class Duck extends Herbivore {

    public static String icon = "\uD83E\uDD86";
    public String getIcon(){
        return icon;
    }

    public Duck(Location initialLocation) {
        super(initialLocation);
    }

}
