import org.junit.Assert;
import org.junit.Test;

public class TwoPointerTechniqueTest {
    public TwoPointerTechnique twoPointerTechnique = new TwoPointerTechnique();
    @Test
    public void testTwoSum(){
        //Given
        int targetSum = 5;
        int[] givenArr = {1,2,3,4,5,6};
        int[] expected = {2,3};
        //When
        int[] actual = twoPointerTechnique.twoSum(givenArr,targetSum);
        //Then
        Assert.assertEquals(expected,actual);
    }
}
