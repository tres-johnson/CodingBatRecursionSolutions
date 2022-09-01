public class CodingBatRecursion_1_CountX {

    /** <a href="https://codingbat.com/prob/p170371">...</a> **/
    //Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
    //
    //countX("xxhixx") → 4
    //countX("xhixhix") → 3
    //countX("hi") → 0
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }

    private static int countX(String str) {
        //base case
        //if the str length is equal to 0, return 0 immediately.
        if (str.length() == 0) {
            return 0;
        }

        int count = 0;
        //sub-problem
        //if the str startsWith 'x', increment a counter
        if (str.startsWith("x")) {
            count++;
        }

        return count + countX(str.substring(1));
    }
}
