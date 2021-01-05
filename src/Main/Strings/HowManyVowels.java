package Strings;

public class HowManyVowels {

    /**
     * Given a String
     * Return a long
     * Return how many vowels are in the given string
     * Can use multiple methods
     *y is not a vowel
     */



    public Long countVowels(String input){
        String vowels = "aeiou";
        Long count = 0L;

        for (int i = 0; i < input.length(); i++) {
            if(vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
