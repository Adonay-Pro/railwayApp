package railwayapp;

public class BasicRailroadFreightCar implements Railroad {

    public static int cont=0;
    double capacity;//ranges from 70 to 100 tons.
    int  id, slidingDoors; /*Freight cars are equipped with large sliding doors on both sides of the car, which can be opened to load and unload cargo.
    Some boxcars may have additional doors on the ends of the car for easier loading and unloading.*/


    public BasicRailroadFreightCar(double capacity, int slidingDoors){
        this.capacity = capacity;
        this.slidingDoors = slidingDoors
        cont++;
        this.id = cont;
    }


    @Override
    public boolean electricalGrid() {
        return false;
    }
}
