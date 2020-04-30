/*
    Write a program that reads names and ages from the user until an empty
    line is entered. The name and age are separated by a comma.

    After reading all user input, the program prints the age of the oldest person.
    You can assume that the user enters at least one person, and that one of the
    users is older than the others.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Boolean askUser = true;        
        ArrayList<String> namesList = new ArrayList<> ();
        while(askUser) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                askUser = false;
            } else {
                namesList.add(input);
            }
        }
        
        int ageOfOldest = 0;
        for(int i = 0; i < namesList.size(); i++) {
            String person = namesList.get(i);
            String[] personArr = person.split(",");
            int age = Integer.valueOf(personArr[1]);
            String name = personArr[0];
            
            if(age > ageOfOldest) {
                ageOfOldest = age;
            }                        
        }
        
        System.out.println("Name of the oldest: " + ageOfOldest);
        
        
    }
}