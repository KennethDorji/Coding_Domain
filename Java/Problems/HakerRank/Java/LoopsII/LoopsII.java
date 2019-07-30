import java.util.Scanner;
import java.lang.Math;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = 0;
        do {
            System.out.println("Enter the queries no: ");
            q = in.nextInt();
        }

        while (q < 0 || q > 500);

        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];

        for (int i = 0; i < q; i++) {

            a[i] = in.nextInt();
            while (a[i] < 0 || a[i] > 50)
                a[i] = in.nextInt();

            b[i] = in.nextInt();
            while (b[i] < 0 || b[i] > 50)
                b[i] = in.nextInt();

            n[i] = in.nextInt();
            while (n[i] < 1 || n[i] > 15)
                n[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n[i]; j++) {
                if (j == 0)
                    sum = a[i] + (int) (Math.pow(2, 0) * b[i]);
                else
                    sum += (Math.pow(2, j) * b[i]);

                System.out.print(sum + " ");
            }
            System.out.println();
        }

        // for (int i = 0; i < q; i++)
        // System.out.println(a[i] + " " + b[i] + " " + n[i]);

        System.exit(0);

    }
}
