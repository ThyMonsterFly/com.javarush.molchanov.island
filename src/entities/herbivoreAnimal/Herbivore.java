package entities.herbivoreAnimal;

import entities.Animal;
import entities.Location;
import entities.Plant;

public abstract class Herbivore extends Animal {

    private Location currentLocation;
    Plant plant;

    public Herbivore(Location initialLocation) {
        super(initialLocation);
        currentLocation = initialLocation;
    }

    public void eat() {
        plant = currentLocation.getPlant();
        if (plant.getBiomass()>saturation) {
            plant.consume(saturation);
        }
        else{
            weight -= saturation;
        }
    }
}
