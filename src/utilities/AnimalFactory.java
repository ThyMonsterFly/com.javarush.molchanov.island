package utilities;

import entities.carnivoreAnimal.*;
import entities.herbivoreAnimal.*;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalFactory {

    public int j = 0;

    public ArrayList populate (){

        ArrayList animals = new ArrayList();
        j = ThreadLocalRandom.current().nextInt(0, Settings.wolfMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Wolf());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.boaMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Boa());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.foxMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Fox());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.bearMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Bear());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.eagleMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Eagle());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.horseMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Horse());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.deerMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Deer());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.rabbitMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Rabbit());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.mouseMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Mouse());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.goatMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Goat());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.sheepMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Sheep());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.boarMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Boar());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.buffaloMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Buffalo());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.duckMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Duck());
        }
        j = ThreadLocalRandom.current().nextInt(0, Settings.caterpillarMaxCellCount);
        for (int i = 0; i < j; i++) {
            animals.add(new Caterpillar());
        }
        return animals;
    };

}
