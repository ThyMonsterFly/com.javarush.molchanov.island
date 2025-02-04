package utilities;

import entities.Island;
import entities.Location;

import java.util.List;

public class AnimalTask implements Runnable{

    public List<List<Location>> locations;

    public AnimalTask (Island island){
        locations = island.getLocations();
    }

    @Override
    public void run() {
        for (List<Location> row : locations) {
            for (Location location : row) {
                location.updateAnimals();
            }
        }
    }
}
