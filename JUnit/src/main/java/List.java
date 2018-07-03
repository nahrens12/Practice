import java.util.ArrayList;

public class List {

     static ArrayList<Item> itemLi = new ArrayList();

//    public static void main(String[] args) {
//
//
//        Item b1 = new Book(12, "red", "comedy");
//        Item b2 = new Book(14, "blue", "action" );
//        Item n1 = new Newspaper(16, 4555, 34);
//        Item n2 = new Newspaper(18, 4556, 36);
//
//
//        itemLi.add(b1);
//        itemLi.add(b2);
//        itemLi.add(n1);
//        itemLi.add(n2);
//
//    }

//    public static void addBook(int id, String colour, String genre){
//       //Item b1 = new Book(id, colour, genre);
//        itemLi.add(b1);
//
//    }

    public static void addItem(Item item) {
        itemLi.add(item);
    }

//    public static void addNewspaper(int id, int barcode, int issueNo){
//        Item n1 = new Newspaper(id, barcode, issueNo);
//        itemLi.add(n1);
//
//}

public static void removeItem(int id)
    {
        for(int i = 0; i<itemLi.size(); i++)
        {
            if(itemLi.get(i).getId() == id){
                itemLi.remove(i);

            }
        }

    }

@Override
    public String toString() {
    return "List" + itemLi;
}
}


//    public static void updateItem(int id)
//    {
//        for(int i = 0; i<itemLi.size(); i++) {
//            if(itemLi.get(i).id ==id){
//              itemLi.get(i).setName(name)
//          }
//
//        }
//        }








