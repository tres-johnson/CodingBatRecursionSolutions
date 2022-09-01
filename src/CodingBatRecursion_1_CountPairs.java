public class CodingBatRecursion_1_CountPairs {

    //We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair.
    // Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs
    // in the given string.
    //
    //countPairs("axa") → 1
    //countPairs("axax") → 2
    //countPairs("axbx") → 1
    public static void main(String[] args) {
        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));
    }

    private static int countPairs(String str) {
        //base case
        //if the str is smaller than 3 in length return 0 immediately
        if (str.length() < 3) {
            return 0;
        }

        //sub-problem
        //One pair
        int count = 0;
        if (str.charAt(0) == str.charAt(2)) {
            count++;
        }

        return count + countPairs(str.substring(1));
    }
}
