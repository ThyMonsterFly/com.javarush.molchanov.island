package entities.carnivoreAnimal;

import entities.Location;

public class Fox extends Carnivore{

    public static String icon = "\uD83E\uDD8A";
    public String getIcon(){
        return icon;
    }

    public Fox(Location initialLocation) {
        super(initialLocation);
    }

}
