public class CodingBatRecursion_1_BunnyEars2 {

    /** <a href="https://codingbat.com/prob/p107330">...</a> **/
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    //
    //bunnyEars2(0) → 0
    //bunnyEars2(1) → 2
    //bunnyEars2(2) → 5
    public static void main(String[] args) {
        System.out.println(bunnyEars2(0));
        System.out.println(bunnyEars2(1));
        System.out.println(bunnyEars2(2));
    }

    private static int bunnyEars2(int bunnies) {
        //base
        //there are no bunnies
        if (bunnies == 0) {
            return 0;
        }

        int count = 0;
        if (bunnies % 2 == 0) { //sub-problem: even bunny => +3 ears
            count += 3;
        } else { //sub-problem: odd bunny => +2 ears
            count += 2;
        }

        //add the result of the sub-problem to the result of the recursive call, going down the line of bunnies.
        return count + bunnyEars2(--bunnies);
    }
}
