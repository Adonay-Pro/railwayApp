package railwayapp;

public class RailroadCarLiquidMaterials extends BasicRailroadFreightCar implements Railroad {

    double tankCapacity;
    String materialTransported;

    public RailroadCarLiquidMaterials(double capacity, int slidingDoors, double tankCapacity, String materialTransported ){
        super(capacity,slidingDoors);
        this.materialTransported = materialTransported;
        this.tankCapacity = tankCapacity;

    }

    @Override
    public boolean electricalGrid(){
        return false;
    }


}
