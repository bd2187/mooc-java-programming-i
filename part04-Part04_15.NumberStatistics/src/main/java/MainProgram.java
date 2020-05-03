
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
        System.out.println("Enter numbers:");               
        
        Boolean askUser = true;        
        while(askUser) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            } else {
                
                if(input % 2 == 0) {                   
                    evenNumbers.addNumber(input);
                } else {
                    oddNumbers.addNumber(input);
                }
                
                statistics.addNumber(input);    
                
                
            }
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
