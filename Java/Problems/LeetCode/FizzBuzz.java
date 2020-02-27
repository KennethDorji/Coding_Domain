
import java.util.ArrayList;

public class FizzBuzz {

    public static ArrayList<String> fizzBuzz(int num) {

        ArrayList<String> arrList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            if (i % 15 == 0)
                arrList.add("FizzBuzz");
            else if (i % 3 == 0)
                arrList.add("Fizz");
            else if (i % 5 == 0)
                arrList.add("Buzz");
            else
                arrList.add(Integer.toString(i));
        }
        return arrList;
    }

    public static void main(String[] args) {

        int num = 15;
        ArrayList<String> arrList = new ArrayList<>();

        arrList = fizzBuzz(num);

        for (int i = 0; i < num; i++)
            System.out.println(arrList.get(i));

        System.exit(0);

    }
}
