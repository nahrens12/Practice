public abstract class Vehicle {


    private int regNo;
    private  String make;
        private String model;

    public Vehicle(String make, String model, int regNo) {

        this.regNo = regNo;
        this.make = make;
        this.model = model;


    }


    public Vehicle() {

    }

    public void setMake(String make) {
        this.make = make;

    }

    public void setRegNo() {
        this.regNo = regNo;
    }

    public void setModel() {

        this.model = model;
    }

    public String getModel()

    {
        return model;

    }

    //public String toString() {
    //  return "Vehicle{}";
    //}

    public int getRegNo() {
        return regNo;
    }


    public String getMake() {
        return make;
    }



    }





