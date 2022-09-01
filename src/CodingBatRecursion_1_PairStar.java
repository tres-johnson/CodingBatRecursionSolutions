public class CodingBatRecursion_1_PairStar {

    //Given a string, compute recursively a new string where identical chars that are adjacent in the original string
    // are separated from each other by a "*".
    //
    //pairStar("hello") → "hel*lo"
    //pairStar("xxyy") → "x*xy*y"
    //pairStar("aaaa") → "a*a*a*a"
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));
    }

    private static String pairStar(String str) {
        //base case
        //if we've got a String with a single character, return the String
        if (str.length() < 2) {
            return str;
        }

        //sub problem
        //consider two characters at index 0 and 1. If they are they same..
        int index = 0;
        if (str.charAt(index) == str.charAt(index + 1)) {
            //...create a new string with char 0 + * + pairStair of the rest of the String
            return str.charAt(index) + "*" + pairStar(str.substring(++index));
        } else {
            //...else retain this character + pairStar of the rest of the String
            return str.charAt(index) + pairStar(str.substring(++index));
        }
    }
}
