package entities;

import utilities.AnimalFactory;
import utilities.Util;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

    public int weight;
    public int maxCellCount;
    public int speed;
    public int saturation;
    private Location currentLocation;

    public Animal(Location initialLocation) {
        this.currentLocation = initialLocation;
        this.weight = Util.getIntParam(this, "Weight");
        this.maxCellCount = Util.getIntParam(this,"MaxCellCount");
        this.speed = Util.getIntParam(this,"Speed");
        this.saturation = Util.getIntParam(this, "Saturation");
    }

    public abstract String getIcon();

    public abstract void eat();

//    public void eat(){
//        if (this instanceof Carnivore){
//            List<Animal> animals = currentLocation.getAnimals();
//            for (Animal other : animals) {
//                if (!other.equals(this) && (ThreadLocalRandom.current().nextInt(101) <= eatProbability.get(other.getClass().getSimpleName()))) {
//                    currentLocation.removeAnimal(other);
//                    if (other.weight < saturation){
//                        weight -= saturation;
//                    }
//                    break;
//                }
//            }
//        }
//        else{
//            plant = currentLocation.getPlant();
//            if (plant.getBiomass()>saturation) {
//                plant.consume(saturation);
//            }
//            else{
//                weight -= saturation;
//            }
//        }
//
//    }

    public void reproduce() {
        CopyOnWriteArrayList<Animal> animals = currentLocation.getAnimals();
        for (Animal other : animals) {
            if (!other.equals(this) && (other.getClass()==this.getClass())) {
                AnimalFactory spawner = new AnimalFactory();
                currentLocation.addAnimal(spawner.makeAnimal(this, currentLocation));
                break;
            }
        }
    }

    public void move(){
        int newX = currentLocation.getX();
        int newY = currentLocation.getY();
        int rows = currentLocation.getIsland().getRows();
        int columns = currentLocation.getIsland().getColumns();
        int direction = ThreadLocalRandom.current().nextInt(4);
        switch (direction) {
            case 0:
                newX = Math.max(0, newX - speed);
                break;
            case 1:
                newX = Math.min(rows - 1, newX + speed);
                break;
            case 2:
                newY = Math.min(columns - 1, newY + speed);
                break;
            case 3:
                newY = Math.max(0, newY - speed);
                break;
        }
        Location newLocation = currentLocation.getIsland().getLocation(newX, newY);
        currentLocation.removeAnimal(this);
        newLocation.addAnimal(this);
        currentLocation = newLocation;
    }

    public void wellnessCheck(){
        if (weight <= 0){
            currentLocation.removeAnimal(this);
        }
    }

    public void cycle() {
        eat();
        reproduce();
        move();
        wellnessCheck();
    }

}
