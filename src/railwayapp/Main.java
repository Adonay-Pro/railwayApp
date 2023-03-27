package railwayapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

    HeavyFreightCar freightCar = new HeavyFreightCar("Siemens", "Juwentus", 25.8, 40, 25, 2.5, 60);
    RailroadExplosives freightCar1 = new RailroadExplosives("Huawei", "Global", 30.5, 55.6, 35, 4.5, 150);
    RailRoadCars<HeavyFreightCar> railRoadCars = new RailRoadCars<>(freightCar);
    RailRoadCars<HeavyFreightCar> railRoadCars1 = new RailRoadCars<>(freightCar1);

        System.out.println(freightCar);
        System.out.println(freightCar1);

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
