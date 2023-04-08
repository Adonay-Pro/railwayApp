package railwayapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        List<RailwayStations> railwayStation = new ArrayList<>(); //Creating railway stations
        railwayStation.add(new RailwayStations(50,30, "A"));
        railwayStation.add(new RailwayStations(40,80, "B"));
        railwayStation.add(new RailwayStations(30,100, "C"));


        PassengerRailroadCar passengerRailroadCar = new PassengerRailroadCar(54, 150);
        HeavyFreightCar heavyFreightCar = new HeavyFreightCar(65.5, 100.2);

        Loading<>





    //MyRunnable myRunnable = new MyRunnable(); // Based on this myRunnable we can create a few threads
    //Thread thread = new Thread(myRunnable);


    }

    //Esto es para la generacion del App.txt con el FileOutputStream
      /*  FileInputStream fis = null;
        FileOutputStream fos = null;

        try{

            fis = new FileInputStream("file.txt");
            fos = new FileOutputStream("AppState.txt");

            int c;

            while((c = fis.read()) != -1){  //el metodo read devolvera un -1
                System.out.print((char)c);
                fos.write(c);
                fos.write(' ');
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fis != null)
                fis.close();
            if(fos != null)
                fos.close();
        }
*/







}
