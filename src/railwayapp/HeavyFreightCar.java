package railwayapp;

public class HeavyFreightCar implements Railroad {
    public static int cont=0;
    int id;
    double height, length, Capacity; //have a capacity of up to 125 tons or more, compared to the typical 70-ton capacity of a standard boxcar.
    /*For example, some heavy-duty flatcars used for transporting steel coils or other heavy industrial goods can be up to 89 feet long and have a height of around 9 feet, while some specialized heavy-duty gondola cars used for
    transporting bulk commodities such as coal or grain can be up to 52 feet long and have a height of around 12 feet.
     */

    public HeavyFreightCar(double length, double capacity){
        this.length = length;
        this.Capacity = capacity;
        cont++;
        this.id = cont;
    }

    @Override
    public boolean electricalGrid() {
        return false;
    }
}
