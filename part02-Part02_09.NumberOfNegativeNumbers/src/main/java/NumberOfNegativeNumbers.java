/*
    Write a program that reads values from the user until they input a 0.
    After this, the program prints the total number of inputted values that are negative.
    The zero that's used to exit the loop should not be included in the total number count.
*/


import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        while(true) {
            
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
                
            } else if(input < 0) {
                
                count++;
                
            }
        }
        
        System.out.println("Number of negative numbers: " + count);

    }
}
