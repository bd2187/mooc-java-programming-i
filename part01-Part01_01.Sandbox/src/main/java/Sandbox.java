import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        Person bob = new Person("bob");
        
        
        String name = bob.getName();
        
        System.out.println(name);
        
        name = "foo";
        
        System.out.println(name);
        
    }
}