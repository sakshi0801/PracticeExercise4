/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test whether a search string can be found in given input string
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindStringTest {

    private static FindString fs;
    @BeforeClass
    public static void setup() {
        fs=new FindString();
    }

    @AfterClass
    public static void teardown(){
        fs=null;
    }


    @Test
    public void findCharacters_GivenInputStringSearchString_ReturnTrue()
    {
        assertEquals(true,fs.findCharacters("This is harry","harry"));
    }

    @Test
    public void findCharacters_GivenInputStringSearchString_ReturnTrueFailure()
    {
        assertNotEquals(true,fs.findCharacters("This is harry","henry"));
    }

    @Test
    public void findCharacters_GivenInputStringSearchNull_ReturnFalse()
    {
        assertEquals(false,fs.findCharacters("This is harry",null));
    }

    @Test
    public void findCharacters_GivenInputStringSearchNull_ReturnFalseFailure()
    {
        assertNotEquals(true,fs.findCharacters("This is harry",null));
    }

    @Test
    public void findCharacters_GivenInputNullStringSearchstring_ReturnFalse()
    {
        assertEquals(false,fs.findCharacters(null,"harry"));
    }

    @Test
    public void findCharacters_GivenInputNullStringSearchstring_ReturnFalseFailure()
    {
        assertNotEquals(true,fs.findCharacters(null,"harry"));
    }
}