package entities;

import utilities.Directions;
import utilities.Util;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {


    public boolean mated = false;
    public boolean isAlive = true;

    public int weight;
    public int maxCellCount;
    public int speed;
    public int saturation;

    public Animal() {
        try {
            this.weight = Util.getIntParam(this, "Weight");
            this.maxCellCount = Util.getIntParam(this,"MaxCellCount");
            this.speed = Util.getIntParam(this,"Speed");
            this.saturation = Util.getIntParam(this, "Saturation");
        } catch (Exception e) {
            System.out.println("-".repeat(50));
            System.out.println("Animal constructor malfunction!");
            System.out.println("-".repeat(50));
            e.printStackTrace();
        }
    }

    public synchronized void eat (ArrayList<Animal> cellResidents){
        ThreadLocalRandom.current().nextInt(0, cellResidents.size()-1);
    };

    public void mate (ArrayList cellResidents){

    }

    public void move (Directions direction){

    }

}
