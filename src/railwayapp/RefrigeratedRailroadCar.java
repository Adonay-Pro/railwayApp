package railwayapp;

public class RefrigeratedRailroadCar extends BasicRailroadFreightCar implements Railroad {

    String productTransported="";
    Double temperatureRecommended;
    /*ecommends that fresh beef, pork, lamb, and veal be transported at a temperature of 40°F (4.4°C) or below.
    For frozen meat, the recommended temperature is 0°F (-17.8°C) or below. */

    public RefrigeratedRailroadCar(double capacity, int slidingDoors, String productTransported, double temperatureRecommended ) {
        super(capacity, slidingDoors);
        this.productTransported = productTransported;
        this.temperatureRecommended  =temperatureRecommended;
    }

    @Override
    public boolean electricalGrid(){
        return true;
    }


}
