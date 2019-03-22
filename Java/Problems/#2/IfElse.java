import java.util.Scanner;
import java.util.InputMismatchException; 

public class IfElse {

    public static int exceptionHandling(int num, Scanner in) {
        int test = 0; 
        System.out.println("Enter an interger value such that (1 <= n <= 100) or Enter -1 to exit the program");

        do {
            try {
                num = in.nextInt();
                exitProgram(num); 
                test = 1;
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again or Enter -1 to exit the program.");
                in.next(); /* Advancing the scanner buffer position till the delimiter position(white-space) 
                    next() can read the input only till the space(delimiter). It can’t read two words separated by space. */ 
            }
        }  while (test == 0);

        return num;
    }

    public static void exitProgram (int num)    {
        if (num == -1 ) { 
            System.out.println("The program has ended."); 
            System.exit(0);
        } 
    }
    
    public static int userErrorHandling(int num, Scanner in) {

        if (num < 1) { 
            System.out.println("Input was < 1. Please try again or Enter -1 to exit the program"); 
        }
        else { 
            System.out.println("Input was > 100. Please try again or Enter -1 to exit the program");
        }
        num = in.nextInt();
        exitProgram(num);
        return num;
    }

    public static void printOutput(int num) {
        if (num >= 1 && num <= 100) {
            if (num % 2 == 1)
                System.out.println("Weird");
            else if (num == 2 || num == 4)
                System.out.println("Not Weird");
            else if (num >= 6 && num <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        num = exceptionHandling(num, in);

        while (num < 1 || num > 100) {
            num = userErrorHandling(num, in);
        }
        printOutput(num);
        in.close();
        System.exit(0);
    }

}
