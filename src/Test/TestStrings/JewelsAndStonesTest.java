package TestStrings;

import StringRelatedProblems.JewelsAndStones;
import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    JewelsAndStones jewelsAndStones =  new JewelsAndStones();


    @Test
    public void SolutionTest(){

        //Given
        String jewelsInput = "Aa";
        String stonesInput = "aaAAbbBB";
        int expected = 4;

        //When
        int actual = jewelsAndStones.Solution(jewelsInput, stonesInput);

        //Then

        Assert.assertEquals(expected, actual);

    }
}
