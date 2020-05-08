import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        Person ball = joan;
        ball.growOlder();
        ball.growOlder();

        System.out.println(joan);

        joan = new Person("Joan B.");
        System.out.println(joan);
        
        System.out.println(ball);
    }
}