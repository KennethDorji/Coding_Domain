/*
    Given an array of integers, find if the array contains any duplicates.

    Your function should return true if any value appears at least twice in the array, and it should return false if 
    every element is distinct.

    Example 1:
    Input: [1,2,3,1]
    Output: true

    Example 2:
    Input: [1,2,3,4]
    Output: false

    Example 3:
    Input: [1,1,1,3,3,4,3,2,4,2]
    Output: true
*/

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
            hs.add(nums[i]);

        if (hs.size() != nums.length)
            return true;

        return false;

    }

    public static void main(String[] args) {

        // int[] nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        int[] nums = new int[] { 1, 2, 3, 1 };

        System.out.println(containsDuplicate(nums));

        System.exit(0);
    }
}
