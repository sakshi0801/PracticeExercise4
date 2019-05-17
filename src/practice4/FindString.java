/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to find a string from given input
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindString {

    public boolean findCharacters(String input,String search)
    {
        //if input or search string is null then return null
        if(input==null||search==null)
        {
            return false;
        }
        else {
            //create pattern object using compile method for regex
            Pattern p=Pattern.compile(search);
            //create matcher object and passing input string
            Matcher m=p.matcher(input);

            boolean b=false;

            //if matcher.find() is true then search is successful
            while (m.find())
            {
                b=true;
            }
            return b;
        }
    }
}
