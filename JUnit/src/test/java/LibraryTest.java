import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {


    @Test
    public void checkOutTest()
    {
        Book b1 = new Book();
        Member m1 = new Member();
        //m1.booklist.add(b1);
        m1.checkOut(b1);
        assertEquals(1, m1.list.size());
    }

    @Test
    public void checkInTest()

    {

        Book b1 = new Book();
        Member m1 = new Member();
        m1.checkIn(b1);
        assertEquals(1, m1.list.size());
    }

    @Test
    public void addItemTest(){
       // 4 item to be stored in the Library
        Book b1 = new Book();
        Book b2 = new Book();
        Newspaper n1 = new Newspaper();
        Newspaper n2 = new Newspaper();

        //Library List currently empty
        Library list = new Library();

        //Add first item to the library
        libraryList.addItem(b1);


    }

    @Test
    public void removeItemTest(){
        //my library has a list
        // 4 items in it
        // i have to create 4 things then add them
        // remove item
        //so there should be 3

        //New library created
        Library libraryList = new Library();

        //items to store in the library
        Book b1 = new Book();
        Book b2 = new Book();
        Newspaper n1 = new Newspaper();
        Newspaper n2 = new Newspaper();

        //Where the items are stored
        libraryList.list.size();


        //removing item from the library
        libraryList.removeItem(b1);

    }


    @Test
    public void updateItemTest(){
        // items updated in the library list 
    }

}

