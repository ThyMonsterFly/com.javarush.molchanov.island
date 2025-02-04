package utilities;

import entities.Island;
import entities.Location;

import java.util.List;

public class PlantTask implements Runnable{

    public List<List<Location>> locations;

    public PlantTask (Island island){
        locations = island.getLocations();
    }

    @Override
    public void run() {
        for (List<Location> row : locations) {
            for (Location location : row) {
                location.growPlants();
            }
        }
    }
}
