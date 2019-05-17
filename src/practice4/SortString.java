/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to sort the given input and return the list of words
 */
import java.util.Arrays;

public class SortString {

    public String[] sortString(String input)
    {
        //if input is null then return null
        if(input==null)
        {
            return null;
        }
        else {
            //split string by " "
            String[] arrInput=input.split(" ");
            //sort the string array
            Arrays.sort(arrInput);
            return arrInput;
        }
    }
}
