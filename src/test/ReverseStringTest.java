/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test if the given input is transposed
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString rs=new ReverseString();

    @Test
    public void showReverseString()
    {
        String input="a quick brown fox jumps over the lazy dog";
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",rs.reverseWords(input));
    }

    @Test
    public void showReverseStringNegative()
    {
        String input="a quick brown fox jumps over the lazy dog";
        assertNotEquals("a quick brown fox jumps over the lazy dog",rs.reverseWords(input));
    }

    @Test
    public void nullInputString()
    {
        assertEquals(null,rs.reverseWords(null));
    }

    @Test
    public void nullInputStringNegative()
    {
        assertNotEquals(" ",rs.reverseWords(null));
    }
}