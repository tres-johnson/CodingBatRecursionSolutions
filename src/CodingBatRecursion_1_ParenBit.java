public class CodingBatRecursion_1_ParenBit {

    //Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the
    // parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
    //
    //parenBit("xyz(abc)123") → "(abc)"
    //parenBit("x(hello)") → "(hello)"
    //parenBit("(xy)1") → "(xy)"
    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
    }

    private static String parenBit(String str) {
        //base case
        //if str doesn't contain opening or closing parens, return an emtpy string
        if (str.length() < 1) {
            return "";
        }

        //sub-problem
        if (str.startsWith("(")) {
            return "(" + str.substring(1, str.lastIndexOf(")")) + ")";
        } else {
            return parenBit(str.substring(1));
        }
    }
}
