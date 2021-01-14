//public class vanguard {
//    st problem:
//
//
//
//
//
//
//
//
//            11:09
//            *
//            * Complete the 'maximumOccurringCharacter' function below.
//            *
//            * The function is expected to return a CHARACTER.
//            * The function accepts STRING text as parameter.
//     */
//    public static char maximumOccurringCharacter(String text) {
//        char[] textAr = text.toCharArray();
//        int counter = countOccurrences(0, textAr);
//        char occurredMost = textAr[0];
//        for (int i=1; i<textAr.length; i++){
//            int next = countOccurrences(i, textAr);
//            if (next > counter){
//                counter = next;
//                occurredMost = textAr[i];
//            }
//        }
//        return occurredMost;
//    }
//    public static int countOccurrences(int index, char[] array){
//        int counter = 1;
//        for (int i=0; i<array.length; i++){
//            if (i != index && array[i] == array[index]){
//                counter++;
//            }
//        }
//        return counter;
//    }
//}
//11:10
//        2nd one:
//        (Only passed 3 of like 14 test cases UGH!)
//static int maxTickets(List<Integer> tickets) {
//        int biggestLength = 1;
//        //loop thru and create a subsequence on each go
//        for (int i=0; i<tickets.size(); i++){
//        List<Integer> subInts = new ArrayList<>();
//        subInts.add(tickets.get(i));
//        for (int j=0; j<tickets.size(); j++){
//        if (i != j){
//        if (tickets.get(i) == tickets.get(j)) subInts.add(tickets.get(j));
//        if (tickets.get(i)+1 == tickets.get(j)) subInts.add(tickets.get(j));
//        if (tickets.get(i)-1 == tickets.get(j)) subInts.add(tickets.get(j));
//        }
//        }
//        //compare the substring length at end of each loop and save highest
//        System.out.println(biggestLength);
//        System.out.println(subInts.size());
//        if (subInts.size() > biggestLength) biggestLength = subInts.size();
//        }
//        return biggestLength;
//        }
//        11:10
//        3rd:
//public static int toolchanger(List<String> tools, int k, String q) {
//        //find index of string
//        int indexOfString = -1;
//        for (int i=0; i<tools.size(); i++){
//        if (tools.get(i).equals(q)) indexOfString = i;
//        }
//        //compare given index to index of string & find fewest moves
//        int distance = k - indexOfString;
//        if (distance < 0) distance = distance*-1;
//        if (distance > tools.size()/2) distance = tools.size()-distance;
//        return distance;
//        }


//I got the one about the fibonacci sequence
//        11:35
//        and then that other one was about the alphabet being translated to numbers and
//        how many different ways could a multi digit integer be interpreted
//capitalize first letter in every string

