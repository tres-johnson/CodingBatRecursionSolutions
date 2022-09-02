public class CodingBatRecursion_1_Count8 {

    /** https://codingbat.com/prob/p192383 **/
    //Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
    // except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10
    // yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    //
    //count8(8) → 1
    //count8(818) → 2
    //count8(8818) → 4
    public static void main(String[] args) {
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
        System.out.println(count8(8088));
    }

    private static int count8(int n) {
        //base case
        //if n is less than 8, return 0 immediately because it's not an 8.
        if (n < 8) {
            return 0;
        }

        //sub-problem
        int rightMostDigit = n % 10;
        //if the rightmost digit and the digit just before it are 8's...
        int count = 0;
        if (rightMostDigit == 8 && ((n / 10) % 10) == 8) {
            //... count it double
            count += 2;
        //... else if the rightmost digit is an 8...
        } else if (rightMostDigit == 8) {
            //... increment the count by 1
            count++;
        }

        //remove the rightmost digit, essentially shortening the current number by one digit, and call this method
        //recursively to evaluate this new digit. Add the result to the count.
        return count + count8(n/10);
    }
}
