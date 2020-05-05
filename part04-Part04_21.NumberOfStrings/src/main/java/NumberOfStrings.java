
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        Boolean askUser = true;
        while(askUser) {
            String input = scanner.nextLine();    
            
            if(input.equals("end")) {
                break;
            }
            
            count++;
        }
        
        System.out.println(count);
        
        
    }
}
