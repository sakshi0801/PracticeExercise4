/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test if the given input is sorted and return the list of words
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringTest {

    private static SortString ss;

    @BeforeClass
    public static void setup(){
        ss=new SortString();
    }

    @AfterClass
    public static void teardown(){
        ss=null;
    }
    @Test
    public void showSortedResultTest()
    {
        String input="this is to be sorted";
        String[] output={"be","is","sorted","this","to"};
        assertArrayEquals(output,ss.sortString(input));
    }

    @Test
    public void showSortedResultNegativeTest()
    {
        String input="this is to be sorted";
        String[] output={"be","is","this","to"};
        assertNotEquals(output,ss.sortString(input));
    }

    @Test
    public void nullInputStringTest()
    {
        assertArrayEquals(null,ss.sortString(null));
    }

    @Test
    public void nullInputStringNegativeTest()
    {
        assertNotEquals("hello",ss.sortString(null));
    }

    @Test
    public void inputDigitTest()
    {
        String[] output={"12","is","time"};
        assertArrayEquals(output,ss.sortString("time is 12"));
    }

    @Test
    public void inputDigitNegativeTest()
    {
        String[] output={"12","time"};
        assertNotEquals(output,ss.sortString("time is 12"));
    }
}