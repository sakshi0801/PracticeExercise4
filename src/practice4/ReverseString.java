/**
 * Created by Sakshi
 * date- 16/05/19
 * This program is used to transpose the given input
 */

public class ReverseString {

    public String reverseWords(String input){

        //if input is null then return null
        if(input==null)
        {
            return null;
        }
        else {
            //split input by " "
            String[] arr=input.split(" ");
            String result="";

            //iterate every element in array
            for(int i=0;i<arr.length;i++)
            {
                result="";
                //reverse every string in array
                for (int j=arr[i].length()-1;j>=0;j--)
                {
                    result+=arr[i].charAt(j);
                }
                arr[i]=result;
            }
            String output="";

            //convert array into string
            for (int i=0;i<arr.length;i++)
            {
                output+=arr[i]+" ";
            }
            return output.trim();
        }
    }
}