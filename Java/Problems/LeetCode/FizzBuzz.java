/*
    412. Fizz Buzz
    
    Write a program that outputs the string representation of numbers from 1 to n.

    But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For 
    numbers which are multiples of both three and five output “FizzBuzz”.

    Example:
    n = 15,

    Return:
    [
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    ]

*/

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
