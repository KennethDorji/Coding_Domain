/*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
*/

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] sum = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int pair = target - nums[i];
            if (hm.containsKey(pair)) {
                sum[0] = hm.get(pair);
                sum[1] = i;
                break;
            }

            else
                hm.put(nums[i], i);
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;

        int[] targetPair = new int[2];
        targetPair = twoSum(nums, target);

        System.out.println("[" + targetPair[0] + "," + targetPair[1] + "]");

        System.exit(0);
    }
}
