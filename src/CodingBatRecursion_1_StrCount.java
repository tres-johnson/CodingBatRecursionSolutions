public class CodingBatRecursion_1_StrCount {

    /** <a href="https://codingbat.com/prob/p186177">...</a> **/
    //Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the
    // string, without the sub strings overlapping.
    //
    //strCount("catcowcat", "cat") → 2
    //strCount("catcowcat", "cow") → 1
    //strCount("catcowcat", "dog") → 0
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
    }

    private static int strCount(String str, String sub) {
        //base case
        //if the str is smaller than the sub in length, return 0 immediately.
        if (str.length() < sub.length()) {
            return 0;
        }

        //sub-problem
        //the str starts with the sub...
        if (str.startsWith(sub)) {
            //...count it and call the method recursively, moving down the length of sub so as not to count overlaps
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            //...else, move down one char in the string and count again
            return strCount(str.substring(1), sub);
        }
    }
}
