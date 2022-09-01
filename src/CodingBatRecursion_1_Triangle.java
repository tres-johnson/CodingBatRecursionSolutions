public class CodingBatRecursion_1_Triangle {

    /** <a href="https://codingbat.com/prob/p194781">...</a> **/
    //We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has
    // 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a
    // triangle with the given number of rows.
    //
    //triangle(0) → 0
    //triangle(1) → 1
    //triangle(2) → 3
    public static void main(String[] args) {
        System.out.println(triangle(0));
        System.out.println(triangle(1));
        System.out.println(triangle(2));
    }

    private static int triangle(int rows) {
        //base case
        //if we have 1 or fewer rows, return the rows immediately because:
        //  0 rows => 0 blocks
        //  1 row => 1 block
        if (rows <= 1) {
            return rows;
        }

        //sub-problem
        return rows + (triangle(--rows));
    }
}
