
/*
Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the numbers. The number zero does not need to be counted to the average. You may assume that the user inputs at least one number.

The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers
*/

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
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
        
        double avg = (double) sum / count;
        
        System.out.println("Average of the numbers: " + avg);

    }
}
