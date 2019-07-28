import java.util.Scanner;
import java.lang.Math;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testNum = in.nextInt();

        for (int i = 0; i < testNum; i++) {

            try {
                long testValue = in.nextLong();
                System.out.println(testValue + " can be fitted in:");
                if (testValue >= -(Math.pow(2, 7)) && testValue <= (Math.pow(2, 7) - 1))
                    System.out.println("* byte");
                if (testValue >= -(Math.pow(2, 15)) && testValue <= (Math.pow(2, 15) - 1))
                    System.out.println("* short");
                if (testValue >= -(Math.pow(2, 31)) && testValue <= (Math.pow(2, 31) - 1))
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
