public class CodingBatRecursion_1_StringClean {

    /** <a href="https://codingbat.com/prob/p104029">...</a> **/
    //Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced
    // to a single char. So "yyzzza" yields "yza".
    //
    //stringClean("yyzzza") → "yza"
    //stringClean("abbbcdd") → "abcd"
    //stringClean("Hello") → "Helo"
    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));
    }

    private static String stringClean(String str) {
        //base case
        //if str is a single char, return the single char
        if (str.length() == 1) {
            return str;
        }

        //sub problem
        //Compare char 0 to char 1. If they are the same, call stringClean again, substringing from char 1 effectively
        //removing char 0 because it and the next character are the same
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            //else keep char 0 because the next char isn't the same. Send the rest of the str substringed from char 1
            //for evaluation
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }
}
