
import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        // Solution 1: Run time is O(nlogn) 
        
        // if (nums.length == 0)
        // return -1;

        // // Arrays.sort() uses Time Sort - O(N log N) for array of objects
        // Arrays.sort(nums);
        // int missingNumber = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != i) {
        // missingNumber = i;
        // return missingNumber;
        // }
        // }
        // return -1;

        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums)
            numbers.add(num);

        int numCount = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(i))
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] nums = new int[] { 0, 2, 3 };

        System.out.println(nums.length);
        System.out.println(missingNumber(nums));

        System.exit(0);
    }
}
