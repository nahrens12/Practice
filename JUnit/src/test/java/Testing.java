import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import org.junit.ignore;
//import static junit.



public class Testing {



       BlackJack blackJa = new BlackJack();
       UniqueSum uniquesum = new UniqueSum();
       TooHot toohot = new TooHot();

    @Test
    public void testBlackJack()
    {


        assertEquals(20, blackJa.BlackJack(20,15));
        assertEquals(18, blackJa.BlackJack(18, 10));

    }


    @Test
    public void testUniqueSum()

    {

        assertEquals(0, uniquesum.UniqueSum(2,1,3));
        assertEquals(3, uniquesum.UniqueSum(2,2,3));
        assertEquals(0, uniquesum.UniqueSum(3,3,3));
        assertEquals(3, uniquesum.UniqueSum(2,3,2));
    }

    @Test
    public void testTooHot(){
        assertEquals(false, toohot.tooHot(60, true));
        assertEquals(false, toohot.tooHot(100, true));
    }








}