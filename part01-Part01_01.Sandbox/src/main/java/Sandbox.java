import java.util.Scanner;

// Import scanner tool for reading user input
public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String greeting = "hello, ";
        System.out.println("write name: ");
        
        String name = scanner.nextLine();
        
        System.out.println(greeting + name);
        
        
         
        
    }
}
