/*
    Given two strings s and t , write a function to determine if t is an anagram of s.

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Note:
    You may assume the string contains only lowercase alphabets.
*/

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            if (hm.containsKey(s1.charAt(i)))
                hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);
            else
                hm.put(s1.charAt(i), 1);
        }

        for (int j = 0; j < s2.length(); j++) {

            if (hm.containsKey(s2.charAt(j)) && hm.get(s2.charAt(j)) > 0)
                hm.put(s2.charAt(j), hm.get(s2.charAt(j)) - 1);

            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "rat", s2 = "art";
        System.out.println(isAnagram(s1, s2));

        System.exit(0);
    }
}
