/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test if 'd' is replaced with 'f' and 'l' is replaced with 't' in given input
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {

    ReplaceString rs=new ReplaceString();

    @Test
    public void showReplacedString()
    {
        String input="daily dry";
        assertEquals("faity fry",rs.replaceCharacters(input));
    }

    @Test
    public void nullInputString()
    {
        String input=null;
        assertEquals(null,rs.replaceCharacters(input));
    }
    @Test
    public void showReplacedStringNegative()
    {
        String input="daily dry";
        assertNotEquals("daity dry",rs.replaceCharacters(input));
    }

    @Test
    public void nullInputStringNegative()
    {
        String input=null;
        assertNotEquals("a",rs.replaceCharacters(input));
    }
}