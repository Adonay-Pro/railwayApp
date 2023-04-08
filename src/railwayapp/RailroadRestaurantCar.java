package railwayapp;

public class RailroadRestaurantCar implements Railroad {


    int tables, eatingPeople; //12 tables with each table typically seating four chairs = 48 passengers but this can be xtended

    public RailroadRestaurantCar(int tables, int eatingPeople) {
        this.tables = tables;
        this.eatingPeople = eatingPeople;
    }

    @Override
    public boolean electricalGrid() {
        return true;
    }
}
