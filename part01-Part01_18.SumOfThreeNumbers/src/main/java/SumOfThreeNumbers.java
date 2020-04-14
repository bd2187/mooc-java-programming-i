/*
    Create a program that can be used to add two integers together.
    In the beginning, the user is asked to give two integers that are to be summed.
    The program then prints the formula that describes the addition of the numbers.

    Give the first number:
        5
    Give the second number:
        4
        5 + 4 = 9
*/
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
//        System.out.println(firstNum);
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());
                
        int sum = firstNum + secondNum + thirdNum;
//        System.out.println(secondNum);
        
        System.out.println("The sum of the numbers is " + sum);

    }
}
