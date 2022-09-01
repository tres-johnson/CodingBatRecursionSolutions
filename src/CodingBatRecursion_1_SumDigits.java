public class CodingBatRecursion_1_SumDigits {

    //Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields
    //the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    //
    //sumDigits(126) → 9
    //sumDigits(49) → 13
    //sumDigits(12) → 3
    public static void main(String[] args) {
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(12));
    }

    private static int sumDigits(int n) {
        //base
        //if n is less than 10 then it is a single digit number, there is no need to recurse, return the number
        //immediately.
        if (n < 10) {
            return n;
        }

        //sub-problem
        //take the right most number and add it to the cursive call to sumDigits, removing the right-most digit in
        //subsequent calls.
        return n % 10 + sumDigits(n / 10);
    }
}
