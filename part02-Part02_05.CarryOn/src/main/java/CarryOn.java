
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Carry on?");
            String res = scanner.nextLine();
            
            if(res.equals("no")) {
                break;
            }
            
        }       

    }
}
