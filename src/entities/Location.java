package entities;

import utilities.AnimalFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Location {

    private int x;
    private int y;
    private Island island;
    private ReentrantLock lock = new ReentrantLock();
    private CopyOnWriteArrayList<Animal> animals = new CopyOnWriteArrayList<>();
    private Plant plant;

    public Location(Island island, int x, int y) {
        AnimalFactory animalFactory = new AnimalFactory();
        this.island = island;
        this.x = x;
        this.y = y;
        animals = animalFactory.populate(this);
        plant = new Plant(this);
    }

    public void addAnimal(Animal animal) {
        try {
            lock.lock();
            animals.add(animal);
        } finally {
            lock.unlock();
        }
    }

    public void removeAnimal(Animal animal) {
        try {
            lock.lock();
            animals.remove(animal);
        } finally {
            lock.unlock();
        }
    }

    public CopyOnWriteArrayList<Animal> getAnimals() {
        try {
            lock.lock();
            return new CopyOnWriteArrayList<>(animals);
        } finally {
            lock.unlock();
        }
    }

    public Plant getPlant() {
        return plant;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Island getIsland(){
        return island;
    }

    public void growPlants() {
       plant.grow();
    }

    public synchronized void updateAnimals() {
        for (Animal animal : animals) {
            animal.cycle();
        }
    }

}
