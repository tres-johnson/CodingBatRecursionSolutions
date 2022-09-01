public class CodingBatRecursion_1_AllStar {

    /** <a href="https://codingbat.com/prob/p183394">...</a> **/
    //Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
    //
    //allStar("hello") → "h*e*l*l*o"
    //allStar("abc") → "a*b*c"
    //allStar("ab") → "a*b"
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
        System.out.println(allStar("a"));
    }

    private static String allStar(String str) {
        //base case
        //if the length of the incoming String is less than 2, we return the String, because:
        //a single character needs no asterisk
        //an empty character is an empty character
        if (str.length() < 2) {
            return str;
        }

        //sub-problem
        //We're working with at least two characters so prepend the first character and then an asterisk and then
        //append the result of the recursive call on the rest of the String
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
