import java.util.Scanner;

// Import scanner tool for reading user input
public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Exit? (y = yes)");
            String res = scanner.nextLine();
            
            if(res.equals("y")) {
                break;
            }
            
            System.out.println("keep going");
            
        }
        
        System.out.println("out");
    }
}
