public class CodingBatRecursion_1_Array220 {

    /** <a href="https://codingbat.com/prob/p173469">...</a> **/
    //Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that
    // value times 10. We'll use the convention of considering only the part of the array that begins at the given
    // index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index
    // as 0.
    //
    //array220([1, 2, 20], 0) → true
    //array220([3, 30], 0) → true
    //array220([3], 0) → false
    public static void main(String[] args) {
        System.out.println(array220(new int[] {1, 2, 20}, 0));
        System.out.println(array220(new int[] {3, 30}, 0));
        System.out.println(array220(new int[] {3}, 0));
    }

    private static boolean array220(int[] nums, int index) {
        //base case
        //if the index + 1 is greater than the number of indices in the nums array, return false, because we can't look
        //at the next index for evaluation and trying to reference the non-existent index will result in an
        //ArrayIndexOutOfBoundsException
        if (index + 1 > nums.length - 1) {
            return false;
        }

        //sub-problem
        //Consider the first two numbers in the array. Test to see if the num at index 0 is equal to num at index 0
        //times 10. if so, return true else return false
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        } else {
            return array220(nums, ++index);
        }
    }
}
