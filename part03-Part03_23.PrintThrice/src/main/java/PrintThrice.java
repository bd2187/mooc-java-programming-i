
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String input = scanner.nextLine();
        
        int index = 0;
        String str = "";
        while(index < 3) {
            str += input;
            index++;
        }
        
        System.out.println(str);

    }
}
