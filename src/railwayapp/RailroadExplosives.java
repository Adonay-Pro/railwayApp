package railwayapp;

public class RailroadExplosives extends HeavyFreightCar implements Railroad {

    int pressureReliefValves;
    String materialMadeOf;

    public RailroadExplosives(double length, double capacity, int pressureReliefValves, String materialMadeOf) {
        super(length, capacity);
        this.pressureReliefValves = pressureReliefValves;
        this.materialMadeOf = materialMadeOf;
    }

}
