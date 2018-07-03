public class Runner {

    public static void main(String[] args) {


        List l = new List();

        Item b1 = new Book(12, "red", "comedy");
        Item b2 = new Book(14, "blue", "action");
        Item n1 = new Newspaper(16, 4555, 34);
        Item n2 = new Newspaper(18, 4556, 36);


        l.addItem(b1);
        l.addItem(b2);
        l.addItem(n1);
        l.addItem(n2);
        System.out.println(l);


    }



}
