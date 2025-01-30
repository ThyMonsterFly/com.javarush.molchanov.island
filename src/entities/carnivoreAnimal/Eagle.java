package entities.carnivoreAnimal;

import entities.Location;

public class Eagle extends Carnivore{

    public static String icon = "\uD83E\uDD85";
    public String getIcon(){
        return icon;
    }

    public Eagle(Location initialLocation) {
        super(initialLocation);
    }

}
