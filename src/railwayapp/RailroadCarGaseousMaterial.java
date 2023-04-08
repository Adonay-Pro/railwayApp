package railwayapp;

public class RailroadCarGaseousMaterial extends BasicRailroadFreightCar implements Railroad {

    private String gasTransported; //gases such as liquefied petroleum gas (LPG), ammonia, and chlorine
    private double pressureRating;//(LPG) typically around 250 psi, Anhydrous ammonia around 265 psi, Chlorine tank around 100 psi,

    public RailroadCarGaseousMaterial(double capacity, int slidingDoors, String gasTransported, double pressureRating) {
        super(capacity, slidingDoors);
        this.gasTransported = gasTransported;
        this.pressureRating = pressureRating;
    }

    @Override
    public boolean electricalGrid(){
        return false;
    }

}
