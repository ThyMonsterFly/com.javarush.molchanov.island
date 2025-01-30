package utilities;

import entities.Animal;
import entities.Island;
import entities.Location;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Simulation {

    private ScheduledExecutorService executor;
    private Island island;
    private ScheduledExecutorService plantPool;
    private ScheduledExecutorService animalPool;
    private ScheduledExecutorService statsPool;


    public Simulation() {
        island = new Island();
        plantPool = Executors.newScheduledThreadPool(2);
        animalPool = Executors.newScheduledThreadPool(4);
        statsPool = Executors.newScheduledThreadPool(2);
    }

    public void start() {
        plantPool.scheduleAtFixedRate(this::updateAllPlants, 0, 1, TimeUnit.SECONDS);
        animalPool.scheduleAtFixedRate(this::updateAllAnimals, 0, 1, TimeUnit.SECONDS);
        statsPool.scheduleAtFixedRate(this::printStatistics, 0, 1, TimeUnit.SECONDS);
    }

    public void updateAllPlants() {
        for (List<Location> row : island.getLocations()) {
            for (Location location : row) {
                location.growPlants();
            }
        }
    }

    public void updateAllAnimals() {
        for (List<Location> row : island.getLocations()) {
            for (Location location : row) {
                location.updateAnimals();
            }
        }
    }

    public void printStatistics() {
        Map<String, Integer> statistics = new HashMap<>();
        for (List<Location> row : island.getLocations()) {
            for (Location location : row) {
                for (Animal animal : location.getAnimals()) {
                    statistics.put(animal.getIcon(), statistics.getOrDefault(animal.getIcon(), 0) + 1);
                }
            }
        }
        System.out.println("-".repeat(150));
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        System.out.println();
        System.out.println("-".repeat(150));
    }

    public void stop(){
        plantPool.shutdown();
        animalPool.shutdown();
        statsPool.shutdown();
    }

}
