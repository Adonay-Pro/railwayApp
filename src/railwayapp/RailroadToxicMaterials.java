package railwayapp;

public class RailroadToxicMaterials extends HeavyFreightCar{

    public RailroadToxicMaterials(String shipper, String security, double netWeight, double grossWeight, double length, double height, int numberOfSeats) {
        super(shipper, security, netWeight, grossWeight, length, height, numberOfSeats);
    }

    @Override
    public String toString() {
        return "RailroadToxicMaterials{" +
                "shipper='" + shipper + '\'' +
                ", netWeight=" + netWeight +
                ", grossWeight=" + grossWeight +
                ", numberOfSeats=" + numberOfSeats +
                ", id=" + id +
                '}';
    }
}
