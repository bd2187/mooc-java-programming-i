/*
    Modify the program so that after reading the numbers
    it calculates and prints the sum of the numbers in the list.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class SumOfAList { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<> ();
        while(true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            } else {
                
                numbers.add(number);
                
            }
        }
        
        int sum = 0;
        for(Integer number: numbers) {
            sum += number;
        }
        
        System.out.println("Sum: " + sum);
        
    }
}