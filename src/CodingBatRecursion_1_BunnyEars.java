public class CodingBatRecursion_1_BunnyEars {

    /** <a href="https://codingbat.com/prob/p183649">...</a> **/
    //We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).
    //
    //bunnyEars(0) → 0
    //bunnyEars(1) → 2
    //bunnyEars(2) → 4
    public static void main(String[] args) {
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
    }

    private static int bunnyEars(int bunnies) {
        //base case
        //if we given 0 bunnies, return no ears.
        if (bunnies == 0) {
            return 0;
        }

        int count = 0;
        //sub-problem
        //for each bunny, add two ears.
        count += 2;

        //add the count to a recursive call, decrementing the number of bunnies to be counted
        return count + bunnyEars(--bunnies);
    }
}
