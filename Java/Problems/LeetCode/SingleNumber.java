/*
    136. Single Number
    
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Note:

    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Example 1:

    Input: [2,2,1]
    Output: 1

    Example 2:

    Input: [4,1,2,1,2]
    Output: 4
*/

import java.util.HashMap;
import java.util.Map.Entry;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i]) + 1);
            else
                hm.put(nums[i], 1);
        }

        int singleNum = 0;
        for (Entry<Integer, Integer> key : hm.entrySet()) {
            if (key.getValue() % 2 == 1) {
                singleNum = key.getKey();
                break;
            }
        }
        return singleNum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 1, 2, 1, 4, 3, 2 };

        System.out.println(singleNumber(nums));

        System.exit(0);
    }
}
