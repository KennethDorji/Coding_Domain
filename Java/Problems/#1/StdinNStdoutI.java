/* 
    Task: 
    In this challenge, you must read  3 integers from stdin and then 
    print them to stdout. Each integer must be printed on a new line. 
    The sample input 
    42 
    100 
    125
    The sample output 
    42 
    100 
    125
*/ 
import java.util.Scanner; 

public class StdinNStdoutI  {

    public static int userInput(int intNum, Scanner in) {
        intNum = in.nextInt(); 
        return intNum; 
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in); 
        int userInput1 = 0, userInput2 = 0, userInput3 = 0; 
        /* The above int variables also could be initialized to zero the following way: 
        userInput1 = userInput2 = userInput3 = 0; */
        System.out.println("Enter 3 interger value");
        userInput1 = userInput(userInput1, in); 
        userInput2 = userInput(userInput2, in); 
        userInput3 = userInput(userInput3, in); 
        System.out.println("\n" + userInput1 + "\n" + userInput2 + "\n" + 
                            userInput3); 
        in.close(); 
    }
}
