package railwayapp;

public class HeavyFreightCar{
    public static int cont=0;
    String shipper, securityInformation;
    double netWeight, grossWeight, length, height;
    int numberOfSeats, id;

    public HeavyFreightCar(String shipper, String security, double netWeight, double grossWeight, double length, double height, int numberOfSeats){
        this.shipper = shipper;
        this.securityInformation = security;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
        this.length = length;
        this.height = height;
        this.numberOfSeats = numberOfSeats;
        cont++;
        this.id = cont;
    }

    @Override
    public String toString() {
        return "HeavyFreightCar{" +
                "shipper='" + shipper + '\'' +
                ", netWeight=" + netWeight +
                ", grossWeight=" + grossWeight +
                ", numberOfSeats=" + numberOfSeats +
                ", id=" + id +
                '}';
    }
}
