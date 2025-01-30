package entities.carnivoreAnimal;

import entities.Location;

public class Boa extends Carnivore{

    public static String icon = "\uD83D\uDC0D";
    public String getIcon(){
        return icon;
    }

    public Boa(Location initialLocation) {
        super(initialLocation);
    }

}
