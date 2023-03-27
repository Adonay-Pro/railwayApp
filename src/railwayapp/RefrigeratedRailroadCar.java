package railwayapp;

public class RefrigeratedRailroadCar extends BasicRailroadFreightCar{

    public RefrigeratedRailroadCar(String shipper, String security, double netWeight, double grossWeight, double length, double height, int numberOfSeats) {
        super(shipper, security, netWeight, grossWeight, length, height, numberOfSeats);
    }


    @Override
    public String toString() {
        return "RefrigeratedRailroadCar{" +
                "shipper='" + shipper + '\'' +
                ", netWeight=" + netWeight +
                ", grossWeight=" + grossWeight +
                ", numberOfSeats=" + numberOfSeats +
                ", id=" + id +
                '}';
    }
}
