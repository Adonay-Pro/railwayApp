package railwayapp;


import java.util.Random;

public class Locomotive implements locomotiveBounds {

    String name, homeRailwayStation, source, destinationRailwayStation;
     private int id;
     static int speed = 200;
     private static int countLocomotive =0;


public Locomotive(String name, String homeRailwayStation, String source, String destinationRailwayStation){
    this.name = name;
    this.homeRailwayStation = homeRailwayStation;
    this. source = source;
    this.destinationRailwayStation = destinationRailwayStation;
    id = this.countLocomotive++;
}

    public void speedLocomotive(){
        Random velocity = new Random();
        double result = velocity.nextDouble(speed) + 1;
        System.out.println(result);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double velocityfin = (result * 0.03) + result;
        System.out.println(velocityfin);
    }


    @Override
    public String toString() {
        return "Locomotive{" + name + '\'' +
                ", homeRailwayStation='" + homeRailwayStation + '\'' +
                ", source='" + source + '\'' +
                ", destinationRailwayStation='" + destinationRailwayStation + '\'' +
                ", id=" + id +
                '}';
    }
}
