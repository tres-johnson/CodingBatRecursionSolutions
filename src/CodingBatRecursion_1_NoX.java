public class CodingBatRecursion_1_NoX {

    /** <a href="https://codingbat.com/prob/p118230">...</a> **/
    //Given a string, compute recursively a new string where all the 'x' chars have been removed.
    //
    //noX("xaxb") → "ab"
    //noX("abc") → "abc"
    //noX("xx") → ""
    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }

    private static String noX(String str) {
        //base case
        //the str length is <= 0, return empty string
        if (str.length() <= 0) {
            return "";
        }

        //sub-problem
        //we look at one character. If it is x, we return empty string..
        if (str.startsWith("x")) {
            return noX(str.substring(1));
        } else {
            return str.charAt(0) + noX(str.substring(1));
        }
    }
}
