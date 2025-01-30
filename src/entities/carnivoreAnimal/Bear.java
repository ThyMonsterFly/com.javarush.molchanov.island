package entities.carnivoreAnimal;

import entities.Location;

public class Bear extends Carnivore {

    public static String icon = "🐻";
    public String getIcon(){
        return icon;
    }

    public Bear(Location initialLocation) {
        super(initialLocation);
    }

}
