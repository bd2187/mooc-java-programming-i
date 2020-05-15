import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        }
        
        String foo = "hello";
        
        System.out.println(foo.length());
    }
}