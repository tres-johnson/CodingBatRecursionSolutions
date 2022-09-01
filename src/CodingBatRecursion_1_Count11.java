public class CodingBatRecursion_1_Count11 {

    /** <a href="https://codingbat.com/prob/p167015">...</a> **/
    //Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
    //
    //count11("11abc11") → 2
    //count11("abc11x11x11") → 3
    //count11("111") → 1
    public static void main(String[] args) {
        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));
    }

    private static int count11(String str) {
        //base case
        //if str is less than 2 in length, return 0;
        if (str.length() < 2) {
            return 0;
        }

        //sub-problem
        //str starts with '11'. increment the count by 1. Then move the search along to just after the located '11' since
        //there should be no overlap.
        int count = 0;
        if (str.startsWith("11")) {
            count++;
            return count + count11(str.substring(2));
        } else {
            //else make subsequent recursive calls, moving down the string by one position
            return count11(str.substring(1));
        }
    }
}
