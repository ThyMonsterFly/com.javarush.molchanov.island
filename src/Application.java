import entities.carnivoreAnimal.Wolf;

public class Application {

    public static void main(String[] args) {

        Wolf wlf = new Wolf();
        System.out.println(wlf.getClass().getSimpleName());
        System.out.println("Weight - " + wlf.weight);
        System.out.println("MaxCellCount - " + wlf.maxCellCount);
        System.out.println("Speed - " + wlf.speed);
        System.out.println("Saturation - " + wlf.saturation);

    }
}
