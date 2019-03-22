/* 
    Task: 
    In this challenge, you must read  3 integers from stdin and then 
    print them to stdout. Each integer must be printed on a new line. 
*/ 

import java.util.Arrays;
import java.util.Scanner;

public class stdin  {

    public static void intValues(int[] num, Scanner in)   {
        for(int i = 0; i < num.length; i++ )  
            num[i]= in.nextInt();   
    }

    public static void main(String[] args)  {
        int[] userInput = new int[4]; 
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter " + userInput.length + " interger values"); 
        intValues(userInput, in); 
        System.out.println("The " + userInput.length + " int values are: " 
                            + Arrays.toString(userInput)); 

       in.close(); 
    }
}




