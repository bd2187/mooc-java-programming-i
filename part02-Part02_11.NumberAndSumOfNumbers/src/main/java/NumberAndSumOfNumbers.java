/*
    Write a program that asks the user for input until the user inputs 0.
    After this, the program prints the average of the numbers.
    The number zero does not need to be counted to the average.
    You may assume that the user inputs at least one number.
*/


import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                
                break;
                
            } else {
                
                count++;
                sum += input;
            
            }
        }        
        
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
