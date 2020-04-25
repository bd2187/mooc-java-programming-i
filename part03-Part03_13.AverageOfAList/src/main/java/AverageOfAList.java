
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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
        
        double avg = (double) sum / numbers.size();
        
        System.out.println("Average: " + avg);
        
    }
}
