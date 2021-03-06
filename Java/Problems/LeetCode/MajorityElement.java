/*
    Given an array of size n, find the majority element. The majority element is the element that appears more than
    ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3

    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2
*/

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i]) + 1);
            else
                hm.put(nums[i], 1);
        }

        int hmValue = 0, hmKey = 0;
        for (Entry<Integer, Integer> key : hm.entrySet()) {

            if (key.getValue() >= hmValue) {
                hmKey = key.getKey();
                hmValue = key.getValue();
            }

        }

        return hmKey;
    }

    public static void main(String[] args) {

        final int[] nums = new int[] { 6, 6, 6, 7, 7 };

        // System.out.println(majorityElement(nums));
        int majElement = majorityElement(nums);
        System.out.println(majElement);
        System.exit(0);
    }
}
