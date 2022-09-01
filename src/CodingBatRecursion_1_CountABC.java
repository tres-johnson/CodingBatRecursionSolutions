public class CodingBatRecursion_1_CountABC {

    //Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
    //
    //countAbc("abc") → 1
    //countAbc("abcxxabc") → 2
    //countAbc("abaxxaba") → 2
    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
    }

    private static int countAbc(String str) {
        //base case
        //The String length is less than the length of the target String 'abc'. When this is the case, immediately return
        //0;
        if (str.length() < 3) {
            return 0;
        }

        int count = 0;
        //sub-problem
        //The String starts with the target String, abc or aba, count it by incrementing a counter and then calling the
        //method recursively, using a substring 1 char smaller than the original String
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return (++count) + countAbc(str.substring(1));
        } else {
        //we didn't find it at the beginning of this String, so do a recursive call starting at the next char in the
        //incoming String
            return countAbc(str.substring(1));
        }
    }
}
