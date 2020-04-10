/*
    Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by the user.

    Give the first number:
        8
    Give the second number:
        3
    The sum of the numbers is 11
*/
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (firstNum + secondNum));

    }
}
