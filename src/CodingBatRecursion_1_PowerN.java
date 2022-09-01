public class CodingBatRecursion_1_PowerN {

    //Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
    // so powerN(3, 2) is 9 (3 squared).
    //
    //powerN(3, 1) → 3
    //powerN(3, 2) → 9
    //powerN(3, 3) → 27
    public static void main(String[] args) {
//        System.out.println(powerN(3, 1));
//        System.out.println(powerN(3, 2));
        System.out.println(powerN(3, 3));
    }

    private static int powerN(int base, int n) {
        //base cases
        //if base is 1, return the 1
        if (base == 1) {
            return 1;
        }
        //if the power is 1 return the base
        if (n == 1) {
            return base;
        }

        //base remains constant, it's the power that changes. Each subsequent call must work toward returning the base
        //because we know that the base to the power of one is simply the base. Then we roll back up, multiplying by
        //the base each time.
        return base * powerN(base, --n);
    }
}
