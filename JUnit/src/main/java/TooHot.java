public class TooHot {

    public boolean tooHot(int a, boolean isSummer)
    {
        int temperature = a;

        if(isSummer == true){
             return temperature > 60 && temperature < 100;

        }
            else{
            return temperature > 60 && temperature <90;

        }
    }
}
