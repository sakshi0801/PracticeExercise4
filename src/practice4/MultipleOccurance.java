/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to find every index where the matching string is present in given input
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public String[] findMultiOccur(String input,String search)
    {
        // if input or the search string is null then it returns null
        if(input==null||search==null)
        {
            return null;
        }
        else {
            //create pattern object using compile method for regex
            Pattern p=Pattern.compile(search);
            //create matcher object and passing input string
            Matcher m=p.matcher(input);
            int count=0;

            //counting number of times the matcher finds the search string
            while (m.find())
            {
                count++;
            }
            String[] output=new String[count];
            int index=0;
            // passing input string in matcher object
            m=p.matcher(input);
            boolean b=false;

            //gives the index of search string
            while (m.find())
            {
                output[index]="found at "+m.start()+" - "+m.end();
                index++;
                b=true;
            }
            if(!b)
            {
                output[index]="not found";
            }
            return output;
        }
    }
}
