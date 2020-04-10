
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        
        String userInput = scanner.nextLine();
        
        double dub = Double.valueOf(userInput);
        
        System.out.println("You gave the number " + dub);
        

    }
}
