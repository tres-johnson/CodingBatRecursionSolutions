public class CodingBatRecursion_1_CountHi2 {

    /**<a href="https://codingbat.com/prob/p143900">...</a> **/
    //Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
    // count "hi" that have an 'x' immediately before them.
    //
    //countHi2("ahixhi") → 1
    //countHi2("ahibhi") → 2
    //countHi2("xhixhi") → 0
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
        System.out.println(countHi2("hixhhi"));
        System.out.println(countHi2("hihihi"));
        System.out.println(countHi2("Hellohi")); //1
    }

    private static int countHi2(String str) {
        //base case
        //if str is less than 2 chars, return 0. Because we won't find 'hi' without at least a string 2 chars in length
        if (str.length() < 2) {
            return 0;
        }

        //sub-problems
        int firstIndexOfHi = str.indexOf("hi");
        //if 'hi' is found at the first index...
        if (firstIndexOfHi == 0) {
            //...count it and move down the string past the word 'hi'
            return 1 + countHi2(str.substring(2));
        //if 'hi' is found at the second index and the string starts with an 'x'...
        } else if (firstIndexOfHi == 1 && str.startsWith("x")) {
            //... don't count it and move down the string, skipping the 'xhi' portion
            return countHi2(str.substring(3));
        //if 'hi' is found SOMEWHERE down the string and the character just before 'hi doesn't equal 'x'...
        } else if (firstIndexOfHi > 0 && str.charAt(firstIndexOfHi -1 ) != 'x') {
            //... count it and move down the string past the 'hi' we found
            return 1 + countHi2(str.substring(firstIndexOfHi + 2));
        }

        //none of the conditions satisfied, move down the string by one index and evaluate that portion with
        return countHi2(str.substring(1));
    }
}
