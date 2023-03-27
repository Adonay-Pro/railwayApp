package railwayapp;

import java.util.ArrayList;

public class RailRoadCars <T> {

    ArrayList<RailRoadCars> railRoadCars = new ArrayList<RailRoadCars>();



    private T railRoadCar;

    public RailRoadCars(T railRoadCar){
        this.railRoadCar = railRoadCar;
    }

    public T getRailRoadCar(){
        return railRoadCar;
    }

    public void setRailRoadCar(T railRoadCar){
        this.railRoadCar = railRoadCar;
    }

    @Override
    public String toString() {
        return "RailRoadCars -> " + railRoadCar;

    }
}
