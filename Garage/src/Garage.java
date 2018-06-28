import java.util.ArrayList;

public class Garage {

   static ArrayList<Vehicle> Ve;


    public Garage() {


        Ve = new ArrayList<>();
        Ve.add(new Car(2006, "audi", "a3", 1.6));
        Ve.add(new Car(2011, "bmw", "m5", 2.2));
        Ve.add(new Motorcycle(2007, "yamaha", "class" ));
        Ve.add(new Motorcycle(2018, "yamaha", "class" ));
        Ve.add(new Trucks(2001, "BMW", "M3"));
    }

    public  static void chargeVe()

    {
        int j = 0;
        for (int i = 0; i < Ve.size(); i++) {


            if (Ve.get(i).getClass().getSimpleName() == "Car") {
                System.out.println(300);
            } else if (Ve.get(i).getClass().getSimpleName() == "Motorcycle") {
                System.out.print(150);
            } else if (Ve.get(i).getClass().getSimpleName() == "Truck") {
                System.out.println(500);
            } else {
                System.out.println(0);
            }

        }

    }





}
