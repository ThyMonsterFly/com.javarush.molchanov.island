package utilities;

import entities.Animal;
import entities.Location;
import entities.carnivoreAnimal.*;
import entities.herbivoreAnimal.*;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalFactory {

    public int j = 0;
    private Location currentLocation;

    public CopyOnWriteArrayList<Animal> populate (Location currentLocation){

        CopyOnWriteArrayList<Animal> animals = new CopyOnWriteArrayList<>();
        j = ThreadLocalRandom.current().nextInt(Settings.wolfMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Wolf(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.boaMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Boa(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.foxMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Fox(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.bearMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Bear(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.eagleMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Eagle(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.horseMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Horse(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.deerMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Deer(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.rabbitMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Rabbit(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.mouseMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Mouse(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.goatMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Goat(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.sheepMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Sheep(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.boarMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Boar(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.buffaloMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Buffalo(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.duckMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Duck(currentLocation));
        }
        j = ThreadLocalRandom.current().nextInt(Settings.caterpillarMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Caterpillar(currentLocation));
        }
        return animals;
    }

    public Animal makeAnimal(Animal animal, Location location){
        String type = animal.getClass().getSimpleName();
        switch (type){
            case "Bear": return new Bear(location);
            case "Boa": return new Boa(location);
            case "Eagle": return new Eagle(location);
            case "Fox": return new Fox(location);
            case "Wolf": return new Wolf(location);
            case "Boar": return new Boar(location);
            case "Buffalo": return new Buffalo(location);
            case "Caterpillar": return new Caterpillar(location);
            case "Deer": return new Deer(location);
            case "Duck": return new Duck(location);
            case "Goat": return new Goat(location);
            case "Horse": return new Horse(location);
            case "Mouse": return new Mouse(location);
            case "Rabbit": return new Rabbit(location);
            case "Sheep": return new Sheep(location);
            default: return null;
        }
    }

}
