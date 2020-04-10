/*
How many days would you like to convert to seconds?
    1
    86400
*/


import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
        // 1440 minutes in a day
        // 60 seconds 
        
        int totalMinutes = userInput * 1440;
        int totalSeconds = totalMinutes * 60;
        System.out.println(totalSeconds);

    }
}
