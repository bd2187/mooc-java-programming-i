
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        
        ArrayList<Integer> numbers = new ArrayList<> ();
        numbers.add(10);
        numbers.add(29);
        numbers.add(6);
        
        sum(numbers);
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        
        int sum = 0;
        for(Integer number: numbers) {
            sum += number;
        }
                
        return sum;
    }

}
