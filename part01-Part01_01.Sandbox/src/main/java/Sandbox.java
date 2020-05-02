import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        Person bob = new Person("bob");
        
        bob.printInfo();
        
        bob.updateAge(50);
        
        bob.printInfo();
        
    }
}