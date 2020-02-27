
public class MoveZeroes {

    public static void moveZeroes(final int[] nums) {

        int j = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == j)
                return;
            System.out.print(i + " ");
            if (nums[i] == 0) {
                System.out.println(i + " ");
                nums[i] = nums[j];
                // System.out.print(nums[i] + " ");

                nums[j] = 0;
                // System.out.print(nums[j] + " ");

                j = j - 1;

                // System.out.println(j);
                // System.out.println();
            }
        }
    }

    public static void main(final String[] args) {

        final int[] nums = new int[] { 0, 1, 0, 3, 12 };
        moveZeroes(nums);

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1)
                System.out.print(nums[i]);
            else
                System.out.print(nums[i] + ",");
        }
        System.out.print("]\n");
        System.exit(0);
    }
}
