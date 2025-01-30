
import utilities.Settings;
import utilities.Simulation;

import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {

        Simulation simulation = new Simulation();
        simulation.start();
        try {
            Thread.sleep(Settings.lifetime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            simulation.stop();
        }

    }

}
