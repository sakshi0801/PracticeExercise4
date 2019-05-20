/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test every index where the matching string is present in given input
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {
    private static MultipleOccurance mo;

    @BeforeClass
    public static void setup() {
        mo=new MultipleOccurance();
    }
    @AfterClass
    public static void teardown() {
        mo=null;
    }

    @Test
    public void searchMulti()
    {
        String input="she sells seashells by the seashore";
        String search="se";
        String[] output={"found at 4 - 6","found at 10 - 12","found at 27 - 29"};
        assertArrayEquals(output,mo.findMultiOccur(input,search));
    }

    @Test
    public void searchMultiNegative()
    {
        String input="she sells seashells by the seashore";
        String search="se";
        String[] output={"found at 0 - 3","found at 10 - 12","found at 27 - 29"};
        assertNotEquals(output,mo.findMultiOccur(input,search));
    }

    @Test
    public void nullInputString()
    {
        assertArrayEquals(null,mo.findMultiOccur(null,"a"));
    }

    @Test
    public void nullInputStringNegative()
    {
        String[] output={"found at 0 - 5"};
        assertNotEquals(output,mo.findMultiOccur(null,"a"));
    }

    @Test
    public void searchNullString()
    {
        assertArrayEquals(null,mo.findMultiOccur("Here is the text",null));
    }

    @Test
    public void searchNullStringNegative()
    {
        String[] output={"found at 0 - 0"};
        assertNotEquals(output,mo.findMultiOccur("Here is the text",null));
    }
}