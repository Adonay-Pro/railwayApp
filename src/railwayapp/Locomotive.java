package railwayapp;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Locomotive {

    int maxNumberRailroadCars;
    int maxWeightTransportedLoad;
    int maxRailroadsConnectedElectricityGrid;
    String name, homeRailwayStation, source, destinationRailwayStation;
    int id;
    static int speed = 380;

    public void speedLocomotive(){
        Random velocity = new Random();
        double result = velocity.nextDouble(380) + 1;
        System.out.println(result);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double velocityfin = (result * 0.03) + result;
    }

}
