public class CodingBatRecursion_1_ChangePi {

    /** <a href="https://codingbat.com/prob/p170924">...</a> **/
    //Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
    //
    //changePi("xpix") → "x3.14x"
    //changePi("pipi") → "3.143.14"
    //changePi("pip") → "3.14p"
    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));
    }

    private static String changePi(String str) {
        //base case
        //if the str.length is less than 2 then return the value of str immediately since pi cannot be smaller than 2
        //in length.
        if (str.length() < 2) {
            return str;
        }

        //sub-problem
        //if the str startWith 'pi'...
        if (str.startsWith("pi")) {
            //... replace it with '3.14' and then call the recursive method on the rest of the string, beginning at the
            //index after where 'pi' was found, which is index 2
            str = "3.14" + changePi(str.substring(2));
        } else {
            //... the string didn't start with 'pi'. So ignore the first character and call the method recursively, only
            //providing the recursive call with the str from substring index 1 on
            str = str.charAt(0) + changePi(str.substring(1));
        }

        return str;
    }

}
