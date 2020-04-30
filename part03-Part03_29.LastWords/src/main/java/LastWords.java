
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Boolean askUser = true;
        
        while(askUser) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                askUser = false;
            } else {
                String[] arr = input.split(" ");
                System.out.println((arr[arr.length - 1]));
            }
        }

    }
}
