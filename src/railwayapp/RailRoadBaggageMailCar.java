package railwayapp;

public class RailRoadBaggageMailCar implements Railroad {


    int doorsLoadUnloading, Mailcapacity; //depending but could be at least 2 by side. Capacity 30,000 -150,000 pounds of mail
    public RailRoadBaggageMailCar(int doorsLoadUnloading, int Mailcapacity) {
        this.doorsLoadUnloading = doorsLoadUnloading;
        this.Mailcapacity = Mailcapacity;
    }

    @Override
    public boolean electricalGrid() {
        return false;
    }
}
