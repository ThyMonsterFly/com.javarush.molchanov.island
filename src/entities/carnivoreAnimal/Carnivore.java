package entities.carnivoreAnimal;

import entities.Animal;
import entities.Location;
import utilities.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Carnivore extends Animal {

    private Map<String, Integer> eatProbability;
    private Location currentLocation;

    public Carnivore(Location initialLocation){
        super(initialLocation);
        currentLocation = initialLocation;
        eatProbability = new HashMap<>();
        eatProbability.put("Wolf", Util.getIntParam(this, "EatWolfProbability"));
        eatProbability.put("Boa", Util.getIntParam(this, "EatBoaProbability"));
        eatProbability.put("Fox", Util.getIntParam(this, "EatFoxProbability"));
        eatProbability.put("Bear", Util.getIntParam(this, "EatBearProbability"));
        eatProbability.put("Eagle", Util.getIntParam(this, "EatEagleProbability"));
        eatProbability.put("Horse", Util.getIntParam(this, "EatHorseProbability"));
        eatProbability.put("Deer", Util.getIntParam(this, "EatDeerProbability"));
        eatProbability.put("Rabbit", Util.getIntParam(this, "EatRabbitProbability"));
        eatProbability.put("Mouse", Util.getIntParam(this, "EatMouseProbability"));
        eatProbability.put("Goat", Util.getIntParam(this, "EatGoatProbability"));
        eatProbability.put("Sheep", Util.getIntParam(this, "EatSheepProbability"));
        eatProbability.put("Boar", Util.getIntParam(this, "EatBoarProbability"));
        eatProbability.put("Buffalo", Util.getIntParam(this, "EatBuffaloProbability"));
        eatProbability.put("Duck", Util.getIntParam(this, "EatDuckProbability"));
        eatProbability.put("Caterpillar", Util.getIntParam(this, "EatCaterpillarProbability"));
    }

    public void eat() {
        List<Animal> animals = currentLocation.getAnimals();
        for (Animal other : animals) {
            if (!other.equals(this) && (ThreadLocalRandom.current().nextInt(101) <= eatProbability.get(other.getClass().getSimpleName()))) {
               currentLocation.removeAnimal(other);
               if (other.weight < saturation){
                   weight -= saturation;
               }
               break;
            }
        }
    }

}
