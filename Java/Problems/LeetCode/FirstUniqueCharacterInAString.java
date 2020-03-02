/*
    Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

    Examples:

    s = "leetcode"
    return 0.

    s = "loveleetcode",
    return 2.

    Note: You may assume the string contain only lowercase letters. 
*/

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {

        if (s == null || s.length() == 0)
            return -1;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (hm.containsKey(s.charAt(i))) {
                // 2 as Value is already repeating. There is no need to be specific
                // on how many times the char repeats as not required.
                hm.put(s.charAt(i), 2);
            } else
                hm.put(s.charAt(i), 1);
        }

        for (int j = 0; j < s.length(); j++) {

            if (hm.get(s.charAt(j)) == 1)
                return j;
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        System.out.println(firstUniqChar(s));
    }
}
