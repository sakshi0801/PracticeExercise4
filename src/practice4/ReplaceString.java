/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to replace 'd' with 'f' and 'l' with 't' in given input
 */

public class ReplaceString {

    public String replaceCharacters(String input)
    {
        //if input is null then return null
        if(input==null)
        {
            return null;
        }
        else {
            //replace d with f
            String result=input.replace('d','f');
            //replace l with t
            result=result.replace('l','t');
            return result;
        }
    }
}
