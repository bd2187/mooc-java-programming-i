/*
    Implement a program which calculates the factorial of a number given by the user.

    Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
    For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally,
    it has been specified that the factorial of 0 is 1, so 0! = 1.
*/
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        if(num == 1 || num == 0) {
            
            System.out.println("Factorial: 1");
            
        } else {
            
            int product = 1;
            
            for(int i = 1; i <= num; i++) {
                product *= i;
            }
            
            System.out.println("Factorial: " + product);
            
        }

    }
}
