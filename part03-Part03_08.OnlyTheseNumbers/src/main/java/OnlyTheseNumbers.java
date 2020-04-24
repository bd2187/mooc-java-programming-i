import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers{
    public static void main(String[] args) {
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
        
        System.out.println("From where?");
        Integer startingIndex = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        Integer endIndex = Integer.valueOf(scanner.nextLine());
        
        System.out.println(numbers.get(startingIndex));
        System.out.println(numbers.get(endIndex));
    }
}