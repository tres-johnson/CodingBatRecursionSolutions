public class CodingBatRecursion_1_NestParen {

    //Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
    // Suggestion: check the first and last chars, and then recur on what's inside them.
    //
    //nestParen("(())") → true
    //nestParen("((()))") → true
    //nestParen("(((x))") → false
    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
        System.out.println(nestParen("(((x)))") );
    }

    private static boolean nestParen(String str) {
        //base case
        //if the str length is 2 chars in length and starts and ends with () return true. Because it's just the parens.
        //OR if the str length is zero. Return true per the prompt.
        if (str.length() == 2 && str.startsWith("(") && str.endsWith(")") || str.isEmpty()) {
            return true;
        }
        //if the str length is 1 char in length return false because we found a nested char.
        if (str.length() == 1) {
            return false;
        }

        //sub-problem
        //if the str startsWith ( and ends with )...
        if (str.startsWith("(") && str.endsWith(")")) {
            //... call nestParen recursively, substring from the next index for the front and the last the closing paren
            //to look at what might be inside of these parens
            return nestParen(str.substring(1, str.lastIndexOf(")")));
        }

        return false;
    }
}
