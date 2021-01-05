package TestStrings;

import StringRelatedProblems.HowManyVowels;
import org.junit.Assert;
import org.junit.Test;

public class HowManyVowelsTest {

    HowManyVowels howManyVowels =  new HowManyVowels();

    /**
     * When a string is inputted, should return how many vowels are in said string
     */
    @Test
    public void TestHowManyVowels(){
        //Given
        String input = "okay";
        Long expected = 2L;

        //When
        Long actual = howManyVowels.countVowels(input);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
