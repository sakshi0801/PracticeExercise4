/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to test the number of occurance of the matching character in given input
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceTest {

    private static Occurance oc;

    @BeforeClass
    public static void setup()
    {
        oc=new Occurance();
    }

    @AfterClass
    public static void teardown()
    {
        oc=null;
    }

    @Test
    public void numberOfTimesAOccur(){
        String input="Java is java again java again";
        assertEquals(10,oc.findCharacterOccurance(input,'a'));
    }

    @Test
    public void numberOfTimesAOccurNegative(){
        String input="Java is java again java again";
        assertNotEquals(6,oc.findCharacterOccurance(input,'a'));
    }

    @Test
    public void nullInputString(){
        String input=null;
        assertEquals(0,oc.findCharacterOccurance(input,'a'));
    }

    @Test
    public void nullInputStringNegative(){
        String input=null;
        assertNotEquals(6,oc.findCharacterOccurance(input,'a'));
    }
}