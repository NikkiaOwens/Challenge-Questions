import Sorting.Flower;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlowerTest {

    Flower flower = new Flower();

    @Test
    public void sortTest() {
        //Given
        String[] numberArray = {"1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "9", "15"};
        //When
        flower.sort(numberArray);

        //Then
        assertArrayEquals(expected, numberArray);
    }

    @Test
    public void sortSingleDigitsTest() {
        //Given
        String[] numberArray = {"3", "1", "5", "4"};
        String[] expected = {"1", "3", "4", "5"};
        //When
        flower.sort(numberArray);

        //Then
        assertArrayEquals(expected, numberArray);
    }

    @Test
    public void sortBiggerNumbers() {
        //Given
        String[] numberArray = {"3", "1", "123", "5", "4"};
        String[] expected = {"1", "3", "4", "5", "123"};
        //When
        flower.sort(numberArray);

        //Then
        assertArrayEquals(expected, numberArray);
    }

//    @Test
//    public void sortDecimalTest() {
//        //Given
//        String[] numberArray = {"3", "1", "123", "5", "4.0"};
//        String[] expected = {"1", "3", "4.0", "5", "123"};
//        //When
//        flower.sort(numberArray);
//
//        //Then
//        assertArrayEquals(expected, numberArray);
//    }

    @Test
    public void sortZeroTest() {
        //Given
        String[] numberArray = {"3", "1", "123", "5", "0"};
        String[] expected = {"0", "1", "3", "5", "123"};
        //When
        flower.sort(numberArray);

        //Then
        assertArrayEquals(expected, numberArray);
    }

//    @Test
//    public void sortNullTest() {
//        //Given
//        String[] numberArray = {"3", "1", "123", "5", null};
//        String[] expected = {null, "1", "3", "5", "123"};
//        //When
//        flower.sort(numberArray);
//
//        //Then
//        assertArrayEquals(expected, numberArray);
//    }

//    @Test
//    public void sortLeadingZeroTest() {
//        //Given
//        String[] numberArray = {"3", "1", "123", "5", "0001"};
//        String[] expected = {"0001", "1", "3", "5", "123"};
//        //When
//        flower.sort(numberArray);
//
//        //Then
//        assertArrayEquals(expected, numberArray);
//    }

    @Test
    public void firstIsBiggerTest() {
        //Given
        String[] elementArray = {"1", "20"};
        //Then
        assertFalse(flower.firstIsBigger(elementArray[0], elementArray[1]));

    }

    @Test
    public void firstIsBiggerTest2() {
        //Given
        String[] elementArray = {"22", "20"};
        //Then
        assertTrue(flower.firstIsBigger(elementArray[0], elementArray[1]));

    }

    @Test
    public void firstIsBiggerTest3() {
        //Given
        String[] elementArray = {"20", "1"};
        //Then
        assertTrue(flower.firstIsBigger(elementArray[0], elementArray[1]));
    }

    @Test
    public void firstIsBiggerTest4() {
        //Given
        String[] elementArray = {"20", "22"};
        //Then
        assertFalse(flower.firstIsBigger(elementArray[0], elementArray[1]));

    }

}


