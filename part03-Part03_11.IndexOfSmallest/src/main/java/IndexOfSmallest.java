import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> numbers = new ArrayList<> ();
        
        while(true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            
            if(number == 9999) {
                
                break;
                
            } else {
                
                numbers.add(number);
                
            }
        }
        
        int smallestNumber = 9999;       
        int indexOfSmallestNumber = 0;
        
        for(int i = 0; i < numbers.size(); i++ ){
            if(numbers.get(i) < smallestNumber) {
                smallestNumber = numbers.get(i);
                indexOfSmallestNumber = i;
            }
        }
        
        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + indexOfSmallestNumber);

        
    }
}
