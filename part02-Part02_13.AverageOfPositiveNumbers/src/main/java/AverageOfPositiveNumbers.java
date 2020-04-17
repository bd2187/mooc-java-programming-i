/*
    Write a program that asks the user for input until the user inputs 0.
    After this, the program prints the average of the positive numbers
    (numbers that are greater than zero).

    If no positive number is inputted, the program prints "Cannot calculate the average"
*/
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                
                break;
                
            } else if (input > 0){
                
                count++;
                sum += input;
                
            }
        }
        
        if(count == 0 ) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double) sum / count;
            System.out.println(avg);
        }

    }
}
