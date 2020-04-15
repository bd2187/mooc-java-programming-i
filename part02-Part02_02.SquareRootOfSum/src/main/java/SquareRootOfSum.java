/*
    Write a program that reads two integers from the user and prints the square root
    of the sum of these integers. The program does not need to work with negative
    values.
*/
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());
        double res = Math.sqrt(firstNum + secondNum);
        
        System.out.println(res);
        

    }
}
