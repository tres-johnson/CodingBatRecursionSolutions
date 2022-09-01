public class CodingBatRecursion_1_Count7 {

    /** <a href="https://codingbat.com/prob/p101409">...</a> **/
    //Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
    // (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
    // the rightmost digit (126 / 10 is 12).
    //
    //count7(717) → 2
    //count7(7) → 1
    //count7(123) → 0
    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
    }

    private static int count7(int n) {
        if (n < 7) {
            return 0;
        }

//        int count = 0;
//        if (n % 10 == 7) {
//            count++;
//        }
//
//        return count + count7(n / 10);

//        if (n % 10 == 7) {
//            return 1 + count7(n/10);
//        } else {
//            return count7(n/10);
//        }

        if (String.valueOf(n % 10).equals("7")) {
            return 1 + count7(n/10);
        } else {
            return count7(n/10);
        }



    }
}
