import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int testNum = in.nextInt();

        for (int i = 0; i < testNum; i++) {

            try {
                long testValue = in.nextLong();
                System.out.println(testValue + " can be fitted in:");
                if (testValue >= Byte.MIN_VALUE && testValue <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (testValue >= Short.MIN_VALUE && testValue <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (testValue >= Integer.MIN_VALUE && testValue <= Integer.MAX_VALUE)
                    System.out.println("* int");

                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }

        in.close();
        System.exit(0);

    }

}
