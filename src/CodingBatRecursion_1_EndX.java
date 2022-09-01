public class CodingBatRecursion_1_EndX {

    //Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
    //
    //endX("xxre") → "rexx"
    //endX("xxhixx") → "hixxxx"
    //endX("xhixhix") → "hihixxx"
    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }

    private static String endX(String str) {
        //base case
        //str is less than 1 char in length, return an empty String immediately.
        if (str.length() < 1) {
            return "";
        }

        //sub-problem
        //if str startsWith and 'x'...
        String result = "";
        if (str.startsWith("x")) {
            //...call the method recursively and only give it the string from position 1 on because we're moving the 'x'
            //we found to the end of the string.
            result = endX(str.substring(1)) + "x";
        } else {
            //...else
            result = str.charAt(0) + endX(str.substring(1));
        }

        return result;
    }
}
