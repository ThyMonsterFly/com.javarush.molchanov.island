package utilities;

import entities.Animal;

public class Util {

    public static int getIntParam (Animal animal, String attribute){
        try {
            return (int)Settings.class.getField(animal.getClass().getSimpleName().toLowerCase() + attribute).get(animal);
        } catch (Exception e) {
            System.out.println("-".repeat(50));
            System.out.println("getIntParam malfunction!");
            System.out.println("-".repeat(50));
            e.printStackTrace();
            return 0;
        }
    }

}
