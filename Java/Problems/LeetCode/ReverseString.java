
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
