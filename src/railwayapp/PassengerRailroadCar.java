package railwayapp;

public class PassengerRailroadCar implements Railroad {

    private int numberOfSeats, quantityOfRestrooms;

    public PassengerRailroadCar(int numberOfSeats, int quantityOfRestrooms){
        this.numberOfSeats= numberOfSeats;
        this.quantityOfRestrooms = quantityOfRestrooms;
    }


    @Override
    public boolean electricalGrid(){
        return true;
    }
}
