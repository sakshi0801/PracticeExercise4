/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to find the number of occurance of the matching character in given input
 */

public class Occurance {

    public int findCharacterOccurance(String input,char reg){

        if(input==null)
        {
            return 0;
        }
        else {
            //replace the character with empty value
            String result=input.replaceAll(reg+"","");
            int count=0;
            //compare length to compute number of occurance
            count=(input.length()-result.length());
            return count;
        }
    }
}
