import java.util.Scanner;

// Import scanner tool for reading user input
public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            // The task is to keep count of number ones
            int ones = 0;

            System.out.println("Insert a number (0 exits): ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }

            // The task is to increase the amount of ones
            // if the user inputs a number one
            if (number == 1) {
                ones = ones + 1;
            }

            // The task is to print out the total of ones
            System.out.println("The total of ones: " + ones);
        }
        
        int middle = 15 / 2;
        System.out.println(middle);
    }
}
