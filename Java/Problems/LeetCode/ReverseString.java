/*
    344. Reverse String
    
    Write a function that reverses a string. The input string is given as an array of characters char[]. 
    
    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) 
    extra memory. 
    
    You may assume all the characters consist of printable ascii characters.

    Example 1:

    Input: ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]

    Example 2:

    Input: ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]
*/ 

public class ReverseString {

    public static void reverseString(char[] s) {

        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

    }

    public static void main(String[] args) {

        char[] s = new char[] { 'h', 'e', 'l', 'l', 'o' };

        reverseString(s);

        System.out.print("[");
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1)
                System.out.println(s[i] + "]");
            else
                System.out.print(s[i] + ",");
        }

        System.exit(0);
    }
}
