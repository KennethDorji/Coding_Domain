
public class SumOfTwoIntegers {

    public static int getSum(int a, int b) {

        /**
         * Non Recursive Solution
         * 
         * if (a == 0) return b; if (b == 0) return a;
         * 
         * while (b != 0) { int carry = a & b; a = a ^ b; b = carry << 1; }
         * 
         * return a;
         */

        // Testing
        // System.out.print("int a = " + a);
        // System.out.print(" int b = " + b);
        int bitDontCreateCarry = a ^ b;

        // Testing
        // System.out.print(" int carryNot = " + bitDontCreateCarry);

        int bitCreatedCarry = a & b;

        // Testing
        // System.out.print(" int carry = " + bitCreatedCarry);

        // System.out.println();

        if (bitCreatedCarry == 0)
            return bitDontCreateCarry;
        else
            return getSum(bitCreatedCarry << 1, bitDontCreateCarry);

    }

    public static void main(String[] args) {

        int a = 2, b = 2;

        // Testing
        // System.out.println();

        System.out.println(getSum(a, b));

        System.exit(0);
    }

}
