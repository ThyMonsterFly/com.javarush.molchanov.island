package entities;

import utilities.Util;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

public class Plant {

    private int biomass;
    private Location location;
    private int maxCellCount;
    private ReentrantLock lock = new ReentrantLock();

    public Plant(Location location) {
        this.location = location;
        this.maxCellCount = Util.getIntParam(this, "MaxCellCount");
        this.biomass = ThreadLocalRandom.current().nextInt(maxCellCount);
    }

    public void grow() {
        biomass += ThreadLocalRandom.current().nextInt((maxCellCount-this.getBiomass()));
    }

    public int getBiomass() {
        return biomass;
    }

    public void consume(int amount) {
        try{
            lock.lock();
            biomass -= amount;
            if (biomass <= 0) {
                biomass = 0;
            }
        }
        finally {
            lock.unlock();
        }

    }

}
