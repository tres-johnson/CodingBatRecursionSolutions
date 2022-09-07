public class CodingBatRecursion_1_StrDist {

    /** https://codingbat.com/prob/p195413 **/
    //Given a string and a non-empty substring sub, compute recursively the largest substring which starts and
    //ends with sub and return its length.
    //
    //strDist("catcowcat", "cat") → 9
    //strDist("catcowcat", "cow") → 3
    //strDist("cccatcowcatxx", "cat") → 9
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
        System.out.println(strDist("hiHellohihihi", "hih"));
    }

    private static int strDist(String str, String sub) {
        //if str length is less than the sub length, return 0 immediately because str couldn't possibly contain the sub
        if (str.length() < sub.length()) {
            return 0;
        }

        int firstIndex = str.indexOf(sub);
        int lastIndex = str.lastIndexOf(sub);
        //if the first index is found and the last index is found...
        if (firstIndex > -1 && lastIndex > -1) {
            //... count the chars between the first index and last index and tack the sub length onto the end because
            //lastIndex only gives us the last BEGINNING index of the second sub instance
            //this also covers the edge case of the sub overlapping in the given str.
            return countChars(str.substring(firstIndex, lastIndex)) + sub.length();
        }
        //if the sub is only found once, immediately return the length of the sub value
        if (firstIndex > -1) {
            return sub.length();
        }

        //none of the above conditions are true, return 0 immediately
        return 0;
    }

    private static int countChars(String str) {
        //base case
        //str is less than 1 char in length, return 0 immediately
        if (str.length() < 1) {
            return 0;
        }

        //we made it past the base case. Return 1 + the result of recursive calls to this method passing in a smaller
        //version of str on each subsequent calls.
        return 1 + countChars(str.substring(1));
    }
}
