
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Boolean askUser = true;
        
        while(askUser) {
            
            String input = scanner.nextLine();
            
            if(input.equals("end")) {
                break;
            }
            
            int num = Integer.valueOf(input);
            int cube = num * num * num;
            
            System.out.println(cube);
            
        }
    }
}
