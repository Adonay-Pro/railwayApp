package railwayapp;

public class RailroadLiquidToxicMaterial extends HeavyFreightCar implements Railroad {


    String materialTransported, securityMechanism;//pressure relief valves, emergency shutoff valves, and other safety features to prevent accidents.

    public RailroadLiquidToxicMaterial(double length, double capacity, String materialTransported, String securityMechanism) {
        super(length, capacity);
        this.securityMechanism = securityMechanism;
        this.materialTransported = materialTransported;
    }

}
