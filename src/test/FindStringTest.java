/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test whether a search string can be found in given input string
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class FindStringTest {

    FindString fs=new FindString();

    @Test
    public void stringFound()
    {
        assertEquals(true,fs.findCharacters("This is harry","harry"));
    }

    @Test
    public void stringNotFound()
    {
        assertNotEquals(true,fs.findCharacters("This is harry","henry"));
    }

    @Test
    public void searchNullString()
    {
        assertEquals(false,fs.findCharacters("This is harry",null));
    }

    @Test
    public void searchNullStringNegative()
    {
        assertNotEquals(true,fs.findCharacters("This is harry",null));
    }

    @Test
    public void inputNullString()
    {
        assertEquals(false,fs.findCharacters(null,"harry"));
    }

    @Test
    public void inputNullStringNegative()
    {
        assertNotEquals(true,fs.findCharacters(null,"harry"));
    }
}