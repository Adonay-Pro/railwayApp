package railwayapp;

public class RailroadExplosives extends HeavyFreightCar{
    public RailroadExplosives(String shipper, String security, double netWeight, double grossWeight, double length, double height, int numberOfSeats) {
        super(shipper, security, netWeight, grossWeight, length, height, numberOfSeats);
    }


    @Override
    public String toString() {
        return "RailroadExplosives{" +
                "shipper='" + shipper + '\'' +
                ", netWeight=" + netWeight +
                ", grossWeight=" + grossWeight +
                ", numberOfSeats=" + numberOfSeats +
                ", id=" + id +
                '}';
    }
}
