import java.util.ArrayList;
import java.util.List;

/**
 * Given the array candies and the integer extraCandies,
 * where candies[i] represents the number of candies that
 * the ith kid has.
 *
 * For each kid check if there is a way to distribute
 * extraCandies among the kids such that he or she can have
 * the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 */
public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //find current highest number
        // checking if adding extra to the kid
        // would make them => currentHighest
        //if it does store in list of true
        int currentHighest = 0;
        List<Boolean> result = new ArrayList<Boolean>();

        for(int i=0; i < candies.length; i++){
            if(candies[i] > currentHighest)
                currentHighest = candies[i];
            System.out.println(currentHighest);
        }

        for(int i=0; i < candies.length; i++){
            if(candies[i] + extraCandies >= currentHighest){
                result.add(true);
            } else
                result.add(false);
        }


        return result;
    }
}
