public class CodingBatRecursion_1_CountHi {

    /** <a href="https://codingbat.com/prob/p184029">...</a> **/
    //Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    //
    //countHi("xxhixx") → 1
    //countHi("xhixhix") → 2
    //countHi("hi") → 1
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }

    private static int countHi(String str) {
        //base case
        //if str is less than two chars in length then return 0 immediately because it couldn't possibly have our
        //target String
        if (str.length() < 2) {
            return 0;
        }

        //sub-problem
        //if the str startsWith our target, count it
        int count = 0;
        if (str.startsWith("hi")) {
            count++;
        }

        //append the count to the result of a recursive call, moving down the str one char at a time by using the
        //substring method on str.
        return count + countHi(str.substring(1));
    }
}
