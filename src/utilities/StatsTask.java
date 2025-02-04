package utilities;

import entities.Animal;
import entities.Island;
import entities.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatsTask implements Runnable{

    public List<List<Location>> locations;

    public StatsTask (Island island){
        locations = island.getLocations();
    }

    @Override
    public void run() {
        Map<String, Integer> statistics = new HashMap<>();
        for (List<Location> row : locations) {
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
}
