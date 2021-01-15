public class TwoPointerTechnique {

    // given a sorted array, and target sum, find the two indices for sum

    public int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];

        while(left < right){
        int sum = arr[left] + arr[right];
        if(sum < target){
            left++;
            System.out.println(left);
            //sum is too small
            // so have to increment left pointer
            //left to right array increases
        } else if
        (sum > target){
            right--;
        } else{
             result[0] = left;

             result[1] = right;
        }
        }
        return result;
    }



}
