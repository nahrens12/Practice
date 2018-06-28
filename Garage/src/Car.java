public class Car extends Vehicle {

double engineSize;

    public Car(int regNo, String make, String model, double engineSize) {

        super( make, model, regNo);

        this.engineSize = engineSize;
        this.setMake(make);

    }







}


