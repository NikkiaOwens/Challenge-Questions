import java.util.Arrays;

public class Flower {
    /**
     * Given: an array of numbers as strings,
     * i.e., {"1", "5", "15", "9", "4"}
     * Task: sort the numbers
     * Restriction: the numbers must stay strings
     * - no converting to integers
     */
    //main method
    public void sort(String[] numbers) {
        String temp;
        // Sorting using a single loop
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                // Checking the condition for two
                // simultaneous elements of the array

                if(firstIsBigger(numbers[j], numbers[j+1])){
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }
        }
    }

    // sub methods

    public boolean firstIsBigger(String first, String second) {
        if(first.length() > second.length()) return true;
        if(first.length() < second.length()) return false;
        if (first.compareTo(second) > 0) return true;
        return false;
    }


//    public void sort(String[] numbers) {
//        String temp;
//        boolean sorted = false;
//
//            for (int j = 0; j < numbers.length - 1; j++) {
//                if (numbers[j].length() > numbers[j+1].length() || numbers[j].compareTo(numbers[j + 1]) > 0) {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                    sorted = false;

//                } /*else if (numbers[j].compareTo(numbers[j + 1]) > 0) {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                    sorted = false;
//
//                }*/
//
//            }
//            System.out.println(Arrays.toString(numbers));
//        }
//    }


}

