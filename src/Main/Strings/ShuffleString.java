package Strings;

/**
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the
 * ith position moves to indices[i] in the shuffled string.
 *
 */

// ex. input:  s h f i
// ex. output: 3 2 0 1

public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        String result = "";
        String[] arr = new String[s.length()];

        /* for loop to populate an ordered array of strings based on
            the indices, making a substring to put in arr
        */
        for(int i = 0; i < s.length(); i++){
            //if(indices[i]);
            int k = indices[i];
            arr[k] = s.substring(i,i+1);
        }

        /* for each loop to go through arr of strings
        and add to result string
        */
        for(String string: arr){
            result += string;
        }
        return result;
    }
}


