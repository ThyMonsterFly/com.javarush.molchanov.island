package entities.carnivoreAnimal;

import entities.Animal;
import utilities.Util;

public class Carnivore extends Animal {

    public int EatWolfProbability;
    public int EatBoaProbability;
    public int EatFoxProbability;
    public int EatBearProbability;
    public int EatEagleProbability;
    public int EatHorseProbability;
    public int EatDeerProbability;
    public int EatRabbitProbability;
    public int EatMouseProbability;
    public int EatGoatProbability;
    public int EatSheepProbability;
    public int EatBoarProbability;
    public int EatBuffaloProbability;
    public int EatDuckProbability;
    public int EatCaterpillarProbability;

    public Carnivore(){
        super();
            EatWolfProbability = Util.getIntParam(this, "EatWolfProbability");
            EatBoaProbability = Util.getIntParam(this, "EatBoaProbability");
            EatFoxProbability = Util.getIntParam(this, "EatFoxProbability");
            EatBearProbability = Util.getIntParam(this, "EatBearProbability");
            EatEagleProbability = Util.getIntParam(this, "EatEagleProbability");
            EatHorseProbability = Util.getIntParam(this, "EatHorseProbability");
            EatDeerProbability = Util.getIntParam(this, "EatDeerProbability");
            EatRabbitProbability = Util.getIntParam(this, "EatRabbitProbability");
            EatMouseProbability = Util.getIntParam(this, "EatMouseProbability");
            EatGoatProbability = Util.getIntParam(this, "EatGoatProbability");
            EatSheepProbability = Util.getIntParam(this, "EatSheepProbability");
            EatBoarProbability = Util.getIntParam(this, "EatBoarProbability");
            EatBuffaloProbability = Util.getIntParam(this, "EatBuffaloProbability");
            EatDuckProbability = Util.getIntParam(this, "EatDuckProbability");
            EatCaterpillarProbability = Util.getIntParam(this, "EatCaterpillarProbability");
    }

    public void eat() {

    }


}
