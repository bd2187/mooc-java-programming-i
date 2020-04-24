import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList {
    public static void main(String[] args)  {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<> ();
        while(true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            } else {
                numbers.add(input);
            }
        }
        
        int greatestNumber = 0;
        
        for(int i = 0; i < numbers.size(); i++) {           
            if(numbers.get(i) > greatestNumber) {
                greatestNumber = numbers.get(i);
            }
        }
        
        System.out.println("The greatest number is: " + greatestNumber);
        
        
    }
}