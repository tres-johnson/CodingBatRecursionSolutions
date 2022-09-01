public class CodingBatRecursion_1_StrCopies {

    /** <a href="https://codingbat.com/prob/p118182">...</a> **/
    //Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the
    // string somewhere, possibly with overlapping. N will be non-negative.
    //
    //strCopies("catcowcat", "cat", 2) → true
    //strCopies("catcowcat", "cow", 2) → false
    //strCopies("catcowcat", "cow", 1) → true
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }

    private static boolean strCopies(String str, String sub, int n) {
        //base case
        //if str has less characters than sub, return false
        if (str.length() < sub.length()) {
            return false;
        }

        return countSubs(str, sub) >= n;
    }

    private static int countSubs(String str, String sub) {
        if (sub.length() > str.length()) {
            return 0;
        }

//        int count = 0;
//        int index = 0;
//        if (str.startsWith(sub)) {
//            count++;
//        }
//
//        return count + countSubs(str.substring(++index), sub);

        int index = 0;
        return (str.startsWith(sub) ? 1 : 0) + countSubs(str.substring(++index), sub);
    }
}
