public class CodingBatRecursion_1_ChangeXY {

    /** <a href="https://codingbat.com/prob/p101372">...</a> **/
    //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
    //
    //changeXY("codex") → "codey"
    //changeXY("xxhixx") → "yyhiyy"
    //changeXY("xhixhix") → "yhiyhiy"
    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
    }

    private static String changeXY(String str) {
        //base case
        //if the str we are given is less than 1 in length, return the value immediately and a blank String cannot be
        //equal to x (or anything other than x for that matter)
        if (str.length() < 1) {
            return str;
        }

        //sub-problem
        //if the str starts with 'x', replace it with 'y', retaining the characters after the located character
        if (str.startsWith("x")) {
            str = "y" + changeXY(str.substring(1));
        } else {
        //the string doesn't start with an 'x', so we keep the first character and move down the string by one character
        //to evaluate subsequent characters in the String individually.
            str = str.charAt(0) + changeXY(str.substring(1));
        }

        return str;
    }
}
