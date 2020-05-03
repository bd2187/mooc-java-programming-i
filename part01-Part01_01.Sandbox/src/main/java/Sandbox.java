import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        Person bob = new Person("bob");
        
        
        
        int age = bob.updateAge();
        
        
        System.out.println(bob);
        
    }
}