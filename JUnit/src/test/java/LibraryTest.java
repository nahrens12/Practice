import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {


    List l = new List();

//    @Test
//    public void checkOutTest()
//    {
//        Book b1 = new Book();
//        Member m1 = new Member();
//        //m1.booklist.add(b1);
//        m1.checkOut(b1);
//        assertEquals(1, m1.list.size());
//    }
//
//    @Test
//    public void checkInTest()
//
//    {
//
//        Book b1 = new Book();
//        Member m1 = new Member();
//        m1.checkIn(b1);
//        assertEquals(1, m1.list.size());
//    }

    @Test
    public void addItemTest(){
       // 4 item to be stored in the Library
        Item b1 = new Book(12, "red", "comedy");

        int size = List.itemLi.size();
        List.addItem(b1);
        //List.addItem(b2);
        //List.addItem(16, 4555, 34);
        assertEquals(List.itemLi.size(), size+1);

    }

    @Test
    public void removeItemTest(){
        //List.addBook(12, "red", "comedy");
        Item b2 = new Book(14, "blue", "action");
        List.addItem(b2);
        int size = List.itemLi.size();
      List.removeItem(14);
      assertEquals(List.itemLi.size(), size-1);

  }
//
//
//    @Test
//    public void updateItemTest(){
//
//      List.addBook(12, "red", "comedy");
//          List.updateItem(12);
//          assertEquals();
//    }

}



