/*
Give a string:
    bye-bye
Give an integer:
    11
Give a double:
    4.2
Give a boolean:
    true
You gave the string bye-bye
You gave the integer 11
You gave the double 4.2
You gave the boolean true
*/

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String userStr = scan.nextLine();
        
        System.out.println("Give an integer:");
        int userInt = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double userDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean userBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + userStr);
        System.out.println("You gave the integer " + userInt);
        System.out.println("You gave the double " + userDouble);
        System.out.println("You gave the boolean " + userBoolean);

    }
}
